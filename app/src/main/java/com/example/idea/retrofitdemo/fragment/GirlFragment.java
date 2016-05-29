package com.example.idea.retrofitdemo.fragment;

import android.os.Bundle;
import android.support.v4.app.DialogFragment;
import android.support.v4.widget.SwipeRefreshLayout;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.StaggeredGridLayoutManager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.idea.retrofitdemo.R;
import com.example.idea.retrofitdemo.adapter.GirlRecycleAdapter;
import com.example.idea.retrofitdemo.base.BaseFragment;
import com.example.idea.retrofitdemo.mode.GirlMode;
import com.example.idea.retrofitdemo.presenter.GirlPresenterImp;
import com.example.idea.retrofitdemo.view.DataView;
import com.example.idea.retrofitdemo.widget.OnRecyclerItemClickListener;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by IDEA on 2016/5/29.
 */

public class GirlFragment extends BaseFragment implements DataView, SwipeRefreshLayout.OnRefreshListener {

    private RecyclerView mRecyclerView;
    private SwipeRefreshLayout mRefreshLayout;
    private GirlRecycleAdapter mGirlRecycleAdapter;
    private StaggeredGridLayoutManager mLayoutManager;
    private List<GirlMode.GirlBean> girlList = new ArrayList<>();
    private boolean mIsFirstTouchedBottom=true;
    private int page = 1;
    private GirlPresenterImp mGirlPresenterImp;


    @Override
    public View inflaterRootView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return View.inflate(getActivity(), R.layout.fra_girl, null);
    }

    @Override
    public void initView(View rootView) {
        mRefreshLayout = (SwipeRefreshLayout) rootView.findViewById(R.id.sw_layout);
        // 进入之后先加载，故refresh
        mRefreshLayout.measure(View.MEASURED_SIZE_MASK, View.MEASURED_HEIGHT_STATE_SHIFT);
        mRecyclerView = (RecyclerView) rootView.findViewById(R.id.recycle_view);

        mLayoutManager = new StaggeredGridLayoutManager(2, StaggeredGridLayoutManager.VERTICAL);
        mRecyclerView.addOnScrollListener(getOnBottomListener(mLayoutManager));
        mRefreshLayout.setOnRefreshListener(this);
        mRecyclerView.addOnItemTouchListener(new OnRecyclerItemClickListener(mRecyclerView) {
            @Override
            public void onItemClick(RecyclerView.ViewHolder viewHolder) {

                GirlPhotoFragment girlPhotoFragment = GirlPhotoFragment.newInstance(girlList.get(viewHolder.getAdapterPosition()).url, "");
                girlPhotoFragment.setStyle(DialogFragment.STYLE_NORMAL, R.style.Dialog_FullScreen);
                girlPhotoFragment.show(getFragmentManager(), "");
            }

            @Override
            public void onLongClick(RecyclerView.ViewHolder viewHolder) {

            }
        });
    }

    @Override
    public void initData() {
        mGirlPresenterImp = new GirlPresenterImp(getActivity());
        mGirlPresenterImp.attachView(this);
        onRefresh();


    }


    @Override
    public void loadData(GirlMode girlMode) {
        List<GirlMode.GirlBean> results = girlMode.results;
        if (results.size() == 10) {
            page++;
        }
        girlList.addAll(results);
        if (mGirlRecycleAdapter == null) {
            mGirlRecycleAdapter = new GirlRecycleAdapter(getActivity(), girlList);
            mRecyclerView.setLayoutManager(mLayoutManager);
            mRecyclerView.setAdapter(mGirlRecycleAdapter);
        } else {
            mGirlRecycleAdapter.notifyDataSetChanged();
        }

        mRefreshLayout.setRefreshing(false);
    }


    RecyclerView.OnScrollListener getOnBottomListener(final StaggeredGridLayoutManager layoutManager) {
        RecyclerView.OnScrollListener bottomListener = new RecyclerView.OnScrollListener() {
            @Override
            public void onScrolled(RecyclerView recyclerView, int dx, int dy) {
                int[] lastVisiblePositions = new int[2];
                lastVisiblePositions = layoutManager.findLastCompletelyVisibleItemPositions(lastVisiblePositions);
                int right = lastVisiblePositions[1];
                boolean isBottom = right > mGirlRecycleAdapter.getItemCount() - 7;
                if (isBottom && !mRefreshLayout.isRefreshing()) {
                    if (!mIsFirstTouchedBottom) {
                        onRefresh();
                    } else mIsFirstTouchedBottom = false;

                }
            }
        };
        return bottomListener;
    }

    public void onRefresh() {
        mRefreshLayout.setRefreshing(true);

        mGirlPresenterImp.loadDate(page);
    }
}

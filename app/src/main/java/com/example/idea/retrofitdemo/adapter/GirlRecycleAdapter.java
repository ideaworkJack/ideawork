package com.example.idea.retrofitdemo.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;

import com.bumptech.glide.Glide;
import com.example.idea.retrofitdemo.R;
import com.example.idea.retrofitdemo.mode.GirlMode;
import com.example.idea.retrofitdemo.widget.RatioImageview;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by IDEA on 2016/5/29.
 */

public class GirlRecycleAdapter extends RecyclerView.Adapter<AdapterHolder> {


    List<GirlMode.GirlBean> mGirlsList;
    Context context;

    public GirlRecycleAdapter(Context context, List<GirlMode.GirlBean> girlsList) {
        this.context = context;
        if (girlsList == null) {
            mGirlsList = new ArrayList<>();
        }
        mGirlsList = girlsList;
    }

    @Override
    public AdapterHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        return new AdapterHolder(View.inflate(context, R.layout.gril_layout, null));
    }

    @Override
    public void onBindViewHolder(AdapterHolder holder, int position) {
        GirlMode.GirlBean girlBean = mGirlsList.get(position);
        holder.setText(R.id.tv_date, girlBean.desc);
        RatioImageview view = holder.getView(R.id.iv_girl);
        Glide.with(context).load(girlBean.url).into(view);

    }

    @Override
    public int getItemCount() {
        return mGirlsList.size();
    }
}

package com.example.idea.retrofitdemo.presenter;

import android.content.Context;

import com.example.idea.retrofitdemo.api.GirlsService;
import com.example.idea.retrofitdemo.api.InitRetrofit;
import com.example.idea.retrofitdemo.base.BasePresenter;
import com.example.idea.retrofitdemo.mode.GirlMode;
import com.example.idea.retrofitdemo.view.DataView;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

/**
 * Created by IDEA on 2016/5/29.
 */

public class GirlPresenterImp extends BasePresenter<DataView> {


    Context mContext;
    private GirlMode girlMode;

    public GirlPresenterImp(Context context) {
        mContext = context;
    }

    @Override
    public void attachView(DataView mvpView) {
        super.attachView(mvpView);

    }

    @Override
    public void detachView() {
        super.detachView();
    }

    public void loadDate(int page) {
        loadGirlsEntity(page);
    }

    private void loadGirlsEntity(int page) {
        Call<GirlMode> girls = InitRetrofit.createApi(GirlsService.class).getGirls(page);
        girls.enqueue(new Callback<GirlMode>() {
            @Override
            public void onResponse(Call<GirlMode> call, Response<GirlMode> response) {
                girlMode=response.body();
//                response
                updateData();
            }

            @Override
            public void onFailure(Call<GirlMode> call, Throwable t) {
//getMvpView().showError(t.getMessage(),);
            }
        });

    }


    public void updateData() {
        getMvpView().loadData(girlMode);
    }
}

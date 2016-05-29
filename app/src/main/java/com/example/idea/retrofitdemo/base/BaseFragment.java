package com.example.idea.retrofitdemo.base;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.idea.retrofitdemo.loading.MyLoading;
import com.example.idea.retrofitdemo.view.MvpView;

/**
 * Created by IDEA on 2016/5/29.
 */

public abstract class BaseFragment extends Fragment implements MvpView{
    MyLoading myLoading;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View rootView = inflaterRootView(inflater, container, savedInstanceState);
        initView(rootView);
        initData();
        return rootView;
    }

    public void initView(View rootView) {

    }

    public void initData() {
    }

    public abstract View inflaterRootView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) ;



    public void setMyLoading(MyLoading myLoading) {
        this.myLoading = myLoading;
    }
    @Override
    public void startLoading() {
        myLoading.start();
    }

    @Override
    public void hideLoading() {
        myLoading.stop();
        myLoading.setVisibility(View.GONE);
    }


    @Override
    public void showError(String errorMsg, View.OnClickListener listener) {

    }
}

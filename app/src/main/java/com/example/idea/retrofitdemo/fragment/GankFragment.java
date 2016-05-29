package com.example.idea.retrofitdemo.fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.idea.retrofitdemo.R;
import com.example.idea.retrofitdemo.base.BaseFragment;

/**
 * Created by IDEA on 2016/5/29.
 */

public class GankFragment extends BaseFragment {
    @Override
    public View inflaterRootView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return View.inflate(getActivity(),R.layout.fra_girl, null);
    }

    @Override
    public void initView(View rootView) {

    }

    @Override
    public void initData() {

    }
}

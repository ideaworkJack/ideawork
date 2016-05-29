package com.example.idea.retrofitdemo.view;

import android.view.View;

/**
 * Created by IDEA on 2016/5/29.
 */

public interface MvpView {
    void startLoading();

    void hideLoading();

    void showError(String errorMsg, View.OnClickListener listener);
}

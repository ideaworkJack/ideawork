package com.example.idea.retrofitdemo.presenter;

import com.example.idea.retrofitdemo.view.MvpView;

/**
 * Created by IDEA on 2016/5/29.
 */

public interface Presenter<V extends MvpView> {

    void attachView(V mvpView);

    void detachView();

}

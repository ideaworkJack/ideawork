package com.example.idea.retrofitdemo.base;

import com.example.idea.retrofitdemo.presenter.Presenter;
import com.example.idea.retrofitdemo.view.MvpView;

/**
 * Created by IDEA on 2016/5/29.
 */

public class BasePresenter<T extends MvpView> implements Presenter<T> {
    private T mvpView;


    @Override
    public void attachView(T mvpView) {
        this.mvpView=mvpView;
    }

    @Override
    public void detachView() {
        mvpView = null;
    }

    public boolean isViewAttached() {
        return mvpView != null;
    }

    public T getMvpView() {
        return mvpView;
    }

    public void checkViewAttached() {
        if (!isViewAttached()) throw new MvpViewNotAttachedException();
    }


    public static class MvpViewNotAttachedException extends RuntimeException{
        public MvpViewNotAttachedException(){
            super("Please call Presenter.attachView(MvpView) before" +
                    " requesting data to the Presenter");
        }
    }
}

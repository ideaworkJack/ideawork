package com.example.idea.retrofitdemo.view;

import com.example.idea.retrofitdemo.mode.GirlMode;

/**
 * Created by IDEA on 2016/5/29.
 */

public interface DataView extends MvpView {
    void loadData(GirlMode girlMode);

}

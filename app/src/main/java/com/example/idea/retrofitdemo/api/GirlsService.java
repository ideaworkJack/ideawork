package com.example.idea.retrofitdemo.api;

import com.example.idea.retrofitdemo.mode.GirlMode;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

/**
 * Created by IDEA on 2016/5/29.
 */

public interface GirlsService {
    @GET("data/福利/10/{page}")
    Call<GirlMode> getGirls(@Path("page")int page);

}

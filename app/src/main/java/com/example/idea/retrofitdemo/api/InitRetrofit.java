package com.example.idea.retrofitdemo.api;

import com.example.idea.retrofitdemo.config.IpAddress;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by IDEA on 2016/5/29.
 */

public class InitRetrofit {
    public static Retrofit sRetrofit = new Retrofit.Builder().
            baseUrl(IpAddress.GIRLSURL).
            addConverterFactory(GsonConverterFactory.create())
            .build();


    public static <T> T createApi(Class<T> mClass){

        return sRetrofit.create(mClass);
    }
}

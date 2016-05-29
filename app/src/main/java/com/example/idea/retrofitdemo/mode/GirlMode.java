package com.example.idea.retrofitdemo.mode;

import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * Created by IDEA on 2016/5/29.
 */

public class GirlMode {


    /**
     * error : false
     * results : [{"_id":"5747be9c67765923298b5c8b","createdAt":"2016-05-27T11:27:24.288Z","desc":"夏天来了宝宝们","publishedAt":"2016-05-27T11:56:22.790Z","source":"chrome","type":"福利","url":"http://ww4.sinaimg.cn/large/610dc034jw1f49s6i5pg7j20go0p043b.jpg","used":true,"who":"代码家"},{"_id":"5746702e6776594b0d64dc49","createdAt":"2016-05-26T11:40:30.357Z","desc":"5.26","publishedAt":"2016-05-26T11:52:42.430Z","source":"chrome","type":"福利","url":"http://ww3.sinaimg.cn/large/610dc034jw1f48mxqcvkvj20lt0pyaed.jpg","used":true,"who":"daimajia "},{"_id":"57451a706776594b0bcff794","createdAt":"2016-05-25T11:22:24.607Z","desc":"5.25","publishedAt":"2016-05-25T11:50:54.367Z","source":"chrome","type":"福利","url":"http://ww4.sinaimg.cn/large/610dc034jw1f47gspphiyj20ia0rf76w.jpg","used":true,"who":"代码家"},{"_id":"5743cde9677659453b01369a","createdAt":"2016-05-24T11:43:37.996Z","desc":"5.24","publishedAt":"2016-05-24T11:56:12.924Z","source":"chrome","type":"福利","url":"http://ww4.sinaimg.cn/large/610dc034jw1f46bsdcls2j20sg0izac0.jpg","used":true,"who":"daimajia"},{"_id":"57426fbb6776590a0b0fe26d","createdAt":"2016-05-23T10:49:31.552Z","desc":"5.23","publishedAt":"2016-05-23T10:54:25.890Z","source":"chrome","type":"福利","url":"http://ww2.sinaimg.cn/large/610dc034jw1f454lcdekoj20dw0kumzj.jpg","used":true,"who":"代码家"},{"_id":"573e6c776776591ca2f31ba5","createdAt":"2016-05-20T09:46:31.535Z","desc":"昨天妹子的正脸","publishedAt":"2016-05-20T10:05:09.959Z","source":"chrome","type":"福利","url":"http://ww4.sinaimg.cn/large/610dc034jw1f41lxgc3x3j20jh0tcn14.jpg","used":true,"who":"代码家"},{"_id":"573d39ea6776591ca681f8c7","createdAt":"2016-05-19T11:58:34.715Z","desc":"5.19","publishedAt":"2016-05-19T12:09:29.617Z","source":"chrome","type":"福利","url":"http://ww3.sinaimg.cn/large/610dc034jw1f40k4dyrhhj20iz0sg41b.jpg","used":true,"who":"daimajia"},{"_id":"573be98f6776591c9fd0cd5f","createdAt":"2016-05-18T12:03:27.865Z","desc":"518","publishedAt":"2016-05-18T12:18:37.235Z","source":"chrome","type":"福利","url":"http://ww4.sinaimg.cn/large/610dc034jw1f3zen8idmkj20dw0kun0i.jpg","used":true,"who":"daimajia"},{"_id":"573a99ee6776591ca681f89f","createdAt":"2016-05-17T12:11:26.506Z","desc":"5.17","publishedAt":"2016-05-17T12:17:17.785Z","source":"chrome","type":"福利","url":"http://ww1.sinaimg.cn/large/7a8aed7bjw1f3y998rv5uj20m80vxq6c.jpg","used":true,"who":"张涵宇"},{"_id":"573943c06776591ca2f31b55","createdAt":"2016-05-16T11:51:28.480Z","desc":"5.16","publishedAt":"2016-05-16T11:58:08.802Z","source":"chrome","type":"福利","url":"http://ww4.sinaimg.cn/large/610dc034jw1f3x32bd1hcj20d90k03zx.jpg","used":true,"who":"daimajia"}]
     */

    @SerializedName("error")
    public boolean error;
    /**
     * _id : 5747be9c67765923298b5c8b
     * createdAt : 2016-05-27T11:27:24.288Z
     * desc : 夏天来了宝宝们
     * publishedAt : 2016-05-27T11:56:22.790Z
     * source : chrome
     * type : 福利
     * url : http://ww4.sinaimg.cn/large/610dc034jw1f49s6i5pg7j20go0p043b.jpg
     * used : true
     * who : 代码家
     */

    @SerializedName("results")
    public List<GirlBean> results;

    public static class GirlBean {
        @SerializedName("_id")
        public String id;
        @SerializedName("createdAt")
        public String createdAt;
        @SerializedName("desc")
        public String desc;
        @SerializedName("publishedAt")
        public String publishedAt;
        @SerializedName("source")
        public String source;
        @SerializedName("type")
        public String type;
        @SerializedName("url")
        public String url;
        @SerializedName("used")
        public boolean used;
        @SerializedName("who")
        public String who;
    }
}

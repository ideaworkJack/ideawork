package com.example.idea.retrofitdemo.adapter;

import android.graphics.Bitmap;
import android.support.v7.widget.RecyclerView;
import android.util.SparseArray;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * 万能Adapter
 * <b>创建时间</b> 2016/4/7 <br>
 *
 */
public class AdapterHolder extends RecyclerView.ViewHolder {
    private final SparseArray<View> mViews;
      private final View mConvertView;


    public AdapterHolder(View itemView) {
        super(itemView);
        this.mViews = new SparseArray<View>();
        mConvertView = itemView;
        // setTag
        mConvertView.setTag(this);
    }

    public <T extends View> T getView(int viewId) {
        View view = mViews.get(viewId);
        if (view == null) {
            view = mConvertView.findViewById(viewId);
            mViews.put(viewId, view);
        }
        return (T) view;
    }

    public AdapterHolder setText(int viewId, CharSequence text) {
        TextView view = getView(viewId);
        view.setText(text);
        return this;
    }

    public AdapterHolder setImageResource(int viewId, int drawableId) {
        ImageView view = getView(viewId);
        view.setImageResource(drawableId);

        return this;
    }
    public AdapterHolder setImageBitmap(int viewId, Bitmap bm) {
        ImageView view = getView(viewId);
        view.setImageBitmap(bm);
        return this;
    }

}

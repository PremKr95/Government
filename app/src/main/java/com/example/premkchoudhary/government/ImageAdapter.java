package com.example.premkchoudhary.government;

import android.content.Context;
import android.database.DataSetObserver;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.ListAdapter;
import android.widget.TextView;

/**
 * Created by Premk.Choudhary on 04-08-2017.
 */

public class ImageAdapter extends BaseAdapter {
    private Context mContext;
    public ImageAdapter(Context c) {
        mContext = c;
    }

    @Override
    public boolean areAllItemsEnabled() {
        return false;
    }

    @Override
    public boolean isEnabled(int position) {
        return false;
    }

    @Override
    public void registerDataSetObserver(DataSetObserver observer) {

    }

    @Override
    public void unregisterDataSetObserver(DataSetObserver observer) {

    }

    @Override
    public int getCount() {
        return mThumbIds.length;
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        View gridview;
        LayoutInflater inflater = (LayoutInflater)mContext.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        if (view == null) {
            // if it's not recycled, initialize some attributes
            gridview =new View(mContext);
            gridview = inflater.inflate(R.layout.grid_layout,null);
            ImageView ivimage = (ImageView) gridview.findViewById(R.id.ivset);
            TextView textView = (TextView) gridview.findViewById(R.id.tvset);

            textView.setText(stringarray[i]);
            ivimage.setImageResource(mThumbIds[i]);
        }
        else{
            gridview = (View) view;
        }
        return gridview;
    }

    private Integer[] mThumbIds = {
            R.mipmap.ic_launcher, R.mipmap.ic_launcher,
            R.mipmap.ic_launcher, R.mipmap.ic_launcher,
            R.mipmap.ic_launcher, R.mipmap.ic_launcher,
            R.mipmap.ic_launcher, R.mipmap.ic_launcher
    };

    private String[] stringarray = {"First" ,"second" ,"third" , "fourth" ,"fivth" ,"sixth" ,"seventh" ,"eight"};


}

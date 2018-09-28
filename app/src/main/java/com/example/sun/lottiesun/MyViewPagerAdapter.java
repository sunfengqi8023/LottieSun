package com.example.sun.lottiesun;

import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.view.View;
import android.view.ViewGroup;

import java.util.List;

/**
 * Copyright (c) 2016. 东华博育云有限公司 Inc. All rights reserved.
 * com.example.sun.lottiesun
 * 作者：Created by sfq on 2018/9/28.
 * 联系方式：sunfengqi8023@163.com
 * 功能描述：
 * 修改：无
 */
public class MyViewPagerAdapter extends PagerAdapter {

    private List<View> views;
    public MyViewPagerAdapter( List<View> views){
        this.views = views;

    }

    @Override
    public Object instantiateItem(ViewGroup container, int position) {
        ((ViewPager)container).addView(views.get(position));
        return views.get(position);
    }

    @Override
    public void destroyItem(ViewGroup container, int position, Object object) {
        ((ViewPager)container).removeView(views.get(position));
    }
    @Override
    public int getCount() {
        return views.size();
    }

    @Override
    public boolean isViewFromObject(View view, Object object) {
        return view==object;
    }
}

package com.example.sun.lottiesun;

import android.app.Activity;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.LayoutInflater;
import android.view.View;

import com.airbnb.lottie.LottieAnimationView;

import java.util.ArrayList;
import java.util.List;

public class GuideActivity extends Activity implements ViewPager.OnPageChangeListener {

    private ViewPager viewPager;
    private MyViewPagerAdapter myViewPagerAdapter;
    private List<View> views;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_guide);
        viewPager = (ViewPager) findViewById(R.id.viewpager);
        views = new ArrayList<View>();
        //获取布局加载器
        LayoutInflater layoutInflater = LayoutInflater.from(this);
        //加载布局并且将布局添加到视图中去
        addView(layoutInflater);
        //创建设配器
        myViewPagerAdapter = new MyViewPagerAdapter(views);
        //绑定设配器
        viewPager.setAdapter(myViewPagerAdapter);
        viewPager.addOnPageChangeListener(this);

    }

    //下面这三个方法是实现页面活动的监听器
    @Override
    public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {
    }

    @Override
    public void onPageSelected(int position) {

        ((LottieAnimationView)(views.get(position).findViewById(R.id.guide_item))).playAnimation();
    }

    @Override
    public void onPageScrollStateChanged(int state) {

    }

    private void addView(LayoutInflater layoutInflater) {
        View guide1 = layoutInflater.inflate(R.layout.activity_guide_item, null);
        LottieAnimationView l1 = guide1.findViewById(R.id.guide_item);
        l1.setAnimation("shooting_stars1.json");
        l1.playAnimation();
        views.add(guide1);


        View guide2 = layoutInflater.inflate(R.layout.activity_guide_item, null);
        LottieAnimationView l2 = guide2.findViewById(R.id.guide_item);
        l2.setAnimation("ofrenda2.json");
        views.add(guide2);

        View guide3 = layoutInflater.inflate(R.layout.activity_guide_item, null);
        LottieAnimationView l3 = guide3.findViewById(R.id.guide_item);
        l3.setAnimation("thumbs_up3.json");
        views.add(guide3);
    }
}

package com.example.sun.lottiesun;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.airbnb.lottie.LottieAnimationView;

public class MainActivity extends Activity implements View.OnClickListener {

    //顶部的常驻动画
    private LottieAnimationView lottie_header;
    //切换按钮
    private LottieAnimationView tg_tg;
    //提交按钮
    private LottieAnimationView btn_submit;
    private LottieAnimationView btn_emoji;
    private Button btn_guide;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
    }

    private void initView() {
        lottie_header = (LottieAnimationView) findViewById(R.id.lottie_header);
        tg_tg = (LottieAnimationView) findViewById(R.id.tg_tg);
        btn_submit = (LottieAnimationView) findViewById(R.id.btn_submit);
        btn_emoji = (LottieAnimationView) findViewById(R.id.btn_emoji);

        tg_tg.setOnClickListener(this);
        btn_submit.setOnClickListener(this);
        btn_emoji.setOnClickListener(this);


        btn_guide = (Button) findViewById(R.id.btn_guide);
        btn_guide.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.tg_tg:
                //点击以后。状态直接切换成功
                tg_tg.playAnimation();

                break;
            case R.id.btn_submit:
                //提交按钮，需要控制一下动画的时间
                btn_submit.playAnimation();
                break;
            case R.id.btn_emoji:
                btn_emoji.playAnimation();
                break;
            case R.id.btn_guide:
                startActivity(new Intent(this,GuideActivity.class));
                break;
            default:
                break;
        }
    }
}

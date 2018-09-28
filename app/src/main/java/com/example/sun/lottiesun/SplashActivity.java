package com.example.sun.lottiesun;

import android.animation.Animator;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;

import com.airbnb.lottie.LottieAnimationView;

public class SplashActivity extends Activity {

    private LottieAnimationView splash;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        initView();
    }

    private void initView() {
        splash = (LottieAnimationView) findViewById(R.id.splash);

        splash.playAnimation();
        splash.addAnimatorListener(new Animator.AnimatorListener() {
            @Override
            public void onAnimationStart(Animator animation) {
                //动画开始
            }

            @Override
            public void onAnimationEnd(Animator animation) {
                //动画结束后跳转
                SplashActivity.this.startActivity(new Intent(SplashActivity.this,MainActivity.class));
                finish();

            }

            @Override
            public void onAnimationCancel(Animator animation) {

            }

            @Override
            public void onAnimationRepeat(Animator animation) {

            }
        });
    }
}

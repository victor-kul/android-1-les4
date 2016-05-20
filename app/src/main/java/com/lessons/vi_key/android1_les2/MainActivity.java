package com.lessons.vi_key.android1_les2;

import android.content.Intent;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.view.animation.Interpolator;
import android.view.animation.OvershootInterpolator;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;


import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;

/**
 * Created by vi-key on 13.05.2016.
 */
public class MainActivity extends AppCompatActivity {

    private ViewPager mPager;
    private PagerAdapter mPagerAdapter;

        @Override
        protected void onCreate(Bundle savedInstanceState) {


            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_main);
    //        getSupportActionBar().setTitle(R.string.);

            mPager = (ViewPager) findViewById(R.id.pager);
            mPagerAdapter = new ScreenSlidePagerAdapter(getSupportFragmentManager());
            mPager.setAdapter(mPagerAdapter);
            mPager.setOffscreenPageLimit(2);





        }

        //    public void onClick(View v){
        //        Intent intent;
        //    }
        private class ScreenSlidePagerAdapter extends FragmentStatePagerAdapter {

            public ScreenSlidePagerAdapter(FragmentManager fm) {
                super(fm);
            }

            @Override
            public Fragment getItem(int position) {

                Fragment fragment = null;
                switch (position) {
                    case 0:
                        fragment = new PageMain();
                        break;
                    case 1:
                        fragment = new PageSecond();
                        break;
                    default:
                }
                return fragment;
            }


            @Override
            public int getCount() {
                return 2;
            }
        }




}
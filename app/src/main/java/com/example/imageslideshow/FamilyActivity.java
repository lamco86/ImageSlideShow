package com.example.imageslideshow;

import androidx.viewpager.widget.ViewPager;

import android.app.Activity;

import android.content.Intent;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;


public class FamilyActivity extends Activity {

    MediaPlayer mp;
    private int[] mAudioIds = new int[] {
            R.raw.elliot,
            R.raw.oliver,
            R.raw.elliot,
            R.raw.mum,
            R.raw.oliver,
            R.raw.elliot,
            R.raw.oliver,
            R.raw.dad,
            R.raw.elliot,
            R.raw.oliver
    };
    public int[] mImageIds = new int[] {
            R.drawable.elliot01,
            R.drawable.oliver01,
            R.drawable.elliot02,
            R.drawable.mum01,
            R.drawable.oliver02,
            R.drawable.elliot03,
            R.drawable.oliver03,
            R.drawable.dad01,
            R.drawable.elliot04,
            R.drawable.oliver04
    };


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_family);

        Intent intent = getIntent();

        ViewPager viewPager = (ViewPager)findViewById(R.id.viewPager);
        ImageAdapter adapter = new ImageAdapter(this, mImageIds, mAudioIds);
        viewPager.addOnPageChangeListener(players);
        viewPager.setAdapter(adapter);

        mp = MediaPlayer.create(FamilyActivity.this, mAudioIds[0]);
        mp.start();
    }
    public void goHome(View view) {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }


    ViewPager.OnPageChangeListener players = new ViewPager.OnPageChangeListener() {

        @Override
        public void onPageSelected(int i) {
            mp = MediaPlayer.create(FamilyActivity.this, mAudioIds[i]);
            mp.start();
        }

        @Override
        public void onPageScrolled(int arg0, float arg1, int arg2)
        {
        }

        @Override
        public void onPageScrollStateChanged(int arg0)
        {
        }
    };

};


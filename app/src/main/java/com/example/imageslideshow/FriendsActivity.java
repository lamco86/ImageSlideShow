package com.example.imageslideshow;

import androidx.viewpager.widget.ViewPager;

import android.app.Activity;

import android.content.Intent;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;


public class FriendsActivity extends Activity {

    MediaPlayer mp;
    private int[] mAudioIds = new int[] {
            R.raw.ally,
            R.raw.audry,
            R.raw.haydn,
            R.raw.nora,
            R.raw.charlotte,
            R.raw.heston
    };
    public int[] mImageIds = new int[] {
            R.drawable.ali01,
            R.drawable.audrey01,
            R.drawable.haydn01,
            R.drawable.nora01,
            R.drawable.charlotte,
            R.drawable.heston
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

        mp = MediaPlayer.create(FriendsActivity.this, mAudioIds[0]);
        mp.start();
    }
    public void goHome(View view) {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }


    ViewPager.OnPageChangeListener players = new ViewPager.OnPageChangeListener() {

        @Override
        public void onPageSelected(int i) {
            mp = MediaPlayer.create(FriendsActivity.this, mAudioIds[i]);
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


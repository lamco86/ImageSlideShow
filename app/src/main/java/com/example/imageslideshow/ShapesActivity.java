package com.example.imageslideshow;

import androidx.viewpager.widget.ViewPager;

import android.app.Activity;

import android.content.Intent;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;


public class ShapesActivity extends Activity {

    MediaPlayer mp;
    private int[] mAudioIds = new int[] {
            R.raw.circle,
            R.raw.square,
            R.raw.dia,
            R.raw.heart,
            R.raw.oval,
            R.raw.rect,
            R.raw.tri,
            R.raw.pent
    };
    public int[] mImageIds = new int[] {
            R.drawable.sh_circle,
            R.drawable.sh_square,
            R.drawable.sh_dia,
            R.drawable.sh_heart,
            R.drawable.sh_oval,
            R.drawable.sh_rect,
            R.drawable.sh_triangle,
            R.drawable.sh_pent
    };


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_shapes);

        Intent intent = getIntent();

        ViewPager viewPager = (ViewPager)findViewById(R.id.viewPager);
        ImageAdapter adapter = new ImageAdapter(this, mImageIds, mAudioIds);
        viewPager.addOnPageChangeListener(players);
        viewPager.setAdapter(adapter);

        mp = MediaPlayer.create(ShapesActivity.this, mAudioIds[0]);
        mp.start();
    }
    public void goHome(View view) {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }


    ViewPager.OnPageChangeListener players = new ViewPager.OnPageChangeListener() {

        @Override
        public void onPageSelected(int i) {
            mp = MediaPlayer.create(ShapesActivity.this, mAudioIds[i]);
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


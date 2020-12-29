package com.example.imageslideshow;

import androidx.viewpager.widget.ViewPager;

import android.app.Activity;

import android.content.Intent;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;


public class FruitActivity extends Activity {

    MediaPlayer mp;
    private int[] mAudioIds = new int[] {
            R.raw.apple,
            R.raw.banana,
            R.raw.brocoli,
            R.raw.blueberries,
            R.raw.carrot,
           R.raw.corn,
            R.raw.cucumber,
            R.raw.eggplant,
            R.raw.kiwi,
            R.raw.grapes,
            R.raw.lemon,
            R.raw.mango,
            R.raw.milk,
            R.raw.fr_orange,
            R.raw.pear,
            R.raw.tomato,
            R.raw.water,
            R.raw.watermelon
    };
    public int[] mImageIds = new int[] {
            R.drawable.fr_apple,
            R.drawable.fr_banana,
            R.drawable.fr_broccoli,
            R.drawable.fr_blueberries,
            R.drawable.fr_carrot,
            R.drawable.fr_corn,
            R.drawable.fr_cucumber,
            R.drawable.fr_eggplant,
            R.drawable.fr_kiwi,
            R.drawable.fr_grapes,
            R.drawable.fr_lemon,
            R.drawable.fr_mango,
            R.drawable.milk,
            R.drawable.fr_orange,
            R.drawable.fr_pear,
            R.drawable.fr_tomato,
          R.drawable.water,
            R.drawable.fr_watermelon
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

        mp = MediaPlayer.create(FruitActivity.this, mAudioIds[0]);
        mp.start();
    }
    public void goHome(View view) {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }


    ViewPager.OnPageChangeListener players = new ViewPager.OnPageChangeListener() {

        @Override
        public void onPageSelected(int i) {
            mp = MediaPlayer.create(FruitActivity.this, mAudioIds[i]);
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


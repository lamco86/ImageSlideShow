package com.example.imageslideshow;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;

public class ColoursActivity extends AppCompatActivity {

    MediaPlayer mp;
    private int[] mAudioIds = new int[] {
            R.raw.red,
            R.raw.yellow,
            R.raw.pink,
            R.raw.green,
            R.raw.purple,
            R.raw.orange,
            R.raw.blue,
            R.raw.brown,
            R.raw.black,
            R.raw.white
    };
    public int[] mImageIds = new int[] {
            R.drawable.red,
            R.drawable.yellow,
            R.drawable.pink,
            R.drawable.green,
            R.drawable.purple,
            R.drawable.orange,
            R.drawable.blue,
            R.drawable.brown,
            R.drawable.black,
            R.drawable.white
    };
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_letters);

        Intent intent = getIntent();

        ViewPager viewPager = (ViewPager)findViewById(R.id.viewPager);
        ImageAdapter adapter = new ImageAdapter(this, mImageIds, mAudioIds);
        viewPager.addOnPageChangeListener(players);
        viewPager.setAdapter(adapter);

        mp = MediaPlayer.create(ColoursActivity.this, mAudioIds[0]);
        mp.start();
    }
    public void goHome(View view) {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }


    ViewPager.OnPageChangeListener players = new ViewPager.OnPageChangeListener() {

        @Override
        public void onPageSelected(int i) {
            mp = MediaPlayer.create(ColoursActivity.this, mAudioIds[i]);
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


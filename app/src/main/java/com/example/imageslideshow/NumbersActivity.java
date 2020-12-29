package com.example.imageslideshow;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;

public class NumbersActivity extends AppCompatActivity {

    MediaPlayer mp;
    private int[] mAudioIds = new int[] {
            R.raw.n0,
            R.raw.n1,
            R.raw.n2,
            R.raw.n3,
            R.raw.n4,
            R.raw.n5,
            R.raw.n6,
            R.raw.n7,
            R.raw.n8,
            R.raw.n9,
            R.raw.n10,
            R.raw.n11,
            R.raw.n12,
            R.raw.n13,
            R.raw.n14,
            R.raw.n15,
            R.raw.n16,
            R.raw.n17,
            R.raw.n18,
            R.raw.n19,
            R.raw.n20
    };
    public int[] mImageIds = new int[] {
            R.drawable.num_0,
            R.drawable.num_1,
            R.drawable.num_2,
            R.drawable.num_3,
            R.drawable.num_4,
            R.drawable.num_5,
            R.drawable.num_6,
            R.drawable.num_7,
            R.drawable.num_8,
            R.drawable.num_9,
            R.drawable.num_10,
            R.drawable.num_11,
            R.drawable.num_12,
            R.drawable.num_13,
            R.drawable.num_14,
            R.drawable.num_15,
            R.drawable.num_16,
            R.drawable.num_17,
            R.drawable.num_18,
            R.drawable.num_19,
            R.drawable.num_20

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

        mp = MediaPlayer.create(NumbersActivity.this, mAudioIds[0]);
        mp.start();
    }
    public void goHome(View view) {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }


    ViewPager.OnPageChangeListener players = new ViewPager.OnPageChangeListener() {

        @Override
        public void onPageSelected(int i) {
            mp = MediaPlayer.create(NumbersActivity.this, mAudioIds[i]);
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


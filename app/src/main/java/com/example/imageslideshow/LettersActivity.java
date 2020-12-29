package com.example.imageslideshow;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;

public class LettersActivity extends AppCompatActivity {

    MediaPlayer mp;
    private int[] mAudioIds = new int[] {
            R.raw.a,
            R.raw.b,
            R.raw.c,
            R.raw.d,
            R.raw.e,
            R.raw.f,
            R.raw.g,
            R.raw.h,
            R.raw.i,
            R.raw.j,
            R.raw.k,
            R.raw.l,
            R.raw.m,
            R.raw.n,
            R.raw.o,
            R.raw.p,
            R.raw.q,
            R.raw.r,
            R.raw.s,
            R.raw.t,
            R.raw.u,
            R.raw.v,
            R.raw.w,
            R.raw.x,
            R.raw.y,
            R.raw.z
    };
    public int[] mImageIds = new int[] {
            R.drawable.alpha_a,
            R.drawable.alpha_b,
            R.drawable.alpha_c,
            R.drawable.alpha_d,
            R.drawable.alpha_e,
            R.drawable.alpha_f,
            R.drawable.alpha_g,
            R.drawable.alpha_h,
            R.drawable.alpha_i,
            R.drawable.alpha_j,
            R.drawable.alpha_k,
            R.drawable.alpha_l,
            R.drawable.alpha_m,
            R.drawable.alpha_n,
            R.drawable.alpha_o,
            R.drawable.alpha_p,
            R.drawable.alpha_q,
            R.drawable.alpha_r,
            R.drawable.alpha_s,
            R.drawable.alpha_t,
            R.drawable.alpha_u,
            R.drawable.alpha_v,
            R.drawable.alpha_w,
            R.drawable.alpha_x,
            R.drawable.alpha_y,
            R.drawable.alpha_z

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

        mp = MediaPlayer.create(LettersActivity.this, mAudioIds[0]);
        mp.start();
    }
    public void goHome(View view) {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }


    ViewPager.OnPageChangeListener players = new ViewPager.OnPageChangeListener() {

        @Override
        public void onPageSelected(int i) {
            mp = MediaPlayer.create(LettersActivity.this, mAudioIds[i]);
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


package com.example.imageslideshow;

import android.content.Context;
import android.media.MediaPlayer;
import android.provider.MediaStore;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.Switch;

import androidx.annotation.NonNull;
import androidx.viewpager.widget.PagerAdapter;
import androidx.viewpager.widget.ViewPager;

import java.util.ArrayList;


public class ImageAdapter extends PagerAdapter {
    private Context mContext;
    int imgArray[];
    int audArray[];

    MediaPlayer sound;
    ImageAdapter(Context context, int[] args1, int[] args2) {

        mContext = context;
        this.imgArray = args1;
        this.audArray = args2;
    }

    @Override
    public int getCount() {
        return imgArray.length;
    }

    @Override
    public boolean isViewFromObject(@NonNull View view, @NonNull Object object) {
        return view == object;
    }

    @NonNull
    @Override
    public Object instantiateItem(@NonNull ViewGroup container, final int position) {

        final ImageView imageView = new ImageView(mContext);
        imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
        imageView.setImageResource(imgArray[position]);
        container.addView(imageView,0);
        /*imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                sound = MediaPlayer.create(mContext, audArray[position]);
                imageView.setClickable(false);
                sound.start();

                sound.setOnCompletionListener(new MediaPlayer.OnCompletionListener()
                {
                    @Override
                    public void onCompletion(MediaPlayer mp)
                    {
                        imageView.setClickable(true);
                    }
                });
            }
        });*/

        return imageView;
    }

    @Override
    public void destroyItem(@NonNull ViewGroup container, int position, @NonNull Object object) {
        container.removeView((ImageView) object);
    }

}

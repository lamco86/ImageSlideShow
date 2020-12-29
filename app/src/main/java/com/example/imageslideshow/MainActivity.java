package com.example.imageslideshow;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Intent intent = getIntent();
    }

    public void gotoFamily(View view) {
        Intent intent = new Intent(this, FamilyActivity.class);
        startActivity(intent);
    }
    public void gotoLetters(View view) {
        Intent intent = new Intent(this, LettersActivity.class);
        startActivity(intent);
    }
    public void gotoNumbers(View view) {
        Intent intent = new Intent(this, NumbersActivity.class);
        startActivity(intent);
    }
    public void gotoFruit(View view) {
        Intent intent = new Intent(this, FruitActivity.class);
        startActivity(intent);
    }
    public void gotoFriends(View view) {
        Intent intent = new Intent(this, FriendsActivity.class);
        startActivity(intent);
    }
    public void gotoColours(View view) {
        Intent intent = new Intent(this, ColoursActivity.class);
        startActivity(intent);
    }

    public void gotoShapes(View view) {
        Intent intent = new Intent(this, ShapesActivity.class);
        startActivity(intent);
    }
}

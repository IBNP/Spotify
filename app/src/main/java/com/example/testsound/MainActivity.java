package com.example.testsound;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.widget.ImageView;

import com.bumptech.glide.Glide;





public class MainActivity extends AppCompatActivity {

    MediaPlayer mediaPlayer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageView cover = (ImageView) findViewById(R.id.imgCover);

        Glide.with(this).load("https://img.youtube.com/vi/aQjjk-Fxf9M/0.jpg").into(cover);
        mediaPlayer = MediaPlayer.create(getApplicationContext(),R.raw.mxmtoon_pleasedont);
    }

    @Override
    protected void onResume() {
        super.onResume();
        mediaPlayer.start();
    }
}
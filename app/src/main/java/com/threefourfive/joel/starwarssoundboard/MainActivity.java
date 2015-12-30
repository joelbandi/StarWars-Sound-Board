package com.threefourfive.joel.starwarssoundboard;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {
    MediaPlayer mplayer;
    public void onClick1(View view){
        if(view.getTag()=="0"){
            mplayer = MediaPlayer.create(this,R.raw.chewbacca_01);
            mplayer.start();
        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}

package com.threefourfive.joel.starwarssoundboard;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class MainActivity extends AppCompatActivity {
    MediaPlayer mplayer;

    public void onClick1(View view) {


        int eye_d = view.getId();
        String theId = "";
        theId = view.getResources().getResourceEntryName(eye_d);
        Log.i("mesaaaaage",theId);
        int ResId = getResources().getIdentifier(theId,"raw", "com.threefourfive.joel.starwarssoundboard");
        MediaPlayer mplayer = MediaPlayer.create(this, ResId);
        mplayer.start();

//        if (view.getTag().toString().equals("0")) {
//            //if(mplayer.isPlaying()){mplayer.stop();}
//            mplayer = MediaPlayer.create(this, R.raw.r2d2);
//            mplayer.start();
//            mplayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
//                public void onCompletion(MediaPlayer mp) {
//                    mp.release();
//
//                }
//            });
//        }
//
//        if (view.getTag().toString().equals("1")) {
//            //if(mplayer.isPlaying()){mplayer.stop();}
//            mplayer = MediaPlayer.create(this, R.raw.chewie);
//            mplayer.start();
//            mplayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
//                public void onCompletion(MediaPlayer mp) {
//                    mp.release();
//
//                }
//            });
//        }
//        if (view.getTag().toString().equals("2")) {
//            //if(mplayer.isPlaying()){mplayer.stop();}
//            mplayer = MediaPlayer.create(this, R.raw.laser);
//            mplayer.start();
//            mplayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
//                public void onCompletion(MediaPlayer mp) {
//                    mp.release();
//
//                }
//            });
//        }
//  code to release resource after playing !!!
//        mplayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
//            public void onCompletion(MediaPlayer mp) {
//                mp.release();
//
//            }
//        });

//       Log.i("message", view.getTag().toString());


    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}

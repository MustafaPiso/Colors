package com.example.piso.colors;

import android.content.Context;
import android.media.AudioManager;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    MediaPlayer mediaPlayer ;
    public void Click_Color(View view) {
        int  View_id = view.getId() ;
         String  Current_id  = "";
        Current_id = view.getResources().getResourceEntryName(View_id);
         int resource_id  = getResources().getIdentifier(Current_id,"raw","com.example.piso.colors");
        AudioManager manager = (AudioManager)this.getSystemService(Context.AUDIO_SERVICE);
        if(manager.isMusicActive())
        {
            mediaPlayer.stop();
            Log.v("running ", " stop");
        }

        mediaPlayer = MediaPlayer.create(this,resource_id);

        mediaPlayer.start();

    }
}

package org.samiulhaq.islamiceducation;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class ActivityFalak extends AppCompatActivity {
    MediaPlayer mp;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_falak);

        ImageView imageView= findViewById(R.id.imageView7);
        imageView.animate().rotation(720).setDuration(1000);

        mp = MediaPlayer.create(this,R.raw.falak);
        mp.start();
    }

    public void play(View view) {
        mp.start();
    }

    public void back(View view) {
        Intent intent= new Intent(ActivityFalak.this,ActivitySurah.class);
        startActivity(intent);
    }
}
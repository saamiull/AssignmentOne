package org.samiulhaq.islamiceducation;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class ActivityIkhlas extends AppCompatActivity {
    MediaPlayer mp;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ikhlas);

        ImageView imageView= findViewById(R.id.imageView7);
        imageView.animate().rotation(720).setDuration(1000);

        mp = MediaPlayer.create(this,R.raw.ikhlas);
        mp.start();
    }

    public void play(View view) {
        mp.start();
    }

    public void back(View view) {
        Intent intent= new Intent(ActivityIkhlas.this,ActivitySurah.class);
        startActivity(intent);
    }
}
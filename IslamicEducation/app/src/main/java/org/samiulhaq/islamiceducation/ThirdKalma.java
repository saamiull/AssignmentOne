package org.samiulhaq.islamiceducation;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.MediaController;
import android.widget.VideoView;

public class ThirdKalma extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third_kalma);
        VideoView videoView= findViewById(R.id.videoView3);
        videoView.setVideoPath("android.resource://" + getPackageName() + "/" + R.raw.third);
        MediaController mediaController= new MediaController(this);
        mediaController.setAnchorView(videoView);
        videoView.setMediaController(mediaController);
        videoView.start();
    }
}
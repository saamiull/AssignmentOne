package org.samiulhaq.islamiceducation;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.widget.ProgressBar;

public class LoadingActivity extends AppCompatActivity {
    ProgressBar progressBar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_loading);

        progressBar=(ProgressBar) findViewById(R.id.progressBar3);
        progressBar.setMax(100);
        progressBar.setProgress(0);
        Thread thread=new Thread(){
            @Override
            public void run(){
                try {
                    for (int i=0;i<100;i++){
                        progressBar.setProgress(i);
                        sleep(20);
                    }
                }catch (Exception e){
                    e.printStackTrace();
                }finally {
                    Intent intent=new Intent(getApplicationContext(),MainActivity.class);
                    startActivity(intent);
                    finish();
                }
            }
        };
        Handler handler= new Handler();
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent= new Intent(LoadingActivity.this,MainActivity.class);
                startActivity(intent);
                finish();
            }
        },4000);
    }
}
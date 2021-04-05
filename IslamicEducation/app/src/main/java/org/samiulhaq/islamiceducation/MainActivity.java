package org.samiulhaq.islamiceducation;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Intent;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void Dua(View view) {
        Intent intent= new Intent(MainActivity.this,ActivityDua.class);
        startActivity(intent);
    }

    public void kalmay(View view) {
        Intent intent= new Intent(MainActivity.this,ActivityKalma.class);
        startActivity(intent);
    }

    public void surah(View view) {
        Intent intent= new Intent(MainActivity.this,ActivitySurah.class);
        startActivity(intent);
    }
}
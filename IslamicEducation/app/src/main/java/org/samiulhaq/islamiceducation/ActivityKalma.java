package org.samiulhaq.islamiceducation;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class ActivityKalma extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kalma);
    }

    public void first_kalma(View view) {
        Intent intent= new Intent(ActivityKalma.this,FirstKalma.class);
        startActivity(intent);
    }

    public void second_kalma(View view) {
        Intent intent= new Intent(ActivityKalma.this,SecondKalma.class);
        startActivity(intent);
    }

    public void third_kalma(View view) {
        Intent intent= new Intent(ActivityKalma.this,ThirdKalma.class);
        startActivity(intent);
    }

    public void fourth_kalma(View view) {
        Intent intent= new Intent(ActivityKalma.this,FourthKalma.class);
        startActivity(intent);
    }

    public void fifth_kalma(View view) {
        Intent intent= new Intent(ActivityKalma.this,FifthKalma.class);
        startActivity(intent);
    }

    public void six_kalma(View view) {
        Intent intent= new Intent(ActivityKalma.this,SixthKalma.class);
        startActivity(intent);
    }

    public void backHome(View view) {
        Intent intent = new Intent(ActivityKalma.this,MainActivity.class);
        startActivity(intent);
    }
}
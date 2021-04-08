package org.samiulhaq.islamiceducation;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class ActivityKalma extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kalma);


        ListView listView= findViewById(R.id.listView1);
        ArrayList<String> kalmaArrayList = new ArrayList<String>();
        kalmaArrayList.add("پہلا کلمہ");
        kalmaArrayList.add("دوسرا کلمہ");
        kalmaArrayList.add("تیسرا کلمہ");
        kalmaArrayList.add("چوتھا کلمہ");
        kalmaArrayList.add("پانچواں کلمہ");
        kalmaArrayList.add("چھٹا کلمہ");

        ArrayAdapter adapter = new ArrayAdapter(this, R.layout.row, kalmaArrayList);
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                int value = position;
                switch (value){
                    case 0:
                        Intent intent = new Intent(ActivityKalma.this,FirstKalma.class);
                        startActivity(intent);
                        break;
                    case 1:
                        Intent intent1 = new Intent(ActivityKalma.this,SecondKalma.class);
                        startActivity(intent1);
                        break;
                    case 2:
                        Intent intent2 = new Intent(ActivityKalma.this,ThirdKalma.class);
                        startActivity(intent2);
                        break;
                    case 3:
                        Intent intent3 = new Intent(ActivityKalma.this,FourthKalma.class);
                        startActivity(intent3);
                        break;
                    case 4:
                        Intent intent4 = new Intent(ActivityKalma.this,FifthKalma.class);
                        startActivity(intent4);
                        break;
                    case 5:
                        Intent intent5 = new Intent(ActivityKalma.this,SixthKalma.class);
                        startActivity(intent5);
                        break;
                    default:
                        break;
                }
            }
        });
    }
    public void backHome(View view) {
        Intent intent = new Intent(ActivityKalma.this,MainActivity.class);
        startActivity(intent);
    }
}
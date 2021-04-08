package org.samiulhaq.islamiceducation;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class ActivityDua extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dua);
        ListView listView= findViewById(R.id.listView);
        ArrayList<String> duaArrayList = new ArrayList<String>();
        duaArrayList.add("سفر کی دعا");
        duaArrayList.add("کھانا کھانے سے پہلے کی دعا");
        duaArrayList.add("کھانا کھانے کے درمیان کی دعا");
        duaArrayList.add("کھانا کھانے کے بعد کی دعا");
        duaArrayList.add("مسجد جانے کی دعا");
        duaArrayList.add("مسجد سے باہر آنے کی دعا");
        duaArrayList.add("درود ابراہیمی");

        ArrayAdapter adapter = new ArrayAdapter(this, R.layout.row, duaArrayList);
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                int value = position;
                switch (value){
                    case 0:
                        Intent intent = new Intent(ActivityDua.this,ActivitySafarDua.class);
                        startActivity(intent);
                        break;
                    case 1:
                        Intent intent1 = new Intent(ActivityDua.this,ActivityBeforeMeal.class);
                        startActivity(intent1);
                        break;
                    case 2:
                        Intent intent2 = new Intent(ActivityDua.this,ActivityMidMeal.class);
                        startActivity(intent2);
                        break;
                    case 3:
                        Intent intent3 = new Intent(ActivityDua.this,ActivityAfterMeal.class);
                        startActivity(intent3);
                        break;
                    case 4:
                        Intent intent4 = new Intent(ActivityDua.this,ActivityEnterMosque.class);
                        startActivity(intent4);
                        break;
                    case 5:
                        Intent intent5 = new Intent(ActivityDua.this,ActivityLeaveMosque.class);
                        startActivity(intent5);
                        break;
                    case 6:
                        Intent intent6 = new Intent(ActivityDua.this,ActivityDarrod.class);
                        startActivity(intent6);
                        break;
                    default:
                        break;
                }
            }
        });
    }
    public void backHome(View view) {
        Intent intent = new Intent(ActivityDua.this,MainActivity.class);
        startActivity(intent);
    }
}
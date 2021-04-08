package org.samiulhaq.islamiceducation;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.GridView;

import java.util.ArrayList;

public class ActivitySurah extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_surah);
        GridView gridView= findViewById(R.id.gridView);
        ArrayList<String> duaArrayList = new ArrayList<String>();
        duaArrayList.add("سورہ الناس");
        duaArrayList.add("سورہ الکوثر");
        duaArrayList.add("سورہ الفلق");
        duaArrayList.add("سورہ الاخلاص");
        duaArrayList.add("سورہ النصر");
        duaArrayList.add("سورہ العصر");

        ArrayAdapter adapter = new ArrayAdapter(this, R.layout.row, duaArrayList);
        gridView.setAdapter(adapter);

        gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                int value = position;
                switch (value){
                    case 0:
                        Intent intent = new Intent(ActivitySurah.this,ActivityNaas.class);
                        startActivity(intent);
                        break;
                    case 1:
                        Intent intent1 = new Intent(ActivitySurah.this,ActivityKausar.class);
                        startActivity(intent1);
                        break;
                    case 2:
                        Intent intent2 = new Intent(ActivitySurah.this,ActivityFalak.class);
                        startActivity(intent2);
                        break;
                    case 3:
                        Intent intent3 = new Intent(ActivitySurah.this,ActivityIkhlas.class);
                        startActivity(intent3);
                        break;
                    case 4:
                        Intent intent4 = new Intent(ActivitySurah.this,ActivityNasar.class);
                        startActivity(intent4);
                        break;
                    case 5:
                        Intent intent5 = new Intent(ActivitySurah.this,ActivityAsar.class);
                        startActivity(intent5);
                        break;
                    default:
                        break;
                }
            }
        });

    }

    public void backHome(View view) {
        Intent intent = new Intent(ActivitySurah.this,MainActivity.class);
        startActivity(intent);
    }
}
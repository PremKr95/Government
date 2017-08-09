package com.example.premkchoudhary.government;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        GridView gridview = (GridView) findViewById(R.id.gridview);
        gridview.setAdapter(new ImageAdapter(this));

        gridview.setOnItemClickListener(new AdapterView.OnItemClickListener() {
           @Override
           public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

               switch (position) {
                   case 0:
                       Intent intentID = new Intent(MainActivity.this, ID.class);
                        startActivity(intentID);
                       break;
                   case 1:
                       Intent intentProperty = new Intent(MainActivity.this, Property.class);
                       startActivity(intentProperty);
                       break;
                   case 2:
                       Intent intentBank = new Intent(MainActivity.this , Bank.class);
                        startActivity(intentBank);
                       break;
               }
           }
       });

    }
}

package com.example.activityfragmentnavigation;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Toast;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        Bundle bundle=getIntent().getExtras();//-> Receiving data from Bundle
        Toast.makeText(this,bundle.getString("value"),Toast.LENGTH_SHORT).show();
    }
}
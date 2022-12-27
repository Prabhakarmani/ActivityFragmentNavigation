package com.example.activityfragmentnavigation.Passing.bundle;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Toast;

import com.example.activityfragmentnavigation.R;

public class MainActivity2 extends AppCompatActivity
{
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        //-> Receiving data from Bundle
        Intent intent=getIntent();
        String title=intent.getStringExtra("value");
        int roll=intent.getIntExtra("roll_no",0);
        Toast.makeText(this,roll  +  title,Toast.LENGTH_SHORT).show();
    }
}
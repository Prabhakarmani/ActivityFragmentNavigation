package com.example.activityfragmentnavigation.Passing.bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.activityfragmentnavigation.R;

public class MainActivity extends AppCompatActivity
{
    Button button1, button2;
    String name;
    int rollnumber;
    @SuppressLint({"MissingInflatedId", "LocalSuppress"})
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button1=(Button) findViewById(R.id.btn1);
        button2=(Button) findViewById(R.id.btn2);
        name="manish prabhakar";
        rollnumber=7656140;

        button1.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                Intent i=new Intent(getApplicationContext(), MainActivity2.class);
                //->Passing data by bundle passing
                i.putExtra("value",name);
                i.putExtra("roll_no",rollnumber);
                startActivity(i);
            }
        });

        button2.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                button1.setVisibility(View.GONE);
                button2.setVisibility(View.GONE);
                Fragment frg=new BlankFragment();
                Bundle args=new Bundle();
                args.putString("name",name);
                args.putInt("roll_no",rollnumber);
                BlankFragment.putArguments(args);
                FragmentTransaction fragmentTransaction=getSupportFragmentManager().beginTransaction();
                fragmentTransaction.replace(R.id.container,frg).commit();
            }
        });
    }
}
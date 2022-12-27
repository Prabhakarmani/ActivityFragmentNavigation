package com.example.activityfragmentnavigation;

import android.content.Intent;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;

public class BlankFragment extends Fragment
{
    Button btn1,btn2;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState)
    {
        Toast.makeText(getActivity(),"this is Fragment",Toast.LENGTH_SHORT).show();
        View view= inflater.inflate(R.layout.fragment_blank, container, false);

        btn1=view.findViewById(R.id.fragbtn1);
        btn2=view.findViewById(R.id.fragbtn2);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(getActivity(),MainActivity.class);
                startActivity(i);
            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Fragment frag2=new BlankFragment2();
                FragmentTransaction fragmentTransaction= getActivity().getSupportFragmentManager().beginTransaction();
                fragmentTransaction.replace(R.id.container,frag2).commit();

            }
        });

        return view;

    }
}
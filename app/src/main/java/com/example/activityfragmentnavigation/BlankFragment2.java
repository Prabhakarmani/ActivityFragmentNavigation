package com.example.activityfragmentnavigation;

import android.os.Bundle;
import androidx.fragment.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

public class BlankFragment2 extends Fragment
{

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState)
    {

        Toast.makeText(getActivity(),"this is Fragment222222222222",Toast.LENGTH_SHORT).show();
        return inflater.inflate(R.layout.fragment_blank2, container, false);
    }
}
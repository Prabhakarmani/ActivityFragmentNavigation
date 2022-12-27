package com.example.activityfragmentnavigation;

import android.os.Bundle;
import androidx.fragment.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

public class BlankFragment2 extends Fragment
{
    public static String name1;
    public static int roll1;

    public static void putArguments(Bundle args)
    {
        name1=args.getString("name");
        roll1=args.getInt("roll_no");
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState)
    {

        Toast.makeText(getActivity(),name1+roll1,Toast.LENGTH_SHORT).show();
        return inflater.inflate(R.layout.fragment_blank2, container, false);
    }
}
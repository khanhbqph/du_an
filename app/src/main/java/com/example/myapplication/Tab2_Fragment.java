package com.example.myapplication;

import android.content.Context;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


public class Tab2_Fragment extends Fragment {


    public Tab2_Fragment() {

          }
    @Override
    public void onAttach(@NonNull Context context) {
        super.onAttach(context);
        Log.e("khanh123", "Fragment 2");
    }

    @Override
    public void onResume() {
        super.onResume();
        Log.e("khanh123", "Reload Fragment 2");
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_tab2_, container, false);
    }
}
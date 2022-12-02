package com.example.myapplication;

import android.content.Context;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import java.util.ArrayList;


public class Tab1_Fragment extends Fragment {


    private ArrayList<News> newsArrayList;
    private String[] newsHeading;
    private int[] imageResource;
    private RecyclerView recycleView;

    public Tab1_Fragment() {
        // Required empty public constructor
    }

    @Override
    public void onAttach(@NonNull Context context) {
        super.onAttach(context);
        Log.e("khanh123", "Fragment 1");
    }

    @Override
    public void onResume() {
        super.onResume();
        Log.e("khanh123", "Reload Fragment 1");
    }
    
    

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_tab1_, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        dataInitialize();
        recycleView = view.findViewById(R.id.Recyclerview);
        recycleView.setLayoutManager(new LinearLayoutManager(getContext()));
        recycleView.setHasFixedSize(true);
        MyAdapter myAdapter = new MyAdapter(getContext(),newsArrayList);
        recycleView.setAdapter(myAdapter);
        myAdapter.notifyDataSetChanged();
    }

    private void dataInitialize() {
        newsArrayList = new ArrayList<>();

        newsHeading = new String[]{
                getString(R.string.head_1),
                getString(R.string.head_2),
                getString(R.string.head_3),
                getString(R.string.head_4),
                getString(R.string.head_5),
                getString(R.string.head_6),
                getString(R.string.head_7),
                getString(R.string.head_8),
                getString(R.string.head_9),
                getString(R.string.head_10),
        };

        imageResource = new int[]{
                R.drawable.hinh,
                R.drawable.hinh,
                R.drawable.hinh,
                R.drawable.hinh,
                R.drawable.hinh,
                R.drawable.hinh,
                R.drawable.hinh,
                R.drawable.hinh,
                R.drawable.hinh,
                R.drawable.hinh,
        };
        for (int i = 0; i<newsHeading.length; i++){
            News news = new News(newsHeading[i], imageResource[i]);
            newsArrayList.add(news);
        }
    }

    public void reloadData(){
        Toast.makeText(getActivity(), "Realad", Toast.LENGTH_SHORT).show();
    }



}
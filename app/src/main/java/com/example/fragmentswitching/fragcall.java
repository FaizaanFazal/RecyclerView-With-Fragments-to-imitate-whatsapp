package com.example.fragmentswitching;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.fragmentswitching.model.calladapter;
import com.example.fragmentswitching.model.data;
import com.example.fragmentswitching.model.datacall;
import com.example.fragmentswitching.model.datastatus;
import com.example.fragmentswitching.model.recyclerviewadapter;

import java.util.ArrayList;
import java.util.List;


public class fragcall extends Fragment {
    List<datacall> datacallList= new ArrayList<>();
    RecyclerView recyclerView;
    com.example.fragmentswitching.model.calladapter calladapter;

    public fragcall() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view=inflater.inflate(R.layout.fragment_fragcall, container, false);
        recyclerView = view.findViewById(R.id.recycler2);
        datacallList.add(new datacall("Loner","48 Minutes ago",R.drawable.naruto,R.drawable.ic_missed));
        datacallList.add(new datacall("SoulLand","50 Minutes ago",R.drawable.soulland,R.drawable.ic_m));
        datacallList.add(new datacall("Hinata","today,2  hours ago",R.drawable.hinataa,R.drawable.ic_m));
        datacallList.add(new datacall("Haikyuu","yesterday",R.drawable.haikyu,R.drawable.ic_missed));
        datacallList.add(new datacall("Ronin","2 days ago",R.drawable.two,R.drawable.ic_m));
        datacallList.add(new datacall("Haibi","4 days ago",R.drawable.naruto,R.drawable.ic_missed));
        datacallList.add(new datacall("SoulLand","5 days ago",R.drawable.soulland,R.drawable.ic_m));
        datacallList.add(new datacall("Zakuta","Week ago",R.drawable.three,R.drawable.ic_m));
        calladapter = new calladapter(datacallList,getContext());
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
        recyclerView.setHasFixedSize(true);
        recyclerView.setAdapter(calladapter);
        return view;
    }
}

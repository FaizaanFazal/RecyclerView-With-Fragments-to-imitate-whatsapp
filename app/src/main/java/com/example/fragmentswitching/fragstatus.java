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
import com.example.fragmentswitching.model.datastatus;
import com.example.fragmentswitching.model.recyclerviewadapter;
import com.example.fragmentswitching.model.status;
import com.example.fragmentswitching.model.statusadapter;

import java.util.ArrayList;
import java.util.List;

public class fragstatus extends Fragment {
    List<datastatus> liststatus= new ArrayList<>();
    RecyclerView recyclerView;
    com.example.fragmentswitching.model.statusadapter statusadapter;

    public fragstatus() {
        // Required empty public constructor
    }


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view=inflater.inflate(R.layout.fragment_fragstatus, container, false);
        recyclerView = view.findViewById(R.id.recycler3);
        liststatus.add(new datastatus("Hinata","5 Minutes ago",R.drawable.hinataa));
        liststatus.add(new datastatus("Haikyuu","10 Minutes ago",R.drawable.haikyu));
        liststatus.add(new datastatus("Ronin","12 Minutes ago",R.drawable.two));
        liststatus.add(new datastatus("Loner","48 Minutes ago",R.drawable.naruto));
        liststatus.add(new datastatus("SoulLand","50 Minutes ago",R.drawable.soulland));
        liststatus.add(new datastatus("Zakuta","53 Minutes ago",R.drawable.three));
        statusadapter = new statusadapter(liststatus,getContext());
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
        recyclerView.setHasFixedSize(true);
        recyclerView.setAdapter(statusadapter);
        return view;

    }
}
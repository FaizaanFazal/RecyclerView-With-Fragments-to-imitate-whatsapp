package com.example.fragmentswitching;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

import com.example.fragmentswitching.model.data;
import com.example.fragmentswitching.model.recyclerviewadapter;

import java.util.ArrayList;
import java.util.List;

public class fragchat extends Fragment{

    // List ,adapter
    List<data> studentList= new ArrayList<>();
    RecyclerView recyclerView;
    com.example.fragmentswitching.model.recyclerviewadapter recyclerviewadapter;

    public fragchat() {
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

        View view=inflater.inflate(R.layout.fragment_fragchat, container, false);
        recyclerView = view.findViewById(R.id.recycler181924);
        studentList.add(new data("Hinata","How Are YOu Doing",R.drawable.hinataa));
        studentList.add(new data("Haikyuu","Lets play!!",R.drawable.haikyu));
        studentList.add(new data("SouldLand","Best Anime ever!!!!",R.drawable.soulland));
        studentList.add(new data("Ronin","Well It doesn't Work That way",R.drawable.two));
        studentList.add(new data("Loner","Kuruma Ditched me!!",R.drawable.naruto));
        studentList.add(new data("XiaoWu","Shin Shao Wu da!!",R.drawable.one));
        studentList.add(new data("Saloni","What?",R.drawable.three));
        studentList.add(new data("Habibi","Daba ky chal diay",R.drawable.soulland));
        studentList.add(new data("Zakuta","Daba ky chal diay",R.drawable.two));
        studentList.add(new data("Jin","Daba ky chal diay",R.drawable.one));
        studentList.add(new data("Zakuti","Daba ky chal diay",R.drawable.two));
        studentList.add(new data("Kazama","Daba ky chal diay",R.drawable.one));
        recyclerviewadapter = new recyclerviewadapter(studentList,getContext());
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
        recyclerView.setHasFixedSize(true);
        recyclerView.setAdapter(recyclerviewadapter);
        return view;

    }
}
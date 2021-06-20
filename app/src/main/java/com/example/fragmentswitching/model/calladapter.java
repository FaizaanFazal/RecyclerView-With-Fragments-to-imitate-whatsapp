package com.example.fragmentswitching.model;

import android.content.Context;
import android.media.Image;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;


import com.example.fragmentswitching.R;

import java.util.List;

import de.hdodenhof.circleimageview.CircleImageView;

public class calladapter extends RecyclerView.Adapter<calladapter.ViewHolder> {
    List<datacall> datacallList;
    Context context;

    public calladapter(List<datacall> datacallList, Context context) {
        this.datacallList = datacallList;
        this.context = context;
    }

    @NonNull
    @Override
    public calladapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.call_item,parent,false);
        return  new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull calladapter.ViewHolder holder, int position) {
        datacall datacall=datacallList.get(position);
        holder.txtName.setText(datacall.getName());
        holder.textRollno.setText(datacall.getRollno());
        holder.image.setImageResource(datacall.getImage());
        holder.ic.setImageResource(datacall.getIc());
    }

    @Override
    public int getItemCount() {
        return datacallList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        TextView txtName,textRollno;
        CircleImageView image;
        ImageView ic;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            txtName=itemView.findViewById(R.id.t2);
            textRollno=itemView.findViewById(R.id.t3);
            image=itemView.findViewById(R.id.img_1);
            ic=itemView.findViewById(R.id.ic_call);
        }
    }
}

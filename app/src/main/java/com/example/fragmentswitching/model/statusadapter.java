package com.example.fragmentswitching.model;

import android.content.Context;
import android.text.Layout;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.fragmentswitching.R;

import java.util.List;

import de.hdodenhof.circleimageview.CircleImageView;

public class statusadapter extends RecyclerView.Adapter<statusadapter.ViewHolder> {
    List<datastatus> liststatus;
    Context context;

    public statusadapter(List<datastatus> liststatus, Context context) {
        this.liststatus = liststatus;
        this.context = context;
    }

    @NonNull
    @Override
    public statusadapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.status,parent,false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull statusadapter.ViewHolder holder, int position) {
        datastatus datastatus= liststatus.get(position);
        holder.txtName.setText(datastatus.Name);
        holder.textRollno.setText(datastatus.Rollno);
        holder.image.setImageResource(datastatus.getImage());
    }

    @Override
    public int getItemCount() {
        return liststatus.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        TextView txtName,textRollno;
        CircleImageView image;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            txtName=itemView.findViewById(R.id.t2);
            textRollno=itemView.findViewById(R.id.t3);
            image = itemView.findViewById(R.id.img_1);

        }
    }
}

package com.example.jaffae1coursewaitinglist;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

public class MyViewHolder extends RecyclerView.ViewHolder {
    public TextView name, course;
    ImageView remove, edit;
    public MyViewHolder(View view) {
        super(view);
        name = view.findViewById(R.id.name_and_roll);
        course = view.findViewById(R.id.cource);
        remove = view.findViewById(R.id.remove);
        edit = view.findViewById(R.id.edit);
    }
}
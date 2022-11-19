package com.example.recycler_view;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class MyAdapter extends RecyclerView.Adapter<MyViewHolder> {

    //Creating ArrayList which will get data of original arraylist..
    ArrayList<Model> data;

    public MyAdapter(ArrayList<Model> data) {
        this.data = data;
    }

    @Override
    public MyViewHolder onCreateViewHolder( ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.single_row,parent,false);
        return new MyViewHolder(view);

    }

    @Override
    public void onBindViewHolder( MyViewHolder holder, int position) {

        holder.name.setText(data.get(position).getNames());
        holder.desc.setText(data.get(position).getDescs());
        holder.img.setImageResource(data.get(position).getImage());
    }

    @Override
    public int getItemCount() {
        return data.size();
    }
}

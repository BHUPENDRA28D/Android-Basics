package com.example.recycler_view;

import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import org.w3c.dom.Text;

public class MyViewHolder extends RecyclerView.ViewHolder {
    ImageView img;
    TextView  name ,desc;


    public MyViewHolder(@NonNull View itemView) {
        super(itemView);
        img = (ImageView)  itemView.findViewById(R.id.img1);
        name =(TextView) itemView.findViewById(R.id.name);
        desc = (TextView) itemView.findViewById(R.id.desc);
    }
}

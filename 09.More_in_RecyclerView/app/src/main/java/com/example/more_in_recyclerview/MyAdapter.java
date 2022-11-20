package com.example.more_in_recyclerview;

import android.content.Context;
import android.content.Intent;
import android.media.Image;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Filter;
import android.widget.Filterable;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import org.w3c.dom.Text;

import java.util.ArrayList;
import java.util.Locale;

public class MyAdapter extends RecyclerView.Adapter<MyAdapter.ViewHolder>  {

    //Creating ArrayList which will get data of original arraylist..
    ArrayList<Model> data;
    Context context;
    ArrayList<Model> backup;

    public MyAdapter(ArrayList<Model> data, Context context) {
        this.context = context;
        this.data = data;
        backup = new ArrayList<>(data);
    }

    @NonNull
    @Override
    public MyAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.singlerow, parent, false);
        return new ViewHolder(view);

    }

    @Override
    public void onBindViewHolder(@NonNull MyAdapter.ViewHolder holder, int position) {

        final Model temp = data.get(position);

        holder.header.setText(data.get(position).getName());
        holder.img.setImageResource(data.get(position).getImageResourceId());
        holder.desc.setText(data.get(position).getDescription());

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(context, DetailActivity.class);
                //putExtra methode used to send information between activity..
                i.putExtra("name", temp.getName());
                i.putExtra("desc", temp.getDescription());
                i.putExtra("image", temp.getImageResourceId());

                i.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);

                context.startActivity(i);
            }
        });

    }

    @Override
    public int getItemCount() {
        return data.size();
    }


    // View Holder class takes reference of layout.
    public class ViewHolder extends RecyclerView.ViewHolder {
        ImageView img;
        TextView header, desc;


        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            img = itemView.findViewById(R.id.img);
            header = itemView.findViewById(R.id.header);
            desc = itemView.findViewById(R.id.desc);
        }


    }

   /* @Override
    public Filter getFilter() {
        return null;
    }

    Filter filter = new Filter() {
        @Override

//        Filter performed through background Thred
        protected FilterResults performFiltering(CharSequence keyword) {
            ArrayList<Model> fiterdata= new ArrayList<>();

            if(keyword.toString().isEmpty())
                fiterdata.addAll(backup);

            else{
                for (Model obj : backup){
                    if(obj.getName().toString().toLowerCase().contains(keyword.toString().toLowerCase()))
                       fiterdata.add(obj);
                }
            }

            FilterResults filterResults = new FilterResults();
            filterResults.values = fiterdata;
            return filterResults;
        }

        //        Filter performed through UI Thred
        @Override
        protected void publishResults(CharSequence constraint, FilterResults results) {

            data.clear();
            data.addAll((ArrayList<Model>)results.values);
            notifyDataSetChanged();
        }
    };*/
}

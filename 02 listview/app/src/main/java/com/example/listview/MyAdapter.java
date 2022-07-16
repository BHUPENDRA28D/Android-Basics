package com.example.listview;

import android.content.Context;
import android.text.style.AlignmentSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.content.ContextCompat;

import java.lang.invoke.LambdaConversionException;
import java.util.ArrayList;
import java.util.List;

/*
 * {@link AndroidFlavorAdapter} is an {@link ArrayAdapter} that can provide the layout for each list
 * based on a data source, which is a list of {@link AndroidFlavor} objects.
 * */
public class MyAdapter extends ArrayAdapter<Word> {

    public int mResourceId;

    public MyAdapter(@NonNull Context context, ArrayList<Word> arrayList, int mResourceId) {
        super(context, 0, arrayList);
        this.mResourceId = mResourceId;
    }

    @Override
    public View getView(int position, View convertView,  ViewGroup parent) {

        convertView= LayoutInflater.from(getContext()).inflate(R.layout.my_layout,parent,false);
        Word currentWord = getItem(position);

        TextView htxt =(TextView) convertView.findViewById(R.id.headText);
        htxt.setText(currentWord.getPlayerName());

        TextView stxt =(TextView) convertView.findViewById(R.id.subText);
        stxt.setText(currentWord.getPlayerType());

        ImageView imageView = (ImageView) convertView.findViewById(R.id.imageView);
        imageView.setImageResource(currentWord.getmImageResourceId());

        //
         View linerListing = convertView.findViewById(R.id.textContainer);
            int color = ContextCompat.getColor(getContext(),mResourceId);
            linerListing.setBackgroundColor(color);

        return convertView;

    }
}

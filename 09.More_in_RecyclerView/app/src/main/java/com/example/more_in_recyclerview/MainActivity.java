package com.example.more_in_recyclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.SearchView;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    RecyclerView rcv;
    MyAdapter adapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rcv = findViewById(R.id.rcview);

//        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this,LinearLayoutManager.HORIZONTAL,false);
//        rcv.setLayoutManager(linearLayoutManager);

        GridLayoutManager gridLayoutManager = new GridLayoutManager(this,2);
        rcv.setLayoutManager(gridLayoutManager);

         adapter = new MyAdapter(dateQueue(),getApplicationContext());
        rcv.setAdapter(adapter);


    }

    public ArrayList<Model> dateQueue(){
        ArrayList<Model> data = new ArrayList<>();

        data.add(new Model("Shubhman Gill","BALANCED -- (Righthand Opener)",R.drawable.gill));
        data.add(new Model("Rohit Sharma","RADICAL -- (Righthand Opener)",R.drawable.rohit));
        data.add(new Model("Lokesh Rahul","BALANCED -- (Righthand Opener WK)",R.drawable.rahul));
        data.add(new Model("Virat Kohli","RADICAL -- (Righthand Batsman)",R.drawable.kohli));
        data.add(new Model("Sreyash Iyer","BALANCED -- (Righthand Batsman)",R.drawable.siyer));
        data.add(new Model("Risabh Pant","BRUTE -- (Lefthand Batsman WK)",R.drawable.pant));
        data.add(new Model("Hardik Pandya","BRUTE -- (Righthand Batting Allrounder)",R.drawable.hp));
        data.add(new Model("Ravindra Jadeja","BRUTE -- ((Lefthand Bowling Allrounder))",R.drawable.ravinder));
        data.add(new Model("Bhuvneshvar Kumar","BALANCED -- ((Righthand Bowling Allrounder))",R.drawable.bhuvneshwarpng));
        data.add(new Model("Kuldeep Yadav","BALANCED -- ((Lefthand  Spinner))",R.drawable.kuldeepyadav));
        data.add(new Model("Jaspreet Bhumrha","RADICAL -- ((Righthand Fast Bowler))",R.drawable.bumrah));
        data.add(new Model("Yujvendra Cahal","BALANCED -- ((Righthand Spinner))",R.drawable.chaha));


        return data;
    }


//    @Override
//    public boolean onCreateOptionsMenu(Menu menu) {
//
//        getMenuInflater().inflate(R.menu.mainmenu,menu);
//        MenuItem item = findViewById(R.id.search_menu);
//
//        SearchView searchView =(SearchView)item.getActionView();
//        searchView.setOnQueryTextListener(new SearchView.OnQueryTextListener() {
//            @Override
//            public boolean onQueryTextSubmit(String query) {
//
//                return false;
//            }
//
//            @Override
//            public boolean onQueryTextChange(String newText) {
//
//               adapter.getFilter().filter(newText);
//                return false;
//            }
//        });
//
//        return super.onCreateOptionsMenu(menu);
//    }
}

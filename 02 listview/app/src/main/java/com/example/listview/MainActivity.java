package com.example.listview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        listView = findViewById(R.id.listview);


        ArrayList<Word> arr = new ArrayList<Word>();
//---------- way to pass only one parameter to add in ArrayList------
//        arr.add("Rohit Sharma");

//        Word word = new Word("Rohit Sharma","Radical (RightHanded)");
//        arr.add(word);
//        ------ directly pass new Words(arrguments); in arr.add(new Word("arrgument"));-------

        arr.add(new Word("Rohit Sharma","RADICAL -- (Righthand Opener)",R.drawable.rohit));
        arr.add(new Word("Lokesh Rahul","BALANCED -- (Righthand Opener WK)",R.drawable.rahul));
        arr.add(new Word("Virat Kohli","RADICAL -- (Righthand Batsman)",R.drawable.kohli));
        arr.add(new Word("Sreyash Iyer","BALANCED -- (Righthand Batsman)",R.drawable.siyer));
        arr.add(new Word("Risabh Pant","BRUTE -- (Lefthand Batsman WK)",R.drawable.pant));
        arr.add(new Word("Hardik Pandya","BRUTE -- (Righthand Batting Allrounder)",R.drawable.hp));
        arr.add(new Word("Ravindra Jadeja","BRUTE -- ((Lefthand Bowling Allrounder))",R.drawable.ravinder));
        arr.add(new Word("Bhuvneshvar Kumar","BALANCED -- ((Righthand Bowling Allrounder))",R.drawable.bhuvneshwarpng));
        arr.add(new Word("Kuldeep Yadav","BALANCED -- ((Lefthand  Spinner))",R.drawable.kuldeepyadav));
        arr.add(new Word("Jaspreet Bhumrha","RADICAL -- ((Righthand Fast Bowler))",R.drawable.bumrah));
        arr.add(new Word("Yujvendra Cahal","BALANCED -- ((Righthand Spinner))",R.drawable.chaha));






//       ---- This is a built in use of Adapter ---
//       ArrayAdapter adp = new ArrayAdapter(this, android.R.layout.simple_gallery_item,arr);
//        listView.setAdapter(adp);
////
//      ------This is On Item Click Listener but can only be used for predifined android apdter and not for custom adapter------
//        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
//            @Override
//            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
//                Toast.makeText(MainActivity.this,"This is item " + i,Toast.LENGTH_SHORT).show();
//            }
//        });

//       --------- use  of custome arrayAdapter------
//        --------to make a custome array Adapter we have to make a xml layout and a Adapter java class-----

               MyAdapter adapter = new MyAdapter(this,arr,R.color.list_color);
               listView.setAdapter(adapter);


    }
}
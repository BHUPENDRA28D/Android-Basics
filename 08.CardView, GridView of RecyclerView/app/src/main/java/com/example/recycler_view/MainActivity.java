package com.example.recycler_view;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    RecyclerView rcv;
    MyAdapter adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rcv = findViewById(R.id.rcView);
        rcv.setLayoutManager(new LinearLayoutManager(this));


       /*Horizontal showcase of Cards of CardView
       *
       * LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this,LinearLayoutManager.HORIZONTAL,false);
        rcv.setLayoutManager(linearLayoutManager);

       * */


        /* For converting it in GridView we can rearrange the singleRow layout according to grid View and Give Grid Layout Manager.
        *
        *  GridLayoutManager gridLayoutManager = new GridLayoutManager(this,2);// spanCount = no. of rows..
           rcv.setLayoutManager(gridLayoutManager);
        * */

//        ArrayList<Model> arr = new ArrayList<>();
//        arr.add(new Model("Rohit Sharma","RADICAL -- (Righthand Opener)",R.drawable.rohit));
//        arr.add(new Model("Lokesh Rahul","BALANCED -- (Righthand Opener WK)",R.drawable.rahul));
//        arr.add(new Model("Virat Kohli","RADICAL -- (Righthand Batsman)",R.drawable.kohli));
//        arr.add(new Model("Sreyash Iyer","BALANCED -- (Righthand Batsman)",R.drawable.siyer));
//        arr.add(new Model("Risabh Pant","BRUTE -- (Lefthand Batsman WK)",R.drawable.pant));
//        arr.add(new Model("Hardik Pandya","BRUTE -- (Righthand Batting Allrounder)",R.drawable.hp));
//        arr.add(new Model("Ravindra Jadeja","BRUTE -- ((Lefthand Bowling Allrounder))",R.drawable.ravinder));
//        arr.add(new Model("Bhuvneshvar Kumar","BALANCED -- ((Righthand Bowling Allrounder))",R.drawable.bhuvneshwarpng));
//        arr.add(new Model("Kuldeep Yadav",\"BALANCED -- ((Lefthand  Spinner))",R.drawable.kuldeepyadav));
//        arr.add(new Model("Jaspreet Bhumrha","RADICAL -- ((Righthand Fast Bowler))",R.drawable.bumrah));
//        arr.add(new Model("Yujvendra Cahal","BALANCED -- ((Righthand Spinner))",R.drawable.chaha));

         adapter = new MyAdapter(dataQueue());
         rcv.setAdapter(adapter);


    }
    public ArrayList<Model> dataQueue(){
        ArrayList<Model> Details = new ArrayList<>();


        Model ob1 = new Model();
        ob1.setNames("Subhaman Gill");
        ob1.setNames("RADICAL -- (Righthand Opener)");
        ob1.setImage(R.drawable.ic_launcher_background);
        Details.add(ob1);

        Model ob2 = new Model();
        ob2.setNames("Rohit Sharma");
        ob2.setDescs("(Right_Hander)---Brute Bater");
        ob2.setImage(R.drawable.rohit);
        Details.add(ob2);

        Model ob3 = new Model();
        ob3.setNames("Virat Kohli");
        ob3.setDescs("RADICAL -- (Righthand Batsman)");
        ob3.setImage(R.drawable.kohli);
        Details.add(ob3);

        Model ob4 = new Model();
        ob4.setNames("Sreyash Iyer");
        ob4.setDescs("BALANCED -- (Righthand Batsman)");
        ob4.setImage(R.drawable.siyer);
        Details.add(ob4);

        Model ob5 = new Model();
        ob5.setNames("Risabh Pant");
        ob5.setDescs("BRUTE -- (Lefthand Batsman WK)");
        ob5.setImage(R.drawable.pant);
        Details.add(ob5);

        Model ob6 = new Model();
        ob6.setNames("Hardik Pandya");
        ob6.setDescs("BRUTE -- (Righthand Batting Allrounder)");
        ob6.setImage(R.drawable.hp);
        Details.add(ob6);


        Model ob7 = new Model();
        ob7.setNames("Ravindra Jadeja");
        ob7.setDescs("BALANCED -- (Righthand Batsman)");
        ob7.setImage(R.drawable.ravinder);
        Details.add(ob7);

        Model ob8 = new Model();
        ob8.setNames("Bhuvneshvar Kumar");
        ob8.setDescs("BALANCED -- ((Righthand Bowling Allrounder))");
        ob8.setImage(R.drawable.bhuvneshwarpng);
        Details.add(ob8);

        Model ob9 = new Model();
        ob9.setNames("Kuldeep Yadav");
        ob9.setDescs("BALANCED -- ((Lefthand  Spinner))");
        ob9.setImage(R.drawable.kuldeepyadav);
        Details.add(ob9);

        Model ob10 = new Model();
        ob10.setNames("Jaspreet Bhumrha");
        ob10.setDescs("RADICAL -- ((Righthand Fast Bowler))");
        ob10.setImage(R.drawable.bumrah);
        Details.add(ob10);


        Model ob11 = new Model();
        ob11.setNames("Y.Chahal");
        ob11.setDescs("BALANCED -- (Righthand Spinner)");
        ob11.setImage(R.drawable.chaha);
        Details.add(ob11);

        Model ob12 = new Model();
        ob12.setNames("L.Rahul");
        ob12.setDescs("BALANCED -- (Righthand Openner  --WK )");
        ob12.setImage(R.drawable.rahul);
        Details.add(ob12);



        return Details;

}}
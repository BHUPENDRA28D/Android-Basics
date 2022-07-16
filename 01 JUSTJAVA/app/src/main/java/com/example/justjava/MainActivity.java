package com.example.justjava;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;
//import android.os.Bundle;
//import android.support.v7.app.AppCompatActivity;
import android.view.View;
//import android.widget.TextView;
import java.text.NumberFormat;

/**
 * This app displays an order form to order coffee.
 */
public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    //This called when we click order butn is clickes ****used onClick//
    public void submitOrder(View view){
        display(1);
    }
//    This method or function display given quantity on the screen

    private void display(int i) {
        TextView quantityTextView =(TextView) findViewById(R.id.quantity_text_view);
        quantityTextView.setText(""+i);
    }


}
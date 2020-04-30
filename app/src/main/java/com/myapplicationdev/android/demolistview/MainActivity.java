package com.myapplicationdev.android.demolistview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ListView lv;
    ArrayAdapter aa;
    ArrayList<Food> food;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lv = (ListView) this.findViewById(R.id.lvFood);

        //Create a few food objects in food array
        food = new ArrayList<Food>();
        food.add(new Food("Ah Lat Coffee",false));
        food.add(new Food("Rocky choc",true));
        food.add(new Food("Kid Cat Choc",true));

        //Link this Activity object, the row.xml layout for
        //each row and the food String array together
        aa = new FoodAdapter(this,R.layout.row,food);
        lv.setAdapter(aa);


    }
}

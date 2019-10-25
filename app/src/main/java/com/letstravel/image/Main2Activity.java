package com.letstravel.image;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.Spinner;

import java.util.ArrayList;
import java.util.List;

public class Main2Activity extends AppCompatActivity {
    private Spinner spincountry,spinplayer;
    private AutoCompleteTextView autoCompleteTextView1;
   private String country[]={"Nepal", "India"};
    private String Nepalplayer[]={"Ram", "Shyam", "Tom"};
    private String Indiaplayer[]={"Rohait", "Ayadi", "virat"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);


        //binding
        spincountry=(Spinner)findViewById(R.id.spinner1);
        spinplayer=(Spinner)findViewById(R.id.spinner2);
        autoCompleteTextView1=(AutoCompleteTextView) findViewById(R.id.autoCompleteTextView1);

        //autocompleltetextview part
        ArrayAdapter<String> arrayAdapter3=new ArrayAdapter<>(Main2Activity.this,
                android.R.layout.simple_list_item_1,Nepalplayer);
        autoCompleteTextView1.setAdapter(arrayAdapter3);
        autoCompleteTextView1.setThreshold(1);

       //spinner part
        ArrayAdapter adapter1=new ArrayAdapter<>(this,android.R.layout.simple_list_item_1, country);
        spincountry.setAdapter(adapter1);

        spincountry.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                if(spincountry.getSelectedItem().toString().equals("Nepal")){
                    ArrayAdapter<String> arrayAdapter1=new ArrayAdapter<>(Main2Activity.this,
                            android.R.layout.simple_list_item_1,Nepalplayer);
                    spinplayer.setAdapter(arrayAdapter1);
                }
                else {
                    ArrayAdapter<String> arrayAdapter2=new ArrayAdapter<>(Main2Activity.this,
                            android.R.layout.simple_list_item_1,Indiaplayer);
                    spinplayer.setAdapter(arrayAdapter2);
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });


//        List<String> list=new ArrayList<String>();
//        list.add("Nepal");
//        list.add("Japan");
//        list.add("India");
//        list.add("US");
//        list.add("UK");
//        list.add("China");
//
//        ArrayAdapter<String> dataAdapter = new ArrayAdapter<String>(this,
//                android.R.layout.simple_spinner_item, list );
//
//        dataAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
//        spincountry.setAdapter(dataAdapter);
//
//
//
//        List<String> list1=new ArrayList<String>();
//        list.add("Nepal");
//        list.add("Japan");
//        list.add("India");
//        list.add("US");
//        list.add("UK");
//        list.add("China");
//
//        ArrayAdapter<String> dataAdapter1 = new ArrayAdapter<String>(this,
//                android.R.layout.simple_spinner_item, list1 );
//
//        dataAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
//        spinplayer.setAdapter(dataAdapter1);


    }
}

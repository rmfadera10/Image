package com.letstravel.image;

import androidx.appcompat.app.AppCompatActivity;

import android.app.DatePickerDialog;
import android.app.TimePickerDialog;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.DatePicker;
import android.widget.TextView;
import android.widget.TimePicker;

import java.util.Calendar;

public class Main3Activity extends AppCompatActivity implements DatePickerDialog.OnDateSetListener {
    private TextView txtview4,txtview5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
       //Hide titlebar and set fullscreen
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getSupportActionBar().hide();
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);

        setContentView(R.layout.activity_main3);

        txtview4 = (TextView) findViewById(R.id.txtview4);
        txtview5 = (TextView) findViewById(R.id.txtview5);


        txtview4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                loadDatePicker();
            }
        });

        txtview5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                loadTime();
            }
        });
    }

    //datepicker
        private void loadDatePicker() {
            final Calendar calendar=Calendar.getInstance();
            int year=calendar.get(Calendar.YEAR);
            int month=calendar.get(Calendar.MONTH);
            int day=calendar.get(Calendar.DAY_OF_MONTH);

            DatePickerDialog datePickerDialog;
            datePickerDialog = new DatePickerDialog(this, this, year, month, day);
            datePickerDialog.show();
        }

    @Override
    public void onDateSet(DatePicker datePicker, int year, int month, int day) {
        String date="Month/Day/Year :" +month+"/"+day+ "/" +year;
        txtview4.setText(date);

    }


//timepicker
    private void loadTime() {
        final Calendar cal=Calendar.getInstance();
        int hour=cal.get(Calendar.HOUR);
        int minute=cal.get(Calendar.MINUTE);
        final int second=cal.get(Calendar.SECOND);

        TimePickerDialog timePickerDialog=new TimePickerDialog(this, new TimePickerDialog.OnTimeSetListener() {
            @Override
            public void onTimeSet(TimePicker timePicker, int hourofday, int minute) {

                String AmPm;
                if(hourofday>=12){
                  hourofday -=12;
                    AmPm="PM";
                }
                else {
                    AmPm="AM";
                }
                txtview5.setText(("Time is " +hourofday+ ":" +minute+ ":" +second+ " "+AmPm).toString());

            }
        },hour, minute, true);
        timePickerDialog.show();
    }
}

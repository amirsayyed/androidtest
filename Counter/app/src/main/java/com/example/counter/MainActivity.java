package com.example.counter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import java.text.SimpleDateFormat;
import java.util.Date;

import cn.iwgang.countdownview.CountdownView;

public class MainActivity extends AppCompatActivity {

    CountdownView countdownView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        countdownView = findViewById(R.id.competitionTimer);
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss");
        String countData = "02-11-201 00:00:00";
        Date date = new Date();
        try {
//            Date d = simpleDateFormat.parse(countData);
            long currentTime = date.getTime();
            countdownView.start(currentTime);

        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
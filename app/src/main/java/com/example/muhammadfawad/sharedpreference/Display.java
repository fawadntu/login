package com.example.muhammadfawad.sharedpreference;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;


/**
 * Created by Muhammad Fawad on 1/19/2017.
 */

public class Display extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.displayinfo);

        SharedPreferences sharedPreferences = getSharedPreferences("ASAD" , MODE_PRIVATE);
        String display = sharedPreferences.getString("RAJPOOT" , " ");

        TextView displayinfo = (TextView) findViewById(R.id.txtShow);
        displayinfo.setText(display);
    }



}

package com.lihaizhou.textfontsample;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import static com.norbsoft.typefacehelper.TypefaceHelper.typeface;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // Set custom typeface for title
        typeface(findViewById(R.id.devCode_title));
        typeface(findViewById(R.id.fireStatus_title));
        typeface(findViewById(R.id.humidity_title));
        typeface(findViewById(R.id.recordTime_title));
        typeface(findViewById(R.id.temperature_title));
    }
}

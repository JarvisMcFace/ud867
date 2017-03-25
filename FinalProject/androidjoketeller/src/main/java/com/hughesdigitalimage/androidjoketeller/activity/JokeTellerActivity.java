package com.hughesdigitalimage.androidjoketeller.activity;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Toast;

import com.udacity.gradle.builditbigger.joketeller.R;


public class JokeTellerActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        Toast.makeText(this, "SJLSJDF", Toast.LENGTH_SHORT).show();
    }
}

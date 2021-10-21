package com.example.myportfolio;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {


    public void goback(View view)
    {
        ImageView port=(ImageView)findViewById(R.id.port);

        port.animate().alpha(1).setDuration(1500);
    }



    public void fade(View view)
    {
        ImageView port=(ImageView)findViewById(R.id.port);

        port.animate().alpha(0).setDuration(1500);
    }



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
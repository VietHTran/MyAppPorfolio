package com.example.android.myappporfolio;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.content.pm.ActivityInfo;
import android.view.View;
import android.widget.Toast;
import android.content.Context;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
        setContentView(R.layout.activity_main);
    }
    public void popularMoviesClicked(View view) {
        Toast.makeText(getApplicationContext(), "Launch Popular Movies app" , Toast.LENGTH_SHORT).show();
    }
    public void stockHawkClicked(View view) {
        Toast.makeText(getApplicationContext(), "Launch Stock Hawk app" , Toast.LENGTH_SHORT).show();
    }
    public void buildItBiggerClicked(View view) {
        Toast.makeText(getApplicationContext(), "Launch Build It Bigger app" , Toast.LENGTH_SHORT).show();
    }
    public void makeAppMaterialClicked(View view) {
        Toast.makeText(getApplicationContext(), "Launch Make Your App Material app" , Toast.LENGTH_SHORT).show();
    }
    public void capstoneClicked(View view) {
        Toast.makeText(getApplicationContext(), "Launch Capstone app" , Toast.LENGTH_SHORT).show();
    }
    public void goUbiquitousClicked(View view) {
        Toast.makeText(getApplicationContext(), "Launch Go Ubiquitous app" , Toast.LENGTH_SHORT).show();
    }
    public void functionTest() {

    }
}

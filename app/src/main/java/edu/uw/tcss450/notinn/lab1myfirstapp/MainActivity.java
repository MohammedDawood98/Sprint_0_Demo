package edu.uw.tcss450.notinn.lab1myfirstapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import android.util.Log;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "MyFirstApp";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    protected void onStart() {
        Log.v(TAG, "Verbose - onStart");
        super.onStart();
    }

    @Override
    protected void onResume() {
        Log.d(TAG, "Debug - onResume");
        super.onResume();
    }

    @Override
    protected void onPause() {
        Log.i(TAG, "Info - onPause");
        super.onPause();
    }

    @Override
    protected void onStop() {
        Log.w(TAG, "Warn - onStop");
        super.onStop();
    }

    @Override
    protected void onRestart() {
        Log.e(TAG, "Error - onRestart");
        super.onRestart();
    }

    @Override
    protected void onDestroy() {
        Log.e(TAG, "Error - onDestroy");
        super.onDestroy();
    }
}
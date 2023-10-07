package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Thread welcomeThread = new Thread() {

            @Override
            public void run() {
                try {
                    super.run();
                    sleep(1000);  //Delay of 3 seconds
                } catch (Exception e) {

                } finally {

                    Intent intent = new Intent(MainActivity.this,register.class);
                    startActivity(intent);
                    finish();
                }
            }
        };
        welcomeThread.start();

    }

}
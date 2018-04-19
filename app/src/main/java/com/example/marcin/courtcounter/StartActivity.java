package com.example.marcin.courtcounter;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class StartActivity extends AppCompatActivity {
    private static int SPLASH_TIME_OUT =2000;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_start);
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent startIntent=new Intent(StartActivity.this,ChooseSport.class);
                startActivity(startIntent);
                finish();

            }
        },SPLASH_TIME_OUT);
    }
}

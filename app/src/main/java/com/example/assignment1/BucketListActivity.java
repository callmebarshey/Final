package com.example.assignment1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

public class BucketListActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bucket_list);
        getSupportActionBar().hide();

        final Intent i= new Intent(BucketListActivity.this, MainActivity.class);
        new Handler().postDelayed(new Runnable(){
            @Override
            public void run() {
                startActivity(i);
                finish();
            }
        },  1000);

    }
}
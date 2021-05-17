package com.demo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fragments);

        // Start a fragment
        getSupportFragmentManager().beginTransaction()
                .replace(R.id.fragments_container, new SessionsFragment())
                .commit();

    }
}
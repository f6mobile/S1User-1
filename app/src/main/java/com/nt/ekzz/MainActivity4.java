package com.nt.ekzz;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity4 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);
    }

    public void part(View view) {
        Intent intent = new Intent(this, MainActivity5.class);
        startActivity(intent);
    }

    public void setting(View view) {
        Intent intent = new Intent(this, MainActivity6.class);
        startActivity(intent);
    }
}
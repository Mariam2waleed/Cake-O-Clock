package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class categories extends AppCompatActivity {

    private Button select;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.categories);

        select = (Button) findViewById(R.id.select);
        select.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                openCakes();
            }
        });
    }

    public void openCakes(){
        Intent n = new Intent(this, cakes.class);
        startActivity(n);
    }
}
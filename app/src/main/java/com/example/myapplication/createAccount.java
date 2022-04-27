package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class createAccount extends AppCompatActivity {

    private Button upbtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.create_account);

        upbtn = (Button) findViewById(R.id.upbtn);
        upbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                openCategories();
            }
        });
    }
    public void openCategories(){
        Intent s = new Intent(this, categories.class);
        startActivity(s);
    }

}
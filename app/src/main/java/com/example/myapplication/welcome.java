package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class welcome extends AppCompatActivity {


    private Button signupbtn;
    private Button skip;
    private Button signinbtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.welcome);


        signupbtn = (Button) findViewById(R.id.signupbtn);
        signupbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                openCreateAccount();
            }
        });

        skip = (Button) findViewById(R.id.skip);
        skip.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                openCategories();
            }
        });


        signinbtn = (Button) findViewById(R.id.signinbtn);
        signinbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                openLogin();
            }
        });


    }

    public void openCreateAccount(){
        Intent intent = new Intent(this, createAccount.class);
        startActivity(intent);
    }

    public void openLogin(){
        Intent x = new Intent(this, signIn.class);
        startActivity(x);
    }
    public void openCategories(){
        Intent i = new Intent(this, categories.class);
        startActivity(i);
    }
}

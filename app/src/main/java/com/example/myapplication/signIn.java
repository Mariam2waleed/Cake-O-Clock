package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class signIn extends AppCompatActivity {
    private EditText email , pass;
    private Button inbtn;
    private TextView upbk;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.sign_in);

        email = findViewById(R.id.input_email);
        pass = findViewById(R.id.input_password);

        inbtn = (Button) findViewById(R.id.inbtn);
        inbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                openCategories();
            }
        });

        upbk = (TextView) findViewById(R.id.upbk);
        upbk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                openSignup();
            }
        });

    }

    @Override
    protected void onResume() {
        super.onResume();


        SharedPreferences sh = getSharedPreferences( "MySharedPref", MODE_PRIVATE);
         String s1 = sh.getString("email","");
         int a= sh.getInt("pass",0);

         email.setText(s1);
         pass.setText(String.valueOf(a));
    }
    protected void onPause() {
        super.onPause();

        SharedPreferences sp = getSharedPreferences("MySharedPref", MODE_PRIVATE);
        SharedPreferences.Editor myEdit = sp.edit();

        myEdit.putString("email", email.getText().toString());
        myEdit.putInt("pass", Integer.parseInt(pass.getText().toString()));
        myEdit.apply();
    }

    public void openCategories(){
        Intent sc = new Intent(this, categories.class);
        startActivity(sc);
    }
    public void openSignup(){
        Intent sc = new Intent(this, createAccount.class);
        startActivity(sc);
    }
}
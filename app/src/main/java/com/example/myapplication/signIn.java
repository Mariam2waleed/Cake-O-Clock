package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.widget.EditText;

public class signIn extends AppCompatActivity {
    private EditText email , pass;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.sign_in);

        email = findViewById(R.id.input_email);
        pass = findViewById(R.id.input_password);

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
}
package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class cakes extends AppCompatActivity {

    private ImageView cake;
    private Button bk;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.cakes);

        cake = (ImageView) findViewById(R.id.cake);
        cake.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                openProduct();
            }
        });

        bk = (Button) findViewById(R.id.bk);
        bk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                openCategories();
            }
        });
    }

    public void openProduct(){
        Intent s = new Intent(this, product.class);
        startActivity(s);
    }
    public void openCategories(){
        Intent m = new Intent(this, categories.class);
        startActivity(m);
    }
}
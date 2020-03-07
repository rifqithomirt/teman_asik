package com.oesmanalie.it.angkot;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class CategoryActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_category);
    }

    public void login(View view) {
        Intent home=new Intent(CategoryActivity.this, LoginActivity.class);
        startActivity(home);
    }
    public void homepage2(View view) {
        Intent home=new Intent(CategoryActivity.this, HomePageActivity.class);
        startActivity(home);
    }
}

package com.example.myfirstapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class LoginActivity2 extends AppCompatActivity {
    TextView noData;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login2);
        Intent intent=getIntent();

        Bundle bundle=intent.getExtras();
        String value= bundle.getString("myData");

        noData=findViewById(R.id.secondActivity);
        noData.setText(value);
    }
}
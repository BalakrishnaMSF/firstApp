package com.example.myfirstapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    Button loginBtn;
    EditText userName;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        loginBtn=findViewById(R.id.login);
        userName=findViewById(R.id.username);
        loginBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent navIntent =new Intent(MainActivity.this,LoginActivity2.class);
                navIntent.putExtra("myData",userName.getText().toString());
                startActivity(navIntent);
            }
        });

    }



}
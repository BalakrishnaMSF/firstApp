package com.example.myfirstapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button b1;
    EditText ed1,ed2;
    LinearLayout l1;
    TextView tx1,tx2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tx1 = (TextView)findViewById(R.id.hello);
        l1=(LinearLayout) findViewById(R.id.login_linear);
        ed1 = (EditText)findViewById(R.id.username);
        ed2 = (EditText)findViewById(R.id.password);
        b1 = (Button)findViewById(R.id.login);
        tx2 = (TextView)findViewById(R.id.forget);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (ed1.getText().toString().equals("bala@gmail.com") &&
                        ed2.getText().toString().equals("bala123")) {
                    Toast.makeText(getApplicationContext(),
                            "Redirecting to the page", Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(getApplicationContext(),
                            "Wrong username and password", Toast.LENGTH_SHORT).show();
                    tx2.setVisibility(View.VISIBLE);
                }
                finish();
            }
        })
    ;}
}
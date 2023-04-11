package com.example.myfirstapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MainActivity extends AppCompatActivity {
    Button login;
    EditText username,password;
    String regex_username="^[a-zA-Z0-9+_.-]+@[a-zA-Z0-9.-]";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        username = (EditText)findViewById(R.id.username);
        password = (EditText)findViewById(R.id.password);
        login = (Button)findViewById(R.id.login);
        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(isEmpty(username)){
                    Toast.makeText(getApplicationContext(),
                            Constant.WRONG_USERNAME, Toast.LENGTH_SHORT).show();
                    return;
                }
                if(isEmpty(password)){
                    Toast.makeText(getApplicationContext(),
                            Constant.WRONG_PASSWORD, Toast.LENGTH_SHORT).show();
                }
                if(isValid(username)){
                    if(password.getText().length()>=8){
                        Toast.makeText(getApplicationContext(),
                                Constant.LOGIN, Toast.LENGTH_SHORT).show();
                    }
                }
            }
        })
    ;}
    boolean isEmpty(EditText editText){
        return editText == null || editText.getText() == null || editText.getText().toString().isEmpty();
    }
    boolean isValid(EditText editText){
        Pattern pattern = Pattern.compile(regex_username);
        Matcher matcher = pattern.matcher(username.getText());
        return matcher.matches();
    }

}
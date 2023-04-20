package com.example.myfirstapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class MainActivity extends AppCompatActivity {
    TextView txt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txt = findViewById(R.id.hello);

        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("https://jsonplaceholder.typicode.com")
                .addConverterFactory(GsonConverterFactory.create())
                .build();


        MyAPICall myAPICall = retrofit.create(MyAPICall.class);


        Call<DataModel> call = myAPICall.getData();

        call.enqueue(new Callback<DataModel>() {
            @Override
            public void onResponse(Call<DataModel> call, Response<DataModel> response) {
                if(response.code() != 200){
                    txt.setText("Check the connection");
                    return;
                }

                String json = "";

                json = "ID= "+ response.body().getId()+
                        "\n userID= "+ response.body().getUserId()+
                        "\n title= "+ response.body().getTitle()+
                        "\n completed= "+ response.body().isCompleted();


                txt.append(json);


            }


            @Override
            public void onFailure(Call<DataModel> call, Throwable t) {

            }
        });
    }

}
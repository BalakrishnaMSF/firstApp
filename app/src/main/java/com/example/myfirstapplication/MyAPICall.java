package com.example.myfirstapplication;


import retrofit2.Call;
import retrofit2.http.GET;

public interface MyAPICall {



    @GET("posts")
    Call<DataModel> getData();


}

package com.example.myfirstapplication;


import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface MyAPICall {



    @GET("posts/1{id}")
    Call<DataModel> getData();


}

package com.jobs.apidemo;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Header;

public interface ApiInterface {

    @GET("pornstars/")
    Call<DataModel> getData(
        @Header("X-RapidAPI-Key") String key,
        @Header("X-RapidAPI-Host") String host
    );

}

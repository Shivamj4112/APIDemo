package com.jobs.apidemo;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class ApiClient {

    public static final String BASE_URL = "https://papi-pornstarsapi.p.rapidapi.com/";
    public static final String API_KEY = "461e43db4emsh6f231babaddc0a5p1115a8jsn4d383b5e05ef";
    public static final String API_HOST = "papi-pornstarsapi.p.rapidapi.com";
    public static Retrofit retrofit ;

    public static Retrofit getApiClient() {

        retrofit = new Retrofit.Builder()
                .baseUrl(BASE_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        return retrofit;
    }

}

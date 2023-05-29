package com.jobs.apidemo;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity2 extends AppCompatActivity {

    RecyclerView rcvList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        rcvList = findViewById(R.id.rcvList);

        ApiInterface apiInterface = ApiClient.getApiClient().create(ApiInterface.class);

        apiInterface.getData(ApiClient.API_KEY,ApiClient.API_HOST).enqueue(new Callback<DataModel>() {
            @Override
            public void onResponse(Call<DataModel> call, Response<DataModel> response) {

                if (response.isSuccessful()) {

                    rcvList.setLayoutManager(new GridLayoutManager(MainActivity2.this,2));
                    rcvList.setAdapter(new DataListAdapter(response.body().getResults()));

                }

            }

            @Override
            public void onFailure(Call<DataModel> call, Throwable t) {

            }
        });

    }
}
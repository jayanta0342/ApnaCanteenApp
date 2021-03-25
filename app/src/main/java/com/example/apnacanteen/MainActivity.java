package com.example.apnacanteen;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.KeyEvent;
import android.widget.Toast;

import com.example.apnacanteen.model.FoodData;
import com.example.apnacanteen.retrofit.ApiInterface;
import com.example.apnacanteen.retrofit.RetrofitClient;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {

    ApiInterface apiInterface;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        apiInterface = RetrofitClient.getRetrofitInstance().create(ApiInterface.class);
        Call<List<FoodData>> call = new = apiInterface.getAllData();
        call.enqueue(new Callback<List<FoodData>>() {
            @Override
            public void onResponse(Call<List<FoodData>> call, Response<List<FoodData>> response) {

                List<FoodData>foodDataList = response.body();
            }

            @Override
            public void onFailure(Call<List<FoodData>> call, Throwable t) {

                Toast.makeText(MainActivity.this, "Server is not responding.", Toast.LENGTH_SHORT).show();

            }
        });
    }


}

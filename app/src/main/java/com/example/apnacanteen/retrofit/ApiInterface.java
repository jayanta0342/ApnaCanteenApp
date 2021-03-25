package com.example.apnacanteen.retrofit;

import com.example.apnacanteen.model.FoodData;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface ApiInterface {

    @GET("fooddata.json")
    Call<List<FoodData>>getAllData();




    //let's make our model class of json data




}

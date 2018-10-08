package com.johnquimbaya.marvel_cleaarchitecture.ApiClient;

import com.johnquimbaya.marvel_cleaarchitecture.Home.Model.Basic;
import com.johnquimbaya.marvel_cleaarchitecture.Home.Model.Data;
import com.johnquimbaya.marvel_cleaarchitecture.Home.Model.SuperHero;

import java.util.ArrayList;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

public interface Marvel {

    String BASE_URL="https://gateway.marvel.com/";

    String API_KEY_KEY="apikey";
    String API_KEY_VALUE="81a740022689a4eff215f0bf8c95448c";

    String TIME_STAMP_KEY="ts";
    String TIME_STAMP_VALUE="1";

    String HASH_KEY="hash";
    String HASH_VALUE="696dfe8f0aea9b17e522ceaf66ffc26e";


    @GET("v1/public/series/{seriesID}/characters?")
    Call<Basic<Data<ArrayList<SuperHero>>>> getHeroes(@Path("seriesID") int seriesId);



}

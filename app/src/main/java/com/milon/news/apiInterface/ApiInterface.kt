package com.milon.news.apiInterface

import com.milon.news.model.countryList
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query

interface ApiInterface {


   //https://newsapi.org/v2/top-headlines?country=in&page=1&apiKey=3a29c93a2e2c4e22a9982149d5e68528

   @GET("v2/top-headlines")
   fun getData(@Query("apiKey") apiKey: String, @Query("country") country: String,@Query("page") page: Int) : Call<countryList>

}
package com.mo_husen.weather_project

import retrofit2.http.GET
import retrofit2.http.Query
import retrofit2.Call

interface ApiInterface {
    @GET("weather")
    fun  getweatherData(
        @Query("q")city:String,
        @Query("appid")appid:String,
        @Query("units")units:String
        ): Call<weatherapp>
}
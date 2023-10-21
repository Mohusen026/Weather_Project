package com.mo_husen.weather_project

import android.content.ContentValues.TAG
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.mo_husen.weather_project.databinding.ActivityMainBinding
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.create

//c70834a3cc52c8f2a7e20a12209e669c
class MainActivity : AppCompatActivity() {
  private val binding:ActivityMainBinding by lazy {
      ActivityMainBinding.inflate(layoutInflater)
  }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
        fetchWeatherData()
    }

    private fun fetchWeatherData(){
    val retrofit=Retrofit.Builder()
        .addConverterFactory(GsonConverterFactory.create())
        .baseUrl("https://api.openweathermap.org/data/2.5/")
        .build().create(ApiInterface::class.java)
        val response=retrofit.getweatherData("mumbai","c70834a3cc52c8f2a7e20a12209e669c","metric")
        response.enqueue(object : Callback<weatherapp> {
            override fun onResponse(call: Call<weatherapp>, response: Response<weatherapp>) {
                val responseBody=response.body()
                if(response.isSuccessful &&  responseBody !=null){
                    val temperature=responseBody.main.temp.toString()
                   // Log.d("TAG", "onResponse: $temperature")
                    binding.temp.text="$temperature °C"
                }
            }

            override fun onFailure(call: Call<weatherapp>, t: Throwable) {
                TODO("Not yet implemented")
            }

        })

    }
}



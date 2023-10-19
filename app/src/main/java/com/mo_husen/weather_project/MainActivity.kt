package com.mo_husen.weather_project

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

//c70834a3cc52c8f2a7e20a12209e669c
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        fetchWeatherData()
    }

    private fun fetchWeatherData(){

    }
}
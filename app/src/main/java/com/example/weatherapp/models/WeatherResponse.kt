package com.example.weatherapp.models

import com.weatherapp.models.Main
import com.weatherapp.models.Sys
import com.weatherapp.models.Weather
import java.io.Serializable

data class WeatherResponse (
    val coord : Coord,
    val weather : List<Weather>,
    val base : String,
    val main : Main,
    val visibility : Int,
    val wind : Wind,
    val clouds : Clouds,
    val dt : Int,
    val sys : Sys,
    val timezone : Int,
    val id : Int,
    val name : String,
    val cod : Int
    ) : Serializable
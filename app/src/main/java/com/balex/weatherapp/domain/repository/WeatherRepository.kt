package com.balex.weatherapp.domain.repository

import com.balex.weatherapp.domain.entity.Forecast
import com.balex.weatherapp.domain.entity.Weather

interface WeatherRepository {

    suspend fun getWeather(cityId: Int): Weather

    suspend fun getForecast(cityId: Int): Forecast
}
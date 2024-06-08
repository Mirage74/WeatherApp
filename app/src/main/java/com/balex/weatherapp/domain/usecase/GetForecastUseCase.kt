package com.balex.weatherapp.domain.usecase

import com.balex.weatherapp.domain.repository.WeatherRepository
import javax.inject.Inject

class GetForecastUseCase @Inject constructor(
    private val repository: WeatherRepository
) {

    suspend operator fun invoke(cityId: Int) = repository.getForecast(cityId)
}
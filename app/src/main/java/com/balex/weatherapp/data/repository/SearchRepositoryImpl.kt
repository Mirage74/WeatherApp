package com.balex.weatherapp.data.repository

import com.balex.weatherapp.data.mapper.toEntities
import com.balex.weatherapp.data.network.api.ApiService
import com.balex.weatherapp.domain.entity.City
import com.balex.weatherapp.domain.repository.SearchRepository
import javax.inject.Inject

class SearchRepositoryImpl @Inject constructor(
    private val apiService: ApiService
) : SearchRepository {
    override suspend fun search(query: String): List<City> {
        return apiService.searchCity(query).toEntities()
    }
}
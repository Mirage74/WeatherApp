package com.balex.weatherapp.domain.repository

import com.balex.weatherapp.domain.entity.City

interface SearchRepository {

    suspend fun search(query: String): List<City>
}
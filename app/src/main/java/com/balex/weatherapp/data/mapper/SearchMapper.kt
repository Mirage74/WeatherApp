package com.balex.weatherapp.data.mapper

import com.balex.weatherapp.data.network.dto.CityDto
import com.balex.weatherapp.domain.entity.City

fun CityDto.toEntity(): City = City(id, name, country)

fun List<CityDto>.toEntities(): List<City> = map { it.toEntity() }
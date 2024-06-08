package com.balex.weatherapp.domain.usecase

import com.balex.weatherapp.domain.repository.FavouriteRepository
import javax.inject.Inject

class GetFavouriteCitiesUseCase @Inject constructor(
    private val repository: FavouriteRepository
) {

    operator fun invoke() = repository.favouriteCities
}
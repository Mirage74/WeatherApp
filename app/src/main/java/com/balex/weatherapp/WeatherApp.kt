package com.balex.weatherapp

import android.app.Application
import com.balex.weatherapp.di.ApplicationComponent
import com.balex.weatherapp.di.DaggerApplicationComponent


class WeatherApp : Application() {

    lateinit var applicationComponent: ApplicationComponent

    override fun onCreate() {
        super.onCreate()
        applicationComponent = DaggerApplicationComponent.factory().create(this)
    }
}
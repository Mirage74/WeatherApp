package com.balex.weatherapp.presentation.root

import com.arkivanov.decompose.ComponentContext

class DefaultRootComponent(
    componentContext: ComponentContext
) : RootComponent, ComponentContext by componentContext
package com.example.appparametros.navigation

import com.example.appparametros.navigation.Routes.HOME_ROUTE
import com.example.appparametros.navigation.Routes.LOGIN_ROUTE

sealed class Screens(val route: String) {
    object LoginScreen : Screens(LOGIN_ROUTE)
    object HomeScreen : Screens(HOME_ROUTE)
}
package com.example.appparametros.navigation

import androidx.compose.runtime.Composable
import com.example.appparametros.data.getUserData
import com.example.appparametros.ui.screen.HomeScreen

@Composable
fun HomeRoute(userName: String) {
    val user = getUserData(userName = userName)

    HomeScreen(user = user)
}
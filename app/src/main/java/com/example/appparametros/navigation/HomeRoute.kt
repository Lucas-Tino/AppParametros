package com.example.appparametros.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavController
import com.example.appparametros.data.getUserData
import com.example.appparametros.ui.screen.HomeScreen

@Composable
fun HomeRoute(userName: String, navController: NavController) {
    val user = getUserData(userName = userName)

    HomeScreen(user = user, navController = navController)
}
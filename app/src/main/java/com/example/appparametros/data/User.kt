package com.example.appparametros.data

data class User (
    val userId: String,
    val name: String,
    val avatarUrl: String?,
    val age: Int,
    val serie: Int,
    val birthDate: String,
    val email: String,
    val message: String
)
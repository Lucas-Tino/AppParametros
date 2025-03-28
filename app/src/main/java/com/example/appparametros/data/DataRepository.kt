package com.example.appparametros.data

val userDefault = User(
    userId = "aluno",
    name = "AlunoDS",
    avatarUrl = null,
    age = 16,
    score = 75,
    registerDate = "27/03/2025",
    email = "aluno@etec.sp.gov.br",
    bio = "Estou aprendendo a passar parâmetros no Jetpack Compose."
)

val marcelo = User(
    userId = "Marcelo",
    name = "Marcelo",
    avatarUrl = null,
    age = 51,
    score = 90,
    registerDate = "15/06/1973",
    email = "marcelo.collado@etec.sp.gov.br",
    bio = "Passei os parâmetros no Jetpack Compose."
)

fun getUserData(userName: String): User {
    return if (userName == "Marcelo") {
        marcelo
    } else {
        userDefault
    }
}
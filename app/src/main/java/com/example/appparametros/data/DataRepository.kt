package com.example.appparametros.data

val userDefault = User(
    userId = "aluno",
    name = "AlunoDS",
    avatarUrl = null,
    age = 16,
    serie = 3,
    birthDate = "27/03/2025",
    email = "aluno@etec.sp.gov.br",
    message = "Estou criando um aplicativo com passagem de parâmetros"
)

val marcelo = User(
    userId = "Marcelo",
    name = "Marcelo",
    avatarUrl = null,
    age = 51,
    serie = 90,
    birthDate = "15/06/1973",
    email = "marcelo.collado@etec.sp.gov.br",
    message = "Passei os parâmetros no Jetpack Compose."
)

fun getUserData(userName: String): User {
    return if (userName == "Marcelo") {
        marcelo
    } else {
        userDefault
    }
}
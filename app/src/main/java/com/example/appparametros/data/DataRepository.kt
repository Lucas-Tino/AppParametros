package com.example.appparametros.data

import androidx.compose.ui.text.toLowerCase
import java.util.Locale

val userDefault = User(
    userId = "aluno",
    name = "AlunoDS",
    avatarUrl = "avatar",
    age = 16,
    serie = 1,
    birthDate = "27/03/2025",
    email = "aluno@etec.sp.gov.br",
    message = "Ainda não sei o que é um aplicativo com passagem de parâmetros"
)

val lucas = User(
    userId = "Lucas",
    name = "Lucas",
    avatarUrl = "vic",
    age = 18,
    serie = 3,
    birthDate = "03/04/2007",
    email = "lucas.rosa@etec.sp.gov.br",
    message = "Estou criando um aplicativo com passagem de parâmetros"
)

val tino = User(
    userId = "Tino",
    name = "Tino",
    avatarUrl = "vig",
    age = 17,
    serie = 2,
    birthDate = "04/03/2008",
    email = "tino.rosa@etec.sp.gov.br",
    message = "Vou criar um aplicativo com passagem de parâmetros"
)

fun getUserData(userName: String): User {
    val lowercaseName = userName.toLowerCase(Locale.ROOT)
    return if (lowercaseName == "lucas") {
        lucas
    } else if (lowercaseName == "tino") {
        tino
    } else {
        userDefault
    }
}
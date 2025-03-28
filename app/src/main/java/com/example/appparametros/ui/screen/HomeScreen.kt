package com.example.appparametros.ui.screen

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.compose.rememberNavController
import com.example.appparametros.data.User
import com.example.appparametros.ui.theme.AppParametrosTheme
import com.example.appparametros.ui.theme.GreenMid

@Composable
fun HomeScreen(user: User) {
    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center,
        modifier = Modifier
            .fillMaxWidth()
            .fillMaxHeight()
            .background(Color(40, 40, 40))
    ) {
        Text(
            text = "Você está na tela Home",
            color = GreenMid,
            modifier = Modifier.padding(top = 16.dp))

        Text(
            text = "Olá usuário ${user.name}!",
            fontSize = 18.sp,
            color = GreenMid,
            modifier = Modifier.padding(top = 16.dp)
        )

        Text(
            text = "Mensagem: \"${user.message}\"",
            modifier = Modifier
                .padding(top = 16.dp)
                .padding(horizontal = 24.dp),
            fontSize = 16.sp,
            color = GreenMid,
            textAlign = TextAlign.Center
        )

        Text(
            text = "E-mail: ${user.email}",
            fontSize = 16.sp,
            color = GreenMid,
            modifier = Modifier.padding(top = 16.dp)
        )

        Text(
            text = "Data de Nascimento: ${user.birthDate}",
            fontSize = 16.sp,
            color = GreenMid,
            modifier = Modifier.padding(top = 4.dp)
        )

        Text(
            text = "Série: ${user.serie}º DS",
            fontSize = 16.sp,
            color = GreenMid,
            modifier = Modifier.padding(top = 4.dp)
        )

        Text(
            text = "Idade: ${user.age}",
            fontSize = 16.sp,
            color = GreenMid,
            modifier = Modifier.padding(top = 16.dp)
        )
    }
}

@Preview(showBackground = true)
@Composable
fun HomeScreenPreview() {
    AppParametrosTheme {
        LoginScreen(navController = rememberNavController())
    }
}
package com.example.appparametros.ui.screen

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.ImeAction
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.example.appparametros.R
import com.example.appparametros.ui.theme.AppParametrosTheme
import com.example.appparametros.ui.theme.GreenMid

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun LoginScreen(navController: NavController) {
    var text by rememberSaveable { mutableStateOf("") }

    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center,
        modifier = Modifier
            .fillMaxWidth()
            .fillMaxHeight()
            .background(Color(40, 40, 40))
    ) {
        Image(
            painter = painterResource(id = R.drawable.avatar),
            contentDescription = "Descrição Imagem",
            contentScale = ContentScale.Crop,
            modifier = Modifier
                .size(200.dp)
                .clip(CircleShape)
        )

        Text(
            text = "Login com Parâmetros",
            fontSize = 25.sp,
            fontWeight = FontWeight(700),
            maxLines = 2,
            overflow = TextOverflow.Ellipsis,
            color = GreenMid,
            modifier = Modifier.padding(top = 16.dp)
        )

        OutlinedTextField(
            value = text,
            onValueChange = { text = it},
            modifier = Modifier.padding(top = 16.dp),
            label = { Text(text = "Digite seu nome") },
            colors = TextFieldDefaults.colors(
                unfocusedIndicatorColor = GreenMid,
                unfocusedLabelColor = GreenMid,
                unfocusedContainerColor = Color(40, 40, 40),
                unfocusedTextColor = Color.White,

                focusedIndicatorColor = GreenMid,
                focusedLabelColor = GreenMid,
                focusedContainerColor = Color(40, 40, 40),
                focusedTextColor = Color.White,

                cursorColor = GreenMid
            ),
            keyboardOptions = KeyboardOptions.Default.copy(
                imeAction = ImeAction.Done,
                keyboardType = KeyboardType.Text
            ),
            singleLine = true
        )

        Button(onClick = {
                val name = text.ifEmpty { "Cara" }
                navController.navigate("home/$name") },
            colors = ButtonDefaults.buttonColors(containerColor = GreenMid),
            modifier = Modifier
                .padding(16.dp)
        ) {
            Text(
                text = "Navegar para Home",
                color = Color.White
            )
        }
    }
}

@Preview(showBackground = true)
@Composable
fun LoginScreenPreview() {
    AppParametrosTheme {
        Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
            LoginScreen(navController = rememberNavController())
        }
    }
}
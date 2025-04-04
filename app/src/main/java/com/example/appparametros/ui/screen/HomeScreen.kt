package com.example.appparametros.ui.screen

import android.annotation.SuppressLint
import android.graphics.drawable.Drawable
import android.widget.ImageView
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.example.appparametros.R
import com.example.appparametros.data.User
import com.example.appparametros.ui.theme.AppParametrosTheme
import com.example.appparametros.ui.theme.GreenMid
import com.example.appparametros.data.userDefault


@SuppressLint("DiscouragedApi")
@Composable
fun HomeScreen(user: User, navController: NavController) {
    val context = LocalContext.current
    val img = "@drawable/" + "${user.avatarUrl}"
    val imageResource: Int = context.resources.getIdentifier(img, null, context.packageName)

    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center,
        modifier = Modifier
            .fillMaxWidth()
            .fillMaxHeight()
            .background(Color(40, 40, 40))
            .padding(horizontal = 24.dp)
    ) {
        Image(
            painter = painterResource(id = imageResource),
            contentDescription = "Descrição Imagem",
            contentScale = ContentScale.Crop,
            modifier = Modifier
                .size(200.dp)
                .clip(CircleShape)
        )

        Spacer(modifier = Modifier.height(36.dp))

        Box (
            modifier = Modifier.clip(RoundedCornerShape(30.dp))
        ) {
            Column(
                horizontalAlignment = Alignment.CenterHorizontally,
                modifier = Modifier
                    .background(Color.DarkGray)
            ) {
                Text(
                    text = "Olá usuário ${user.name}!",
                    fontSize = 18.sp,
                    color = GreenMid,
                    modifier = Modifier.padding(top = 16.dp)
                )

                Text(
                    text = "\"${user.message}\"",
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
                    modifier = Modifier.padding(top = 16.dp)
                )

                Text(
                    text = "Série: ${user.serie}º DS",
                    fontSize = 16.sp,
                    color = GreenMid,
                    modifier = Modifier.padding(top = 16.dp)
                )

                Text(
                    text = "Idade: ${user.age}",
                    fontSize = 16.sp,
                    color = GreenMid,
                    modifier = Modifier.padding(top = 16.dp, bottom = 16.dp)
                )
            }
        }

        Button(onClick = {
            navController.popBackStack() },
            colors = ButtonDefaults.buttonColors(containerColor = GreenMid),
            modifier = Modifier
                .padding(16.dp)
        ) {
            Text(
                text = "Voltar",
                color = Color.White
            )
        }
    }
}

@Preview(showBackground = true)
@Composable
fun HomeScreenPreview() {
    AppParametrosTheme {
        HomeScreen(user = userDefault, navController = rememberNavController())
    }
}
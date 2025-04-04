package com.online.skystar.ui.theme.screens.home

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.material3.TooltipDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.booleanResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.online.skystar.R
import com.online.skystar.navigation.route_login
import com.online.skystar.navigation.route_register
import org.intellij.lang.annotations.JdkConstants.HorizontalAlignment

@Composable
fun Homescreen(navController: NavHostController) {
    Column(modifier = Modifier
        .fillMaxSize()
        .background(Color.White),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center) {
        Text(text = "Welcome to SkyStar",
            color = Color.Magenta,
            fontSize = 30.sp,
            fontFamily = FontFamily.Cursive
            )
        Spacer(modifier = Modifier.height(40.dp))
        Image(painter = painterResource(id = R.drawable.bffs),
            contentDescription = "bffs",
            modifier = Modifier
                .fillMaxWidth()
                .height(200.dp))

        Text(text = "This is an app for bestfriends. It will make you grow closer with the friends closest to you." +
                "There are fun-filled questions to really help you get deeper in your friendships, and very cutesy tasks and adventures to take together.",
            color = Color.Magenta,
            fontSize = 16.sp,
            fontFamily = FontFamily.Cursive

        )
        Spacer(modifier = Modifier.height(40.dp))
        Button(onClick = { navController.navigate(route_login)},
            modifier = Modifier.width(300.dp)) {
            Text(text = "Login",
                fontSize = 30.sp)
        }
        Text(text = "OR",
            color = Color.Magenta,
            fontSize = 30.sp)
        Button(onClick = { navController.navigate(route_register)},
            modifier = Modifier.width(300.dp)) {
            Text(text = "Register",
                fontSize = 30.sp)


        }



    }

}

@Preview(showBackground = true)
@Composable
private fun Sucker() {
    Homescreen(rememberNavController())

}
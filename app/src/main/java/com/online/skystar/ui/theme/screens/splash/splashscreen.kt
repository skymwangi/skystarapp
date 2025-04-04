package com.online.skystar.ui.theme.screens.splash

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.size
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
//import androidx.compose.ui.text.style.LineHeightStyle
import androidx.compose.ui.unit.dp
//import androidx.navigation.NavController
import androidx.navigation.NavHostController
//import androidx.navigation.compose.rememberNavController
import com.online.skystar.R
import com.online.skystar.navigation.route_home
import kotlinx.coroutines.delay
//import java.nio.file.WatchEvent

@Composable
fun Splashscreen(navController: NavHostController) {
    LaunchedEffect(Unit) {
        delay(3000) //Splash screen duration
        navController.navigate(route_home)

    }
    Box  (
        contentAlignment = Alignment.Center,
        modifier = Modifier.fillMaxSize()

    ) {
        //Splash screen content (logo or image)
        Image(
            painter = painterResource(id = R.drawable.sisterhood),
            contentDescription = "Splash Screen Logo",
            modifier = Modifier.size(150.dp)
        )
    }
}




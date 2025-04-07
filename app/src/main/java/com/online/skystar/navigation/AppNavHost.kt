package com.online.skystar.navigation

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavDestination
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.online.skystar.ui.theme.screens.dashboard.Dashboard_Screen
import com.online.skystar.ui.theme.screens.home.Homescreen
import com.online.skystar.ui.theme.screens.login.Loginscreen
import com.online.skystar.ui.theme.screens.register.register_screen
import com.online.skystar.ui.theme.screens.splash.Splashscreen

@Composable
fun AppNavHost(modifier: Modifier = Modifier,
               navController:NavHostController= rememberNavController(),
               startDestination: String= route_splash) {
    NavHost(navController=navController,
        modifier = modifier,
        startDestination = startDestination) {
        composable(route_home){
            Homescreen(navController)
        }
        composable(route_login){
            Loginscreen(navController)

        }
        composable(route_register){
            register_screen(navController )
        }
        composable (route_splash){
            Splashscreen(navController)
        }
        composable (route_dashboard){
            Dashboard_Screen()
        }
    }

}


package com.example.odev4.ui.screens

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController

@Composable
fun ScreenNavigation() {
    val navController = rememberNavController()

    NavHost(navController = navController, startDestination = "mainscreen") {
        composable("mainscreen") {
            TopBarScaffold(title = "Main Screen") {
                MainScreen(navController = navController)
            }

        }
        composable("screenA") {
            TopBarScaffold(title = "Screen A") {
                ScreenA(navController = navController)
            }
        }
        composable("screenB") {
            TopBarScaffold(title = "Screen B") {
                ScreenB(navController = navController)
            }
        }
        composable("screenX") {
            TopBarScaffold(title = "Screen X") {
                ScreenX(navController = navController)
            }
        }
        composable("screenY") {
            TopBarScaffold(title = "Screen Y") {
                ScreenY(navController = navController)
            }
        }

    }
}
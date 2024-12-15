package com.example.odev4.ui.screens

import androidx.activity.compose.BackHandler
import androidx.compose.material3.Button
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.navigation.NavController

@Composable
fun ScreenY(navController: NavController) {
    BackHandler(true) {
        navController.navigate("mainscreen")
    }
}
package com.example.odev4.ui.screens

import androidx.compose.foundation.layout.padding
import androidx.compose.material3.CenterAlignedTopAppBar
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun TopBarScaffold(title:String,screen: @Composable (Modifier) -> Unit) {
    Scaffold(
        topBar = {
            CenterAlignedTopAppBar(title = {
                Text(text = title)
            })
        }
    )
    {
        paddingValues ->
        screen(Modifier.padding(paddingValues))

    }
}



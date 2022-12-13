package com.example.lantiatapp

import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.layout.*
import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.material3.windowsizeclass.WindowSizeClass
import androidx.compose.material3.windowsizeclass.WindowWidthSizeClass
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController


@Composable
fun Accueil(classes: WindowSizeClass, navController: NavController) {
    val classeLargeur = classes.widthSizeClass
    when (classeLargeur) {
        WindowWidthSizeClass.Compact -> {
            Column(
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.SpaceBetween,
                modifier = Modifier.padding(vertical = 200.dp)
                    .fillMaxSize()
            ) {
                Row(
                    horizontalArrangement = Arrangement.Center,
                    modifier = Modifier.padding(25.dp)
                ) {
                    Text(text = "Colonne 1")
                    Spacer(modifier = Modifier.width(100.dp))
                    Text(text = "Colonne 2")
                }
                Button(onClick = {navController.navigate("question2")}) {
                    Text(text = "Prochaine question")
                }
            }
        }
    }
}
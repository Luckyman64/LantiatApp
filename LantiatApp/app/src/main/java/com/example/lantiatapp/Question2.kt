package com.example.lantiatapp

import android.annotation.SuppressLint
import android.view.View
import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.layout.*
import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.material3.windowsizeclass.WindowSizeClass
import androidx.compose.material3.windowsizeclass.WindowWidthSizeClass
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.lifecycle.viewModelScope
import androidx.navigation.NavController
import kotlinx.coroutines.launch


@SuppressLint("StateFlowValueCalledInComposition")
@Composable
fun Question2(classes: WindowSizeClass, navController: NavController, viewModel: MainViewModel) {
    val classeLargeur = classes.widthSizeClass
    val textInit by viewModel.textInit.collectAsState()
    when (classeLargeur) {
        WindowWidthSizeClass.Compact -> {
            Column(
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.SpaceBetween,
                modifier = Modifier
                    .padding(vertical = 200.dp)
                    .fillMaxSize()
            ) {
                var texte = "Texte initial"
                Text(text = texte)
                Button(onClick = { if(textInit){
                    viewModel.changeEtat()
                    texte = "nouveau texte"
                }else{
                    viewModel.changeEtat()
                    texte = "Texte initial"
                }}) {
                    Text(text = "Cliquez-moi")
                }
            }
        }else -> {
            Row(verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.Center,
            modifier = Modifier
                .padding(horizontal = 50.dp)
                .fillMaxSize()
            ){
                var texte = "Texte initial"
                Text(text = texte)
                Spacer(modifier = Modifier.width(200.dp))
                Button(onClick = { if(viewModel.textInit.value){
                    viewModel.changeEtat()
                    texte = "nouveau texte"
                }else{
                    viewModel.changeEtat()
                    texte = "Texte initial"
                }}) {
                    Text(text = "Cliquez-moi")
                }
            }
        }
    }
}
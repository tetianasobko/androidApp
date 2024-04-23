package com.example.coursework.composables

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.KeyboardArrowLeft
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.navigation.NavController

@Composable
fun TopBar(navController: NavController, text: String, color: Color) {
    Box(modifier = Modifier.fillMaxWidth()) {
        BackButton(navController = navController, color = color)
        Text(text = text, color = color, modifier =  Modifier.align(Alignment.Center))
    }
}
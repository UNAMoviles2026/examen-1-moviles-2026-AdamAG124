package com.moviles.examenmoviles.ui.components

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.DateRange
import androidx.compose.material.icons.filled.Home
import androidx.compose.material3.Icon
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.navigation.NavController
import androidx.navigation.compose.currentBackStackEntryAsState
import com.moviles.examenmoviles.ui.navigation.Routes

@Composable
fun AppBottomBar(navController: NavController) {
    val navBackStackEntry by navController.currentBackStackEntryAsState()
    val currentRoute = navBackStackEntry?.destination?.route

    val isOnSpaces = currentRoute == Routes.SPACE_LIST || currentRoute == Routes.SPACE_DETAIL

    NavigationBar {
        NavigationBarItem(
            selected = isOnSpaces,
            onClick = {
                navController.navigate(Routes.SPACE_LIST) {
                    popUpTo(Routes.SPACE_LIST) { inclusive = true }
                }
            },
            icon = { Icon(Icons.Default.Home, contentDescription = "Spaces") },
            label = { Text("Spaces") }
        )
        NavigationBarItem(
            selected = false,
            onClick = {},
            icon = { Icon(Icons.Default.DateRange, contentDescription = "Reservations") },
            label = { Text("Reservations") }
        )
    }
}

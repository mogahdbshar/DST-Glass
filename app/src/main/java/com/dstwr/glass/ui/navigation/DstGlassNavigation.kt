package com.dstwr.glass.ui.navigation

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import com.dstwr.glass.ui.designs.DesignsScreen
import com.dstwr.glass.ui.home.HomeScreen
import com.dstwr.glass.ui.settings.SettingsScreen
import com.dstwr.glass.ui.widgets.WidgetsScreen

@Composable
fun DstGlassNavigation() {
    var selected by remember { mutableStateOf(DstGlassDestination.HOME) }
    Scaffold(
        containerColor = Color.Transparent,
        bottomBar = {
            NavigationBar(containerColor = Color.Black.copy(.48f), tonalElevation = 0.dp) {
                DstGlassDestination.entries.forEach { destination ->
                    NavigationBarItem(
                        selected = selected == destination,
                        onClick = { selected = destination },
                        icon = { Text(if (selected == destination) "●" else "○", color = Color.White) },
                        label = { Text(destination.labelAr) }
                    )
                }
            }
        }
    ) { padding ->
        Box(Modifier.fillMaxSize()) {
            when (selected) {
                DstGlassDestination.HOME -> HomeScreen(Modifier)
                DstGlassDestination.WIDGETS -> WidgetsScreen()
                DstGlassDestination.DESIGNS -> DesignsScreen()
                DstGlassDestination.SETTINGS -> SettingsScreen()
            }
        }
    }
}

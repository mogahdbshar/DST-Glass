package com.dstwr.glass.ui.navigation

import androidx.compose.runtime.Composable
import com.dstwr.glass.ui.home.HomeScreen

/**
 * Central application entry navigation.
 *
 * Kept dependency-free for the foundation so the project does not add a
 * navigation framework until multiple real destinations require it.
 */
@Composable
fun DstGlassNavigation() {
    HomeScreen()
}

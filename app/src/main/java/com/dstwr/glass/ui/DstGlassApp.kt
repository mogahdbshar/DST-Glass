package com.dstwr.glass.ui

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.dstwr.glass.ui.home.HomeScreen
import com.dstwr.glass.ui.theme.DstGlassTheme

@Composable
fun DstGlassApp() {
    DstGlassTheme {
        Scaffold(modifier = Modifier.fillMaxSize()) { padding ->
            HomeScreen(Modifier.padding(padding))
        }
    }
}

package com.dstwr.glass.ui

import androidx.compose.runtime.Composable
import com.dstwr.glass.ui.navigation.DstGlassNavigation
import com.dstwr.glass.ui.theme.DstGlassTheme

@Composable
fun DstGlassApp() {
    DstGlassTheme {
        DstGlassNavigation()
    }
}

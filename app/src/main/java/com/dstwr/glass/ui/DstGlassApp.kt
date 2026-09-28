package com.dstwr.glass.ui

import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.ui.platform.LocalLayoutDirection
import androidx.compose.ui.unit.LayoutDirection
import com.dstwr.glass.ui.navigation.DstGlassNavigation
import com.dstwr.glass.ui.theme.DstGlassTheme

@Composable
fun DstGlassApp() {
    DstGlassTheme {
        CompositionLocalProvider(LocalLayoutDirection provides LayoutDirection.Rtl) {
            DstGlassNavigation()
        }
    }
}

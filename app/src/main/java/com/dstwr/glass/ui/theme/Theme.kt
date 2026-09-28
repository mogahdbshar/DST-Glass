package com.dstwr.glass.ui.theme

import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.darkColorScheme
import androidx.compose.runtime.Composable

private val DstDarkColors = darkColorScheme(
    primary = GlassAccent,
    background = GlassBackground,
    surface = GlassSurface
)

@Composable
fun DstGlassTheme(content: @Composable () -> Unit) {
    MaterialTheme(colorScheme = DstDarkColors, content = content)
}

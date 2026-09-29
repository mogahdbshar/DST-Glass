package com.dstwr.glass.ui.theme

import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.darkColorScheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color

private val GlassColors = darkColorScheme(
    primary = Color(0xFFB9C9FF),
    onPrimary = Color(0xFF11131A),
    secondary = Color(0xFFB9F2E6),
    background = Color(0xFF05060A),
    surface = Color(0xFF10131D),
    surfaceVariant = Color(0xFF1B2030),
    onSurface = Color.White,
    onSurfaceVariant = Color(0xFFBEC4D4)
)

@Composable
fun DstGlassTheme(content: @Composable () -> Unit) {
    MaterialTheme(
        colorScheme = GlassColors,
        typography = DstGlassTypography,
        content = content
    )
}
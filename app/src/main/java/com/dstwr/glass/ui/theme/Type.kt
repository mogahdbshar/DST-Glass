package com.dstwr.glass.ui.theme
import androidx.compose.material3.Typography
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
val DstGlassTypography=Typography().let{it.copy(headlineLarge=it.headlineLarge.copy(fontWeight=FontWeight.SemiBold),titleLarge=it.titleLarge.copy(fontWeight=FontWeight.SemiBold),bodyLarge=it.bodyLarge.copy(fontFamily=FontFamily.SansSerif))}
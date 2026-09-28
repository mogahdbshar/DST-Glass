package com.dstwr.glass.ui.theme
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.darkColorScheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
private val GlassColors=darkColorScheme(primary=Color(0xFFB9C9FF),onPrimary=Color(0xFF11131A),background=Color(0xFF05060A),surface=Color(0xFF10131D),onSurface=Color.White)
@Composable fun DstGlassTheme(content:@Composable()->Unit){MaterialTheme(colorScheme=GlassColors,content=content)}
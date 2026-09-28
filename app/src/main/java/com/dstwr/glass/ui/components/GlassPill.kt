package com.dstwr.glass.ui.components

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp

@Composable
fun GlassPill(text: String, active: Boolean = false) {
    val shape = RoundedCornerShape(50)
    Row(
        modifier = Modifier
            .background(Color.White.copy(if (active) .16f else .07f), shape)
            .border(1.dp, Color.White.copy(if (active) .24f else .10f), shape)
            .padding(horizontal = 14.dp, vertical = 8.dp)
    ) { Text(text, color = Color.White.copy(if (active) 1f else .70f)) }
}

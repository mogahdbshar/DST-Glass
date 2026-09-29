package com.dstwr.glass.ui.widgets

import androidx.compose.foundation.layout.*
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import com.dstwr.glass.ui.components.GlassSurface

@Composable
fun WidgetPreviewScreen() {
    Column(
        modifier = Modifier.fillMaxSize().padding(20.dp),
        verticalArrangement = Arrangement.spacedBy(16.dp)
    ) {
        Text("معاينة الويدجت", color = Color.White, style = MaterialTheme.typography.headlineMedium)
        GlassSurface {
            Column(
                modifier = Modifier.padding(24.dp),
                verticalArrangement = Arrangement.spacedBy(8.dp)
            ) {
                Text("DST Glass", color = Color.White)
                Text("09:41", color = Color.White, style = MaterialTheme.typography.displayMedium)
                Text("الأحد • 29 سبتمبر", color = Color.White.copy(alpha = .65f))
            }
        }
    }
}
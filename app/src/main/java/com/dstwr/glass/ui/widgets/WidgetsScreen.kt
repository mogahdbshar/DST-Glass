package com.dstwr.glass.ui.widgets

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import com.dstwr.glass.ui.components.GlassPill
import com.dstwr.glass.ui.components.GlassSurface

@Composable
fun WidgetsScreen() {
    Column(Modifier.fillMaxSize().padding(20.dp), verticalArrangement = Arrangement.spacedBy(18.dp)) {
        Text("الويدجت", color = Color.White, fontWeight = FontWeight.Bold,
            style = androidx.compose.material3.MaterialTheme.typography.headlineMedium)
        Text("حوّل شاشتك الرئيسية إلى طبقات زجاجية حية.",
            color = Color.White.copy(.68f))
        GlassSurface(Modifier.fillMaxWidth()) {
            Column(Modifier.padding(20.dp), verticalArrangement = Arrangement.spacedBy(14.dp)) {
                Text("الساعة الزجاجية", color = Color.White,
                    style = androidx.compose.material3.MaterialTheme.typography.titleLarge)
                Text("09:41", color = Color.White, style = androidx.compose.material3.MaterialTheme.typography.displaySmall)
                Row(horizontalArrangement = Arrangement.spacedBy(8.dp)) {
                    GlassPill("شفاف", true)
                    GlassPill("داكن")
                }
            }
        }
        GlassSurface(Modifier.fillMaxWidth()) {
            Column(Modifier.padding(20.dp), verticalArrangement = Arrangement.spacedBy(8.dp)) {
                Text("المعلومات اليومية", color = Color.White, fontWeight = FontWeight.SemiBold)
                Text("الطقس • التقويم • البطارية • التاريخ",
                    color = Color.White.copy(.62f))
            }
        }
    }
}

package com.dstwr.glass.ui.editor

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Slider
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableFloatStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.getValue
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import com.dstwr.glass.ui.components.GlassSurface

@Composable
fun DesignEditorScreen() {
    var intensity by remember { mutableFloatStateOf(.65f) }
    Column(Modifier.fillMaxSize().padding(20.dp), verticalArrangement = Arrangement.spacedBy(18.dp)) {
        Text("تخصيص الزجاج", color = Color.White,
            style = androidx.compose.material3.MaterialTheme.typography.headlineMedium)
        GlassSurface(Modifier.fillMaxWidth()) {
            Column(Modifier.padding(20.dp), verticalArrangement = Arrangement.spacedBy(12.dp)) {
                Text("معاينة", color = Color.White)
                Text("DST Glass", color = Color.White,
                    style = androidx.compose.material3.MaterialTheme.typography.displaySmall)
                Text("طبقة زجاجية متكيفة مع الخلفية",
                    color = Color.White.copy(.62f))
            }
        }
        Text("شدة الزجاج", color = Color.White)
        Slider(value = intensity, onValueChange = { intensity = it })
        Text("الحواف والشفافية والسطوع ستتوسع هنا مع نظام التصميم الكامل.",
            color = Color.White.copy(.55f))
    }
}

package com.dstwr.glass.ui.settings

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import com.dstwr.glass.ui.components.GlassSurface

@Composable
fun SettingsScreen() {
    Column(Modifier.fillMaxSize().padding(20.dp), verticalArrangement = Arrangement.spacedBy(14.dp)) {
        Text("الإعدادات", color = Color.White, fontWeight = FontWeight.Bold,
            style = androidx.compose.material3.MaterialTheme.typography.headlineMedium)
        Text("تحكم في تجربة DST Glass.", color = Color.White.copy(.65f))
        Setting("المظهر", "داكن • زجاجي")
        Setting("اللغة", "العربية")
        Setting("الأداء", "متكيف مع الجهاز")
        Setting("حول DST Glass", "الإصدار 0.1.0")
    }
}
@Composable
private fun Setting(title: String, value: String) {
    GlassSurface(Modifier.fillMaxWidth()) {
        Column(Modifier.padding(17.dp), verticalArrangement = Arrangement.spacedBy(5.dp)) {
            Text(title, color = Color.White, fontWeight = FontWeight.SemiBold)
            Text(value, color = Color.White.copy(.58f))
        }
    }
}

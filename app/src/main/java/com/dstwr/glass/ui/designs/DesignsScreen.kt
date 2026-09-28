package com.dstwr.glass.ui.designs

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
import com.dstwr.glass.ui.components.GlassSurface

@Composable
fun DesignsScreen() {
    Column(Modifier.fillMaxSize().padding(20.dp), verticalArrangement = Arrangement.spacedBy(16.dp)) {
        Text("التصاميم", color = Color.White, fontWeight = FontWeight.Bold,
            style = androidx.compose.material3.MaterialTheme.typography.headlineMedium)
        Text("اختر شخصية الزجاج ثم خصّصها كما تريد.", color = Color.White.copy(.66f))
        Row(Modifier.fillMaxWidth(), horizontalArrangement = Arrangement.spacedBy(12.dp)) {
            DesignCard("Midnight", "زجاج ليلي", Modifier.weight(1f))
            DesignCard("Aurora", "زجاج مضيء", Modifier.weight(1f))
        }
        Row(Modifier.fillMaxWidth(), horizontalArrangement = Arrangement.spacedBy(12.dp)) {
            DesignCard("Crystal", "شفافية صافية", Modifier.weight(1f))
            DesignCard("Obsidian", "عمق داكن", Modifier.weight(1f))
        }
    }
}

@Composable
private fun DesignCard(title: String, subtitle: String, modifier: Modifier) {
    GlassSurface(modifier) {
        Column(Modifier.padding(16.dp), verticalArrangement = Arrangement.spacedBy(7.dp)) {
            Text(title, color = Color.White, fontWeight = FontWeight.SemiBold)
            Text(subtitle, color = Color.White.copy(.58f))
            Text("تخصيص", color = Color(0xFFB9C9FF))
        }
    }
}

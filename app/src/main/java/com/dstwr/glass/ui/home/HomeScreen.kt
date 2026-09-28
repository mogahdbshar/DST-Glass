package com.dstwr.glass.ui.home

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import com.dstwr.glass.ui.components.GlassCard

@Composable
fun HomeScreen(modifier: Modifier = Modifier) {
    Column(
        modifier = modifier.fillMaxSize().background(
            Brush.verticalGradient(listOf(Color(0xFF090B12), Color(0xFF151B2B), Color(0xFF090B12)))
        ).padding(20.dp),
        verticalArrangement = Arrangement.spacedBy(18.dp)
    ) {
        Text("DST Glass", style = MaterialTheme.typography.headlineMedium,
            fontWeight = FontWeight.SemiBold, color = Color.White)
        Text("Widgets designed as living glass.",
            style = MaterialTheme.typography.bodyLarge, color = Color.White.copy(alpha = .72f))
        GlassCard(Modifier.fillMaxWidth()) {
            Column(Modifier.padding(22.dp), verticalArrangement = Arrangement.spacedBy(14.dp)) {
                Text("Glass Engine", style = MaterialTheme.typography.titleLarge, color = Color.White)
                Row(horizontalArrangement = Arrangement.spacedBy(10.dp)) {
                    Text("Adaptive", color = Color.White.copy(alpha = .82f))
                    Text("•", color = Color.White.copy(alpha = .35f))
                    Text("Widget-ready", color = Color.White.copy(alpha = .82f))
                }
            }
        }
    }
}

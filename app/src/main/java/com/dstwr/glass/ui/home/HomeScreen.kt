package com.dstwr.glass.ui.home

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import com.dstwr.glass.ui.components.GlassPill
import com.dstwr.glass.ui.components.GlassSurface

@Composable
fun HomeScreen(modifier: Modifier = Modifier) {
    Column(
        modifier = modifier.fillMaxSize().background(
            Brush.radialGradient(listOf(Color(0xFF27365F), Color(0xFF0A0C14), Color(0xFF050609)))
        ).padding(20.dp),
        verticalArrangement = Arrangement.spacedBy(18.dp)
    ) {
        Spacer(Modifier.height(8.dp))
        Text("DST Glass", color = Color.White, fontWeight = FontWeight.Bold,
            style = androidx.compose.material3.MaterialTheme.typography.headlineLarge)
        Text("زجاج حيّ يتكيف مع جهازك.", color = Color.White.copy(.68f))
        GlassSurface(Modifier.fillMaxWidth()) {
            Column(Modifier.padding(22.dp), verticalArrangement = Arrangement.spacedBy(16.dp)) {
                Row(Modifier.fillMaxWidth(), horizontalArrangement = Arrangement.SpaceBetween) {
                    Column {
                        Text("09:41", color = Color.White,
                            style = androidx.compose.material3.MaterialTheme.typography.displayMedium)
                        Text("الأحد • 29 سبتمبر", color = Color.White.copy(.58f))
                    }
                    GlassPill("متكيف", true)
                }
                Text("شاشة واحدة. شخصية كاملة.", color = Color.White, fontWeight = FontWeight.SemiBold)
                Text("ابدأ من التصاميم أو أضف أول ويدجت إلى شاشتك الرئيسية.",
                    color = Color.White.copy(.62f))
            }
        }
        Text("مساحتك", color = Color.White, fontWeight = FontWeight.SemiBold)
        Row(Modifier.fillMaxWidth(), horizontalArrangement = Arrangement.spacedBy(12.dp)) {
            GlassSurface(Modifier.weight(1f)) {
                Column(Modifier.padding(17.dp)) {
                    Text("4", color = Color.White, style = androidx.compose.material3.MaterialTheme.typography.headlineMedium)
                    Text("تصاميم", color = Color.White.copy(.58f))
                }
            }
            GlassSurface(Modifier.weight(1f)) {
                Column(Modifier.padding(17.dp)) {
                    Text("1", color = Color.White, style = androidx.compose.material3.MaterialTheme.typography.headlineMedium)
                    Text("ويدجت", color = Color.White.copy(.58f))
                }
            }
        }
        GlassSurface(Modifier.fillMaxWidth()) {
            Column(Modifier.padding(18.dp), verticalArrangement = Arrangement.spacedBy(6.dp)) {
                Text("محرك الزجاج", color = Color.White, fontWeight = FontWeight.SemiBold)
                Text("الرسم: متكيف • الأداء: متوازن • Android: متوافق",
                    color = Color.White.copy(.58f))
            }
        }
    }
}

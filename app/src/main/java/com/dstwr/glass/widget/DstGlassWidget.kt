package com.dstwr.glass.widget

import androidx.compose.ui.graphics.Color
import androidx.glance.GlanceId
import androidx.glance.GlanceModifier
import androidx.glance.appwidget.GlanceAppWidget
import androidx.glance.appwidget.provideContent
import androidx.glance.background
import androidx.glance.layout.*
import androidx.glance.text.Text
import androidx.glance.text.TextStyle
import androidx.glance.unit.ColorProvider
import androidx.compose.ui.unit.dp

class DstGlassWidget : GlanceAppWidget() {
    override suspend fun provideGlance(context: android.content.Context, id: GlanceId) {
        provideContent {
            Box(
                GlanceModifier.fillMaxSize()
                    .background(ColorProvider(Color(0xCC151B2B)))
                    .padding(18.dp),
                contentAlignment = Alignment.Center
            ) {
                Column(horizontalAlignment = Alignment.CenterHorizontally) {
                    Text("DST Glass", style = TextStyle(color = ColorProvider(Color.White)))
                    Text("زجاج حي", style = TextStyle(color = ColorProvider(Color.White.copy(alpha = .68f))))
                }
            }
        }
    }
}

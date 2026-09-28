package com.dstwr.glass.widget
import androidx.compose.runtime.Composable
import androidx.glance.GlanceId
import androidx.glance.GlanceModifier
import androidx.glance.appwidget.GlanceAppWidget
import androidx.glance.appwidget.provideContent
import androidx.glance.background
import androidx.glance.layout.Alignment
import androidx.glance.layout.Column
import androidx.glance.layout.fillMaxSize
import androidx.glance.text.Text
import androidx.glance.text.TextStyle
import androidx.glance.unit.ColorProvider
import androidx.compose.ui.graphics.Color
class DstGlassWidget:GlanceAppWidget(){override suspend fun provideGlance(context:android.content.Context,id:GlanceId)=provideContent{WidgetContent()}}
@Composable private fun WidgetContent(){Column(GlanceModifier.fillMaxSize().background(ColorProvider(Color(0xCC10131D))),verticalAlignment=Alignment.CenterVertically,horizontalAlignment=Alignment.CenterHorizontally){Text("DST Glass",style=TextStyle(color=ColorProvider(Color.White)));Text("زجاج حي",style=TextStyle(color=ColorProvider(Color.White.copy(.68f))))}}
package com.dstwr.glass.ui.widgets
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import com.dstwr.glass.widget.WidgetPreview
@Composable fun WidgetPreviewCard(preview:WidgetPreview){val shape=RoundedCornerShape(preview.state.corner.dp);Column(Modifier.fillMaxWidth().background(Color.White.copy(alpha=preview.state.opacity*.22f),shape).border(1.dp,Color.White.copy(.22f),shape).padding(18.dp)){Text(preview.type.titleAr,color=Color.White);Text(preview.type.subtitleAr,color=Color.White.copy(.6f));Spacer(Modifier.height(8.dp));Text(when(preview.type){com.dstwr.glass.widget.WidgetCatalog.CLOCK->"09:41";com.dstwr.glass.widget.WidgetCatalog.SYSTEM->"86%";com.dstwr.glass.widget.WidgetCatalog.DAILY->"اليوم";com.dstwr.glass.widget.WidgetCatalog.WEATHER->"24°"},color=Color.White)}}
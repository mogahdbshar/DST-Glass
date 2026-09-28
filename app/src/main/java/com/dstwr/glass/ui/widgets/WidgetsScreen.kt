package com.dstwr.glass.ui.widgets
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import com.dstwr.glass.widget.*
@Composable fun WidgetsScreen(){val previews=WidgetCatalog.entries.map{WidgetPreview(it,WidgetSizeClass.MEDIUM)};LazyColumn(Modifier.fillMaxSize().padding(20.dp),verticalArrangement=Arrangement.spacedBy(14.dp)){item{Text("الويدجتات",color=Color.White,fontWeight=FontWeight.Bold,style=androidx.compose.material3.MaterialTheme.typography.headlineLarge);Text("اختر ويدجت ثم خصص مظهره.",color=Color.White.copy(.62f))};items(previews){WidgetPreviewCard(it)}}}
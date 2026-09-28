package com.dstwr.glass.ui.widgets
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import com.dstwr.glass.ui.components.GlassSurface
import com.dstwr.glass.widget.*
@Composable fun WidgetGalleryScreen(){var selected by remember{mutableStateOf(WidgetCatalog.CLOCK)};LazyColumn(Modifier.fillMaxSize().padding(20.dp),verticalArrangement=Arrangement.spacedBy(12.dp)){item{Text("مكتبة الويدجتات",color=Color.White,fontWeight=FontWeight.Bold,style=androidx.compose.material3.MaterialTheme.typography.headlineLarge)};item{Text("صمّم ثم اختر المقاس المناسب.",color=Color.White.copy(.6f))};items(WidgetCatalog.entries.toList()){type->GlassSurface(Modifier.fillMaxWidth()){Column(Modifier.padding(18.dp)){Text(type.titleAr,color=Color.White,fontWeight=FontWeight.SemiBold);Text(type.subtitleAr,color=Color.White.copy(.58f));Text(if(selected==type)"جاهز للمعاينة" else "اضغط لاختيار هذا النوع",color=Color.White.copy(.45f))}}}}}
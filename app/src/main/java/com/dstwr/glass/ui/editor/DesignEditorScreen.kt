package com.dstwr.glass.ui.editor
import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import com.dstwr.glass.ui.components.GlassSurface
@Composable fun DesignEditorScreen(){var opacity by remember{mutableFloatStateOf(.72f)};var blur by remember{mutableFloatStateOf(.65f)};var radius by remember{mutableFloatStateOf(.65f)};Column(Modifier.fillMaxSize().padding(20.dp),verticalArrangement=Arrangement.spacedBy(14.dp)){Text("تخصيص الزجاج",color=Color.White,style=MaterialTheme.typography.headlineLarge);GlassSurface(Modifier.fillMaxWidth()){Column(Modifier.padding(22.dp),verticalArrangement=Arrangement.spacedBy(8.dp)){Text("DST Glass",color=Color.White,style=MaterialTheme.typography.displayMedium);Text("معاينة مباشرة",color=Color.White.copy(.58f))}}Control("شفافية",opacity){opacity=it};Control("نعومة الزجاج",blur){blur=it};Control("استدارة الحواف",radius){radius=it};Text("تتغير المعاينة مباشرة، ويمكن لاحقًا حفظ التصميم كوصفة كاملة.",color=Color.White.copy(.55f))}}
@Composable private fun Control(label:String,value:Float,onChange:(Float)->Unit){Column{Text(label,color=Color.White);Slider(value=value,onValueChange=onChange)}}
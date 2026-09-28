package com.dstwr.glass.ui.designs
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import com.dstwr.glass.ui.components.GlassSurface
private data class Design(val name:String,val ar:String,val accent:Color)
private val designs=listOf(Design("Midnight","زجاج ليلي",Color(0xFF9FB7FF)),Design("Aurora","زجاج مضيء",Color(0xFFB9F2E6)),Design("Crystal","شفافية صافية",Color(0xFFE0E8FF)),Design("Obsidian","عمق داكن",Color(0xFFBDA9FF)))
@Composable fun DesignsScreen(){var selected by remember{mutableIntStateOf(0)};Column(Modifier.fillMaxSize().padding(20.dp),verticalArrangement=Arrangement.spacedBy(16.dp)){Text("التصاميم",color=Color.White,fontWeight=FontWeight.Bold,style=MaterialTheme.typography.headlineLarge);Text("اختر شخصية الزجاج ثم خصصها.",color=Color.White.copy(.62f));designs.chunked(2).forEachIndexed{r,pair->Row(Modifier.fillMaxWidth(),horizontalArrangement=Arrangement.spacedBy(12.dp)){pair.forEachIndexed{c,d->val i=r*2+c;GlassSurface(Modifier.weight(1f).clickable{selected=i}){Column(Modifier.padding(16.dp),verticalArrangement=Arrangement.spacedBy(8.dp)){Text(d.name,color=d.accent,fontWeight=FontWeight.Bold);Text(d.ar,color=Color.White);Text(if(selected==i)"محدد" else "تحديد",color=Color.White.copy(.58f))}}}}};GlassSurface(Modifier.fillMaxWidth()){Column(Modifier.padding(18.dp)){Text("التصميم الحالي: "+designs[selected].name,color=Color.White,fontWeight=FontWeight.SemiBold);Text("يمكن تخصيص الزجاج من شاشة التخصيص.",color=Color.White.copy(.55f))}}}}
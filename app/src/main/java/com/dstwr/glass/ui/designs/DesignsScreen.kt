package com.dstwr.glass.ui.designs
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.grid.*
import androidx.compose.material3.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import com.dstwr.glass.core.design.GlassPresets
import com.dstwr.glass.ui.components.GlassSurface
@Composable fun DesignsScreen(){var selected by remember{mutableStateOf(0)};LazyVerticalGrid(columns=GridCells.Fixed(2),modifier=Modifier.fillMaxSize().padding(20.dp),verticalArrangement=Arrangement.spacedBy(12.dp),horizontalArrangement=Arrangement.spacedBy(12.dp)){item(span={GridItemSpan(2)}){Column{Text("التصاميم",color=Color.White,fontWeight=FontWeight.Bold,style=androidx.compose.material3.MaterialTheme.typography.headlineLarge);Text("شخصيات زجاجية جاهزة للتخصيص.",color=Color.White.copy(.62f))}};itemsIndexed(GlassPresets.all){i,p->GlassSurface(Modifier.fillMaxWidth().clickable{selected=i}){Column(Modifier.padding(16.dp),verticalArrangement=Arrangement.spacedBy(8.dp)){Text(p.nameAr,color=Color.White,fontWeight=FontWeight.SemiBold);Text(p.id,color=Color.White.copy(.42f));Text(if(selected==i)"محدد" else "اختيار",color=Color.White.copy(.62f))}}}}}
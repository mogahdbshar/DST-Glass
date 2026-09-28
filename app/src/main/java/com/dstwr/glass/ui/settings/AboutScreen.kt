package com.dstwr.glass.ui.settings
import androidx.compose.foundation.layout.*
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import com.dstwr.glass.ui.components.GlassSurface
@Composable fun AboutScreen(){Column(Modifier.fillMaxSize().padding(20.dp),verticalArrangement=Arrangement.spacedBy(14.dp)){Text("عن DST Glass",color=Color.White,fontWeight=FontWeight.Bold,style=androidx.compose.material3.MaterialTheme.typography.headlineLarge);GlassSurface(Modifier.fillMaxWidth()){Column(Modifier.padding(20.dp),verticalArrangement=Arrangement.spacedBy(8.dp)){Text("DST Glass",color=Color.White,style=androidx.compose.material3.MaterialTheme.typography.displaySmall);Text("زجاج متكيف، مصمم ليعيش داخل نظام Android.",color=Color.White.copy(.7f));Text("نسخة المنتج: 1.0 • هوية DSTWR",color=Color.White.copy(.48f))}}}}
package com.dstwr.glass.ui.settings
import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import com.dstwr.glass.ui.components.GlassSurface
@Composable fun SettingsScreen(){var adaptive by remember{mutableStateOf(true)};var motion by remember{mutableStateOf(true)};Column(Modifier.fillMaxSize().padding(20.dp),verticalArrangement=Arrangement.spacedBy(14.dp)){Text("الإعدادات",color=Color.White,fontWeight=FontWeight.Bold,style=MaterialTheme.typography.headlineLarge);Text("كل ما تحتاجه لتضبط التجربة.",color=Color.White.copy(.62f));GlassSurface(Modifier.fillMaxWidth()){Row(Modifier.fillMaxWidth().padding(17.dp),horizontalArrangement=Arrangement.SpaceBetween){Column(Modifier.weight(1f)){Text("التكيف الذكي",color=Color.White,fontWeight=FontWeight.SemiBold);Text("أفضل محرك متاح للجهاز",color=Color.White.copy(.55f))};Switch(adaptive,{adaptive=it})}};GlassSurface(Modifier.fillMaxWidth()){Row(Modifier.fillMaxWidth().padding(17.dp),horizontalArrangement=Arrangement.SpaceBetween){Column(Modifier.weight(1f)){Text("الحركة والمؤثرات",color=Color.White,fontWeight=FontWeight.SemiBold);Text("تفعيل الحركة الناعمة",color=Color.White.copy(.55f))};Switch(motion,{motion=it})}};GlassSurface(Modifier.fillMaxWidth()){Column(Modifier.padding(17.dp)){Text("اللغة",color=Color.White,fontWeight=FontWeight.SemiBold);Text("العربية • RTL",color=Color.White.copy(.55f))}};GlassSurface(Modifier.fillMaxWidth()){Column(Modifier.padding(17.dp)){Text("DST Glass",color=Color.White,fontWeight=FontWeight.SemiBold);Text("إصدار المنتج 1.0",color=Color.White.copy(.55f))}}}}
package com.dstwr.glass.ui.home
import androidx.compose.animation.core.*
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material3.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.alpha
import androidx.compose.ui.draw.blur
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import com.dstwr.glass.core.platform.currentPlatformCapabilities
import com.dstwr.glass.ui.components.GlassPill
import com.dstwr.glass.ui.components.GlassSurface
@Composable fun HomeScreen(modifier:Modifier=Modifier){val pulse by rememberInfiniteTransition(label="glass").animateFloat(.72f,1f,infiniteRepeatable(tween(2200),RepeatMode.Reverse),label="pulse");val cap=remember{currentPlatformCapabilities()};Column(modifier.fillMaxSize().background(Brush.radialGradient(listOf(Color(0xFF344B86),Color(0xFF111625),Color(0xFF05060A)))).padding(20.dp),verticalArrangement=Arrangement.spacedBy(16.dp)){Spacer(Modifier.height(8.dp));Row(Modifier.fillMaxWidth(),horizontalArrangement=Arrangement.SpaceBetween){Column{Text("DST Glass",color=Color.White,fontWeight=FontWeight.Bold,style=androidx.compose.material3.MaterialTheme.typography.headlineLarge);Text("مساحتك الزجاجية",color=Color.White.copy(.58f))};GlassPill("متكيف",true)};Box{Box(Modifier.matchParentSize().blur(34.dp).alpha(pulse).background(Color(0xFF8CA7FF).copy(.24f)));GlassSurface(Modifier.fillMaxWidth()){Column(Modifier.padding(22.dp),verticalArrangement=Arrangement.spacedBy(12.dp)){Text("09:41",color=Color.White,style=androidx.compose.material3.MaterialTheme.typography.displayLarge);Text("واجهة زجاجية متكيفة",color=Color.White,fontWeight=FontWeight.SemiBold);Text("يتحول المحرك تلقائيًا بحسب قدرات جهازك.",color=Color.White.copy(.64f));Text("المحرك: "+cap.rendererKind,color=Color.White.copy(.48f))}}};Text("ابدأ من هنا",color=Color.White,fontWeight=FontWeight.SemiBold);GlassSurface(Modifier.fillMaxWidth()){Column(Modifier.padding(18.dp)){Text("الويدجتات",color=Color.White,fontWeight=FontWeight.SemiBold);Text("ساعة، نظام، يوم وطقس.",color=Color.White.copy(.58f))}};GlassSurface(Modifier.fillMaxWidth()){Column(Modifier.padding(18.dp)){Text("التصاميم",color=Color.White,fontWeight=FontWeight.SemiBold);Text("اختر شخصية الزجاج وعدّلها.",color=Color.White.copy(.58f))}}}}
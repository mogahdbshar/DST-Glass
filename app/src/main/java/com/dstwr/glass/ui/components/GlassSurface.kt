package com.dstwr.glass.ui.components
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
@Composable fun GlassSurface(modifier:Modifier=Modifier,radius:Int=28,content:@Composable()->Unit){val shape=RoundedCornerShape(radius.dp);Box(modifier.background(Brush.linearGradient(listOf(Color.White.copy(.17f),Color.White.copy(.055f),Color.White.copy(.10f))),shape).border(1.dp,Color.White.copy(.18f),shape)){content()}}
package com.dstwr.glass.ui.components
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
@Composable fun GlassPill(text:String,active:Boolean=false){val shape=RoundedCornerShape(50);Row(Modifier.background(if(active)Color.White.copy(.16f) else Color.White.copy(.08f),shape).border(1.dp,Color.White.copy(.15f),shape).padding(horizontal=12.dp,vertical=7.dp)){Text(text,color=Color.White.copy(if(active)1f else .7f))}}
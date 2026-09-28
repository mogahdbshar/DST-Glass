package com.dstwr.glass.ui.editor
import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import com.dstwr.glass.ui.components.GlassSurface
@Composable fun DesignEditorScreen(){Column(Modifier.fillMaxSize().padding(20.dp),verticalArrangement=Arrangement.spacedBy(14.dp)){Text("تخصيص الزجاج",color=Color.White,style=MaterialTheme.typography.headlineLarge);GlassSurface(Modifier.fillMaxWidth()){Column(Modifier.padding(22.dp),verticalArrangement=Arrangement.spacedBy(8.dp)){Text("DST Glass",color=Color.White,style=MaterialTheme.typography.displayMedium);Text("معاينة مباشرة",color=Color.White.copy(.58f))}};Text("الشفافية",color=Color.White);Slider(value=.72f,onValueChange={});Text("نعومة الزجاج",color=Color.White);Slider(value=.65f,onValueChange={});Text("استدارة الحواف",color=Color.White);Slider(value=.65f,onValueChange={});Button(onClick={}){Text("حفظ التصميم")};Text("التغييرات جاهزة للحفظ كإعداد تصميم.",color=Color.White.copy(.55f))}}
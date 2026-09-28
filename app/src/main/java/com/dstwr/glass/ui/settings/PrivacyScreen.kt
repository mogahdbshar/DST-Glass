package com.dstwr.glass.ui.settings
import androidx.compose.foundation.layout.*
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import com.dstwr.glass.ui.components.GlassSurface
@Composable fun PrivacyScreen(){Column(Modifier.fillMaxSize().padding(20.dp),verticalArrangement=Arrangement.spacedBy(14.dp)){Text("الخصوصية",color=Color.White,style=androidx.compose.material3.MaterialTheme.typography.headlineLarge);GlassSurface(Modifier.fillMaxWidth()){Column(Modifier.padding(18.dp),verticalArrangement=Arrangement.spacedBy(8.dp)){Text("لا توجد صلاحيات خطرة",color=Color.White);Text("DST Glass لا يحتاج إلى الموقع أو الكاميرا أو جهات الاتصال أو التخزين للوصول إلى وظائفه الأساسية.",color=Color.White.copy(.62f))}};GlassSurface(Modifier.fillMaxWidth()){Column(Modifier.padding(18.dp)){Text("البيانات المحلية",color=Color.White);Text("إعدادات التصميم تحفظ محليًا على الجهاز.",color=Color.White.copy(.62f))}}}}
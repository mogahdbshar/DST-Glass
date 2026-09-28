package com.dstwr.glass.ui.widgets
import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import com.dstwr.glass.widget.*
@Composable fun WidgetBuilderScreen(){var type by remember{mutableStateOf(WidgetCatalog.CLOCK)};var size by remember{mutableStateOf(WidgetSizeClass.MEDIUM)};Column(Modifier.fillMaxSize().padding(20.dp),verticalArrangement=Arrangement.spacedBy(14.dp)){Text("منشئ الويدجت",color=Color.White,style=MaterialTheme.typography.headlineLarge);Text("ابنِ شكل الويدجت قبل إضافته للشاشة.",color=Color.White.copy(.6f));Text("النوع",color=Color.White);SingleChoiceSegmentedButtonRow{WidgetCatalog.entries.forEach{item->SegmentedButton(type==item,{type=item},{Text(item.titleAr)})}};Text("المقاس",color=Color.White);SingleChoiceSegmentedButtonRow{WidgetSizeClass.entries.forEach{item->SegmentedButton(size==item,{size=item},{Text(item.name)})}};Spacer(Modifier.height(8.dp));WidgetPreviewCard(WidgetPreview(type,size));Button(Modifier.fillMaxWidth(),onClick={}){Text("حفظ وإضافة الويدجت")}}}
package com.dstwr.glass.ui.widgets

import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import com.dstwr.glass.widget.*

@Composable
fun WidgetBuilderScreen() {
    var type by remember { mutableStateOf(WidgetCatalog.CLOCK) }
    var size by remember { mutableStateOf(WidgetSizeClass.MEDIUM) }

    Column(
        modifier = Modifier.fillMaxSize().padding(20.dp),
        verticalArrangement = Arrangement.spacedBy(14.dp)
    ) {
        Text("منشئ الويدجت", color = Color.White, style = MaterialTheme.typography.headlineLarge)
        Text("ابنِ شكل الويدجت قبل إضافته للشاشة.", color = Color.White.copy(alpha = .6f))

        Text("النوع", color = Color.White)
        SingleChoiceSegmentedButtonRow(modifier = Modifier.fillMaxWidth()) {
            WidgetCatalog.entries.forEachIndexed { index, item ->
                SegmentedButton(
                    selected = type == item,
                    onClick = { type = item },
                    shape = SegmentedButtonDefaults.itemShape(index, WidgetCatalog.entries.size),
                    label = { Text(item.titleAr) }
                )
            }
        }

        Text("المقاس", color = Color.White)
        SingleChoiceSegmentedButtonRow(modifier = Modifier.fillMaxWidth()) {
            WidgetSizeClass.entries.forEachIndexed { index, item ->
                SegmentedButton(
                    selected = size == item,
                    onClick = { size = item },
                    shape = SegmentedButtonDefaults.itemShape(index, WidgetSizeClass.entries.size),
                    label = { Text(item.name) }
                )
            }
        }

        Spacer(Modifier.height(8.dp))
        WidgetPreviewCard(WidgetPreview(type = type, size = size))

        Button(
            onClick = {},
            modifier = Modifier.fillMaxWidth()
        ) {
            Text("حفظ وإضافة الويدجت")
        }
    }
}
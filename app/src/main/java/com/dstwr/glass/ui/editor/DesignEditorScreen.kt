package com.dstwr.glass.ui.editor

import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.lifecycle.compose.collectAsStateWithLifecycle
import androidx.lifecycle.viewmodel.compose.viewModel
import com.dstwr.glass.ui.components.GlassSurface

@Composable
fun DesignEditorScreen(vm: DesignEditorViewModel = viewModel()) {
    val state by vm.state.collectAsStateWithLifecycle()

    Column(
        Modifier.fillMaxSize().padding(20.dp),
        verticalArrangement = Arrangement.spacedBy(14.dp)
    ) {
        Text("تخصيص الزجاج", color = Color.White, style = MaterialTheme.typography.headlineLarge)

        GlassSurface(Modifier.fillMaxWidth(), radius = state.radiusDp) {
            Column(
                Modifier.padding(22.dp),
                verticalArrangement = Arrangement.spacedBy(8.dp)
            ) {
                Text("DST Glass", color = Color.White, style = MaterialTheme.typography.displayMedium)
                Text("معاينة مباشرة", color = Color.White.copy(.58f))
            }
        }

        Text("الشفافية", color = Color.White)
        Slider(value = state.opacity, onValueChange = vm::updateOpacity)

        Text("نعومة الزجاج", color = Color.White)
        Slider(value = state.blur, onValueChange = vm::updateBlur)

        Text("استدارة الحواف", color = Color.White)
        Slider(value = state.radius, onValueChange = vm::updateRadius)

        Button(onClick = {}) { Text("حفظ التصميم") }
        Text("التغييرات محفوظة داخل جلسة التخصيص.", color = Color.White.copy(.55f))
    }
}
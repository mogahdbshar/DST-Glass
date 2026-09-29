package com.dstwr.glass.ui.home

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.dstwr.glass.core.design.GlassDesign
import com.dstwr.glass.core.design.GlassPresets
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.launch

class HomeViewModel : ViewModel() {
    private val _preset = MutableStateFlow(GlassPresets.midnight)
    val preset: StateFlow<GlassDesign> = _preset

    fun selectPreset(id: String) {
        viewModelScope.launch {
            _preset.value = GlassPresets.all.firstOrNull { it.id == id } ?: GlassPresets.midnight
        }
    }
}
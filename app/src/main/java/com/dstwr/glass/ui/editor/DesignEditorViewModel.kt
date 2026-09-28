package com.dstwr.glass.ui.editor
import androidx.lifecycle.ViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
class DesignEditorViewModel:ViewModel(){
 private val _state=MutableStateFlow(DesignEditorState())
 val state:StateFlow<DesignEditorState> = _state
 fun updateOpacity(v:Float){_state.value=_state.value.copy(opacity=v.coerceIn(0f,1f))}
 fun updateBlur(v:Float){_state.value=_state.value.copy(blur=v.coerceIn(0f,1f))}
 fun updateRadius(v:Float){_state.value=_state.value.copy(radius=v.coerceIn(.1f,1f))}
}
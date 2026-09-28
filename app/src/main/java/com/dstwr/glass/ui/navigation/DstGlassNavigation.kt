package com.dstwr.glass.ui.navigation
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import com.dstwr.glass.ui.designs.DesignsScreen
import com.dstwr.glass.ui.editor.DesignEditorScreen
import com.dstwr.glass.ui.home.HomeScreen
import com.dstwr.glass.ui.settings.SettingsScreen
import com.dstwr.glass.ui.widgets.WidgetsScreen
@Composable fun DstGlassNavigation(){var selected by remember{mutableStateOf(DstGlassDestination.HOME)};Scaffold(containerColor=Color.Transparent,bottomBar={NavigationBar(Modifier.background(Color.Black.copy(.58f)),containerColor=Color.Transparent,tonalElevation=0.dp){DstGlassDestination.entries.forEach{d->NavigationBarItem(selected==d,{selected=d},icon={Text(if(selected==d)"●" else "○",color=Color.White)},label={Text(d.labelAr)})}}}){when(selected){DstGlassDestination.HOME->HomeScreen();DstGlassDestination.WIDGETS->WidgetsScreen();DstGlassDestination.DESIGNS->DesignsScreen();DstGlassDestination.SETTINGS->SettingsScreen();DstGlassDestination.EDITOR->DesignEditorScreen()}}}
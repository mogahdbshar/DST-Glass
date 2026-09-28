package com.dstwr.glass.core.platform
import android.os.Build
data class PlatformCapabilities(val api:Int,val nativeBlur:Boolean,val advancedShaders:Boolean,val rendererKind:String)
fun currentPlatformCapabilities()=PlatformCapabilities(Build.VERSION.SDK_INT,Build.VERSION.SDK_INT>=Build.VERSION_CODES.S,Build.VERSION.SDK_INT>=Build.VERSION_CODES.TIRAMISU,if(Build.VERSION.SDK_INT>=Build.VERSION_CODES.S)"Native Glass" else "Adaptive Glass")
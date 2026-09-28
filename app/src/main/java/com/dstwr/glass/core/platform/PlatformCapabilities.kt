package com.dstwr.glass.core.platform
import android.os.Build
data class PlatformCapabilities(val api:Int,val nativeBlur:Boolean,val advancedShaders:Boolean,val rendererKind:String,val supportsDynamicColors:Boolean)
fun currentPlatformCapabilities():PlatformCapabilities{val api=Build.VERSION.SDK_INT;return PlatformCapabilities(api,api>=Build.VERSION_CODES.S,api>=Build.VERSION_CODES.TIRAMISU,when{api>=35->"Native Glass+";api>=31->"Native Glass";else->"Adaptive Glass"},api>=Build.VERSION_CODES.S)}}
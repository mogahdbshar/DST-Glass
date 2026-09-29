package com.dstwr.glass.core.platform

import android.os.Build

data class PlatformCapabilities(
    val api: Int,
    val nativeBlur: Boolean,
    val advancedShaders: Boolean,
    val rendererKind: String,
    val supportsDynamicColors: Boolean
)

fun currentPlatformCapabilities(): PlatformCapabilities {
    val api = Build.VERSION.SDK_INT
    return PlatformCapabilities(
        api = api,
        nativeBlur = api >= Build.VERSION_CODES.S,
        advancedShaders = api >= Build.VERSION_CODES.TIRAMISU,
        rendererKind = when {
            api >= 35 -> "زجاج أصلي متقدم"
            api >= 31 -> "زجاج أصلي"
            else -> "زجاج متكيف"
        },
        supportsDynamicColors = api >= Build.VERSION_CODES.S
    )
}
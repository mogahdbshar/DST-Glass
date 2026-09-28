package com.dstwr.glass.core.platform

import android.os.Build

data class PlatformCapabilities(
    val api: Int,
    val nativeBlur: Boolean,
    val advancedShaders: Boolean
)

fun currentPlatformCapabilities() = PlatformCapabilities(
    api = Build.VERSION.SDK_INT,
    nativeBlur = Build.VERSION.SDK_INT >= Build.VERSION_CODES.S,
    advancedShaders = Build.VERSION.SDK_INT >= Build.VERSION_CODES.TIRAMISU
)

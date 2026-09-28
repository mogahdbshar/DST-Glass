package com.dstwr.glass.core.design
import com.dstwr.glass.core.platform.PlatformCapabilities
enum class GlassRendererKind{NATIVE,SHADER,FALLBACK}
fun selectRenderer(c:PlatformCapabilities)=when{c.nativeBlur->GlassRendererKind.NATIVE;c.advancedShaders->GlassRendererKind.SHADER;else->GlassRendererKind.FALLBACK}
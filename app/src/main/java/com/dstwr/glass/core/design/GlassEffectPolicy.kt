package com.dstwr.glass.core.design
import com.dstwr.glass.core.platform.PlatformCapabilities
data class GlassEffectPolicy(val blurEnabled:Boolean,val blurStrength:Float,val glowEnabled:Boolean)
fun effectPolicy(c:PlatformCapabilities)=if(c.nativeBlur)GlassEffectPolicy(true,.9f,true)else if(c.advancedShaders)GlassEffectPolicy(true,.55f,true)else GlassEffectPolicy(false,.25f,false)
package com.dstwr.glass.core.design
data class GlassPreset(val id:String,val nameAr:String,val opacity:Float,val blur:Float,val corner:Float,val accent:Long)
object GlassPresets{
 val midnight=GlassPreset("midnight","منتصف الليل",.72f,.70f,28f,0xFF9FB7FF)
 val aurora=GlassPreset("aurora","الشفق",.68f,.82f,30f,0xFFB9F2E6)
 val crystal=GlassPreset("crystal","الكريستال",.56f,.92f,32f,0xFFE0E8FF)
 val obsidian=GlassPreset("obsidian","الأوبسيديان",.82f,.45f,24f,0xFFBDA9FF)
 val all=listOf(midnight,aurora,crystal,obsidian)
}
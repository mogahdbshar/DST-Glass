package com.dstwr.glass.core.design

data class GlassDesign(
    val id: String,
    val nameAr: String,
    val accent: Long,
    val opacity: Float = .72f,
    val blur: Float = .65f,
    val corner: Float = 28f
)

object GlassPresets {
    val all = listOf(
        GlassDesign("midnight", "منتصف الليل", 0xFFB9C9FF),
        GlassDesign("aurora", "الشفق", 0xFFB9F2E6, .68f, .72f, 30f),
        GlassDesign("crystal", "الكريستال", 0xFFFFFFFF, .58f, .82f, 32f),
        GlassDesign("obsidian", "الأوبسيديان", 0xFFE1D0FF, .78f, .5f, 26f)
    )
    val midnight: GlassDesign get() = all.first { it.id == "midnight" }
}
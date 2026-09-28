package com.dstwr.glass.widget
data class WidgetLayoutSpec(val sizeClass:WidgetSizeClass,val minWidthDp:Int,val minHeightDp:Int)
object WidgetLayouts{val small=WidgetLayoutSpec(WidgetSizeClass.SMALL,110,60);val medium=WidgetLayoutSpec(WidgetSizeClass.MEDIUM,180,110);val large=WidgetLayoutSpec(WidgetSizeClass.LARGE,250,160)}
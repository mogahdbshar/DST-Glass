package com.dstwr.glass.widget
data class WidgetLayoutSpec(val columns:Int,val rows:Int,val compact:Boolean)
fun WidgetSizeClass.spec():WidgetLayoutSpec=when(this){WidgetSizeClass.SMALL->WidgetLayoutSpec(2,1,true);WidgetSizeClass.MEDIUM->WidgetLayoutSpec(4,2,false);WidgetSizeClass.LARGE->WidgetLayoutSpec(4,4,false);WidgetSizeClass.WIDE->WidgetLayoutSpec(6,2,false)}
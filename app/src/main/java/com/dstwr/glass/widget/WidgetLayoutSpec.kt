package com.dstwr.glass.widget
data class WidgetLayoutSpec(val columns:Int,val rows:Int,val compact:Boolean)
fun WidgetSizeClass.spec()=WidgetLayoutSpec(columns,rows,this==WidgetSizeClass.SMALL)
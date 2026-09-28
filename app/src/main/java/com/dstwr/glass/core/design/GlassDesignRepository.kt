package com.dstwr.glass.core.design
import com.dstwr.glass.widget.WidgetDesignState
class GlassDesignRepository{
 fun preset(id:String):WidgetDesignState{val p=GlassPresets.all.firstOrNull{it.id==id}?:GlassPresets.midnight;return WidgetDesignState(p.opacity,p.blur,p.corner,p.accent)}
 fun presets()=GlassPresets.all
}
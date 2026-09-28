package com.dstwr.glass.core.storage
import android.content.Context
import com.dstwr.glass.widget.WidgetDesignState
import org.json.JSONObject
class GlassDesignStore(context:Context){
 private val prefs=context.getSharedPreferences("dst_glass_designs",Context.MODE_PRIVATE)
 fun save(state:WidgetDesignState){prefs.edit().putString("current",JSONObject().apply{put("opacity",state.opacity);put("blur",state.blur);put("corner",state.corner);put("accent",state.accent)}.toString()).apply()}
 fun load():WidgetDesignState{val raw=prefs.getString("current",null)?:return WidgetDesignState();return runCatching{val j=JSONObject(raw);WidgetDesignState(j.optDouble("opacity",.72).toFloat(),j.optDouble("blur",.65).toFloat(),j.optDouble("corner",28.0).toFloat(),j.optLong("accent",0xFFB9C9FF))}.getOrDefault(WidgetDesignState())}
}
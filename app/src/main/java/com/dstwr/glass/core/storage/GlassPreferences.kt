package com.dstwr.glass.core.storage
import android.content.Context
class GlassPreferences(context:Context){
 private val prefs=context.getSharedPreferences("dst_glass_preferences",Context.MODE_PRIVATE)
 fun selectedPreset():String=prefs.getString("selected_preset","midnight")?:"midnight"
 fun setSelectedPreset(id:String){prefs.edit().putString("selected_preset",id).apply()}
 fun motionEnabled():Boolean=prefs.getBoolean("motion_enabled",true)
 fun setMotionEnabled(value:Boolean){prefs.edit().putBoolean("motion_enabled",value).apply()}
}
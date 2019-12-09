package com.niku.sample01.common.utils

import android.content.res.Resources
import android.graphics.drawable.Drawable
import androidx.annotation.ColorRes
import androidx.annotation.DrawableRes
import androidx.annotation.StringRes
import androidx.core.content.ContextCompat
import com.niku.sample01.common.ApplactionInject

/**
 * 作者 ：wangJiang
 * 时间 ：2019/11/28
 * 描述 ：资源相关的一些方法
 */
inline fun getResources(): Resources {
    return ApplactionInject.getApplication().resources
}

inline fun getDensity():Float{
    return getResources().displayMetrics.density
}


inline fun getString(@StringRes resId:Int):String{
    return getResources().getString(resId)
}

inline fun getResColor(@ColorRes resId:Int):Int{
    return ContextCompat.getColor(ApplactionInject.getApplication(),resId)
}

inline fun getDrawable(@DrawableRes resId:Int):Drawable{
    val drawable = ContextCompat.getDrawable(ApplactionInject.getApplication(),resId)
        ?: throw Error("drawable is null")
    return drawable!!
}
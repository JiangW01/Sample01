package com.niku.sample01.common.utils

import android.content.Context
import android.util.DisplayMetrics
import android.view.WindowManager
import com.niku.sample01.common.ApplactionInject

/**
 * 作者 ：wangJiang
 * 时间 ：2019/11/28
 * 描述 ：
 */

/**
 * 获取屏幕宽度
 * @return 屏幕宽度
 */
inline fun getScreenWidth():Int{
    val windowManager = ApplactionInject.getApplication().getSystemService(Context.WINDOW_SERVICE) as WindowManager
    val dm = DisplayMetrics()// 创建了一张白纸
    windowManager.defaultDisplay.getMetrics(dm)// 给白纸设置宽高
    return dm.widthPixels
}

/**
 * 获取屏幕高度
 * @return 屏幕高度
 */
inline fun getScreenHeight():Int{
    val windowManager = ApplactionInject.getApplication().getSystemService(Context.WINDOW_SERVICE) as WindowManager
    val dm = DisplayMetrics()// 创建了一张白纸
    windowManager.defaultDisplay.getMetrics(dm)// 给白纸设置宽高
    return dm.widthPixels
}


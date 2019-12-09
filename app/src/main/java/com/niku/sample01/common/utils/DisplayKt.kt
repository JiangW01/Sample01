package com.niku.sample01.common.utils

import kotlin.math.roundToInt

/**
 * 作者 ：wangJiang
 * 时间 ：2019/11/28
 * 描述 ：
 */

inline fun dpToPx(dpValue:Int):Int{
    val scale = getDensity()
    return (dpValue * scale).roundToInt()
}

inline fun dpToPx(dpValue:Float):Int{
    val scale = getDensity()
    return (dpValue * scale).roundToInt()
}

inline fun dpToPx2(dpValue:Int):Float{
    val scale = getDensity()
    return (dpValue * scale)
}

inline fun dpToPx2(dpValue:Float):Float{
    val scale = getDensity()
    return (dpValue * scale)
}

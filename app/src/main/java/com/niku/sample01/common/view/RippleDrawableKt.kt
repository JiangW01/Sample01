package com.niku.sample01.common.view

import android.content.res.ColorStateList
import android.graphics.Color
import android.graphics.drawable.Drawable
import android.graphics.drawable.GradientDrawable
import android.graphics.drawable.RippleDrawable
import android.graphics.drawable.StateListDrawable
import android.os.Build
import android.view.View
import android.widget.ImageView
import androidx.annotation.DrawableRes
import com.niku.sample01.common.utils.getDrawable

/**
 * 作者 ：wangJiang
 * 时间 ：2019/12/13
 * 描述 ：
 */




fun View?.ripple(rippleColor:Int,
                 fillColor: Int = -1,
                 strokeWidth: Int = -1,
                 strokeColor: Int = Color.TRANSPARENT,
                 cornerRadius: Float = -1f,
                 gradientType: Int = GradientDrawable.RECTANGLE,
                 maskFillColor: Int = -1,
                 maskStrokeWidth: Int = -1,
                 maskStrokeColor: Int = Color.TRANSPARENT,
                 maskCornerRadius: Float = -1f,
                 maskGradientType: Int = GradientDrawable.RECTANGLE){
    val contentDrawable = if(fillColor != -1){
        buildDrawable(fillColor,cornerRadius,strokeWidth,strokeColor,gradientType)
    }else {null}
    val maskDrawable = if(maskFillColor != -1){
        buildDrawable(maskFillColor,maskCornerRadius,maskStrokeWidth,maskStrokeColor,maskGradientType)
    }else {null}
    ripple(rippleColor,contentDrawable,maskDrawable)
}

fun View?.rippleRes(rippleColor:Int,
                 @DrawableRes contentDrawbleRes:Int = -1,
                 @DrawableRes maskDrawbleRes:Int = -1){
    val contentDrawable = if(contentDrawbleRes != -1){
        getDrawable(contentDrawbleRes)
    }else null
    val maskDrawable = if(maskDrawbleRes != -1){
        getDrawable(maskDrawbleRes)
    }else null
    ripple(rippleColor,contentDrawable,maskDrawable)
}




fun ImageView?.rippleSrc(rippleColor:Int,
                 @DrawableRes contentDrawbleRes:Int = -1,
                 @DrawableRes maskDrawbleRes:Int = -1){
    val contentDrawable = if(contentDrawbleRes != -1){
        getDrawable(contentDrawbleRes)
    }else null
    val maskDrawable = if(maskDrawbleRes != -1){
        getDrawable(maskDrawbleRes)
    }else null
    rippleSrc(rippleColor,contentDrawable,maskDrawable)
}


fun ImageView?.rippleSrc(rippleColor:Int,contentDrawable:Drawable? = null,maskDrawable:Drawable? = null){
    val colorStateList = ColorStateList(arrayOf(intArrayOf()), intArrayOf(rippleColor))
    val rippleDrawable = RippleDrawable(colorStateList,contentDrawable,maskDrawable)
    this?.let {
        it.setImageDrawable(rippleDrawable)
    }
}

fun View?.ripple(rippleColor:Int,contentDrawable:Drawable? = null,maskDrawable:Drawable? = null){
    if(Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP ){
        val colorStateList = ColorStateList(arrayOf(intArrayOf()), intArrayOf(rippleColor))
        val rippleDrawable = RippleDrawable(colorStateList,contentDrawable,maskDrawable)
        this?.let {
            it.background = rippleDrawable
        }
    }else{
        this?.let { view->
            contentDrawable?.let {
                view.background = it
            }
        }
    }
}

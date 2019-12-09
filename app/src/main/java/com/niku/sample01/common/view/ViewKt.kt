package com.niku.sample01.common.view

import android.view.View

/**
 * 作者 ：wangJiang
 * 时间 ：2019/11/28
 * 描述 ：
 */


/**********  显示/隐藏 View  *******************/
fun View?.setVisible(visible:Boolean){
    this?.apply {
        visibility = if(visible) View.VISIBLE else View.GONE
    }
}

fun View?.setVisibleOrInvisible(visible:Boolean){
    this?.apply {
        visibility = if (visible) View.VISIBLE else View.INVISIBLE
    }
}

inline fun setVisible(visible: Boolean,vararg views:View){
    views.forEach {
        it.setVisible(visible)
    }
}

inline fun setVisibleOrInvisible(visible: Boolean,vararg views:View){
    views.forEach {
        it.setVisibleOrInvisible(visible)
    }
}





package com.niku.sample01.common.view

import android.graphics.drawable.Drawable
import android.graphics.drawable.StateListDrawable
import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.annotation.DrawableRes
import com.niku.sample01.common.utils.getDrawable

/**
 * 作者 ：wangJiang
 * 时间 ：2019/12/5
 * 描述 ：
 */


fun ImageView?.pressed(@DrawableRes normalRes:Int,@DrawableRes pressedRes:Int){
    this?.apply {
        val sd = buildStateListDrawable()
            .pressed(getDrawable(pressedRes))
            .normal(getDrawable(normalRes))
        setImageDrawable(sd)
    }
}


fun ImageView?.enable(@DrawableRes normalRes:Int,@DrawableRes pressedRes:Int,reversed:Boolean = true){
    this?.apply {
        val sd = buildStateListDrawable()
            .enable(getDrawable(pressedRes),reversed)
            .normal(getDrawable(normalRes))
        setImageDrawable(sd)
    }
}


fun TextView?.leftCheckedCompoundDrawable(@DrawableRes normalRes:Int,@DrawableRes checkedRes:Int){
    this?.apply {
        val sd = buildStateListDrawable()
            .checked(getDrawable(checkedRes))
            .normal(getDrawable(normalRes))
        setCompoundDrawablesWithIntrinsicBounds(sd,null,null,null)
    }
}

fun TextView?.topCheckedCompoundDrawable(@DrawableRes normalRes:Int,@DrawableRes checkedRes:Int){
    this?.apply {
        val sd = buildStateListDrawable()
            .checked(getDrawable(checkedRes))
            .normal(getDrawable(normalRes))
        setCompoundDrawablesWithIntrinsicBounds(null,sd,null,null)
    }
}


fun TextView?.rightCheckedCompoundDrawable(@DrawableRes normalRes:Int,@DrawableRes checkedRes:Int){
    this?.apply {
        val sd = buildStateListDrawable()
            .checked(getDrawable(checkedRes))
            .normal(getDrawable(normalRes))
        setCompoundDrawablesWithIntrinsicBounds(null,null,sd,null)
    }
}

fun TextView?.bottomCheckedCompoundDrawable(@DrawableRes normalRes:Int,@DrawableRes checkedRes:Int){
    this?.apply {
        val sd = buildStateListDrawable()
            .checked(getDrawable(checkedRes))
            .normal(getDrawable(normalRes))
        setCompoundDrawablesWithIntrinsicBounds(null,null,null,sd)
    }
}

fun View?.pressed(normalDrawable:Drawable,pressedDrawable: Drawable){
    this?.apply {
        val sd = buildStateListDrawable()
            .pressed(pressedDrawable)
            .normal(normalDrawable)
        background = sd
    }
}

fun View?.enable(normalDrawable:Drawable,enableDrawable: Drawable,reversed:Boolean = true){
    this?.apply {
        val sd = buildStateListDrawable()
            .enable(enableDrawable,reversed)
            .normal(normalDrawable)
        background = sd
    }
}

fun View?.setStateDrawable(stateDrawable:StateListDrawable){
    this?.apply {
        background = stateDrawable
    }
}


inline fun buildStateListDrawable():StateListDrawable{
    return StateListDrawable()
}

fun StateListDrawable.pressed(pressedDrawable:Drawable,reversed:Boolean = true):StateListDrawable{
    if(reversed){
        addState(intArrayOf(android.R.attr.state_pressed),pressedDrawable)
    }else{
        addState(intArrayOf(-android.R.attr.state_pressed),pressedDrawable)
    }
    return this
}

fun StateListDrawable.enable(enableDrawable:Drawable,reversed:Boolean = true):StateListDrawable{
    if(reversed){
        addState(intArrayOf(android.R.attr.state_enabled),enableDrawable)
    }else{
        addState(intArrayOf(-android.R.attr.state_enabled),enableDrawable)
    }
    return this
}


fun StateListDrawable.selected(drawable: Drawable,reversed:Boolean = true):StateListDrawable{
    if(reversed){
        addState(intArrayOf(android.R.attr.state_selected),drawable)
    }else{
        addState(intArrayOf(-android.R.attr.state_selected),drawable)
    }
    return this
}

fun StateListDrawable.checked(drawable: Drawable,reversed:Boolean = true):StateListDrawable{
    if(reversed){
        addState(intArrayOf(android.R.attr.state_checked),drawable)
    }else{
        addState(intArrayOf(-android.R.attr.state_checked),drawable)
    }
    return this
}



fun StateListDrawable.normal(drawable: Drawable):StateListDrawable{
    addState(intArrayOf(),drawable)
    return this
}
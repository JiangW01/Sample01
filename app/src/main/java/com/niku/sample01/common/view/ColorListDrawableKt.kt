package com.niku.sample01.common.view

import android.content.res.ColorStateList
import android.widget.TextView

/**
 * 作者 ：wangJiang
 * 时间 ：2019/12/9
 * 描述 ：
 */


fun TextView?.pressedTextColor(normalColor:Int,pressedColor:Int,reversed:Boolean = true){
    this?.apply {
        val colorStateList = if(reversed){
            ColorStateList(arrayOf(intArrayOf(android.R.attr.state_pressed),
                intArrayOf()), intArrayOf(pressedColor,normalColor))
        }else{
            ColorStateList(arrayOf(intArrayOf(-android.R.attr.state_pressed),
                intArrayOf()), intArrayOf(pressedColor,normalColor))
        }
        setTextColor(colorStateList)
    }
}

fun TextView?.checkedTextColor(normalColor:Int,checkedColor:Int,reversed:Boolean = true){
    this?.apply {
        val colorStateList = if(reversed){
            ColorStateList(arrayOf(intArrayOf(android.R.attr.state_checked),
                intArrayOf()), intArrayOf(checkedColor,normalColor))
        }else{
            ColorStateList(arrayOf(intArrayOf(-android.R.attr.state_checked),
                intArrayOf()), intArrayOf(checkedColor,normalColor))
        }
        setTextColor(colorStateList)
    }
}

fun TextView?.enabledTextColor(normalColor:Int,enableColor:Int,reversed:Boolean = true){
    this?.apply {
        val colorStateList = if(reversed){
            ColorStateList(arrayOf(intArrayOf(android.R.attr.state_enabled),
                intArrayOf()), intArrayOf(enableColor,normalColor))
        }else{
            ColorStateList(arrayOf(intArrayOf(-android.R.attr.state_enabled),
                intArrayOf()), intArrayOf(enableColor,normalColor))
        }
        setTextColor(colorStateList)
    }
}



class ColorStateBuilder{

    private val map = mutableMapOf<IntArray,Int>()

    fun addStateColor(state:IntArray,color:Int):ColorStateBuilder{
        map[state] = color
        return this
    }

    fun normalTextColor(color: Int):ColorStateBuilder{
        map[intArrayOf()] = color
        return this
    }

    fun pressedTextColor(color: Int,reversed:Boolean = true):ColorStateBuilder{
        if(reversed){
            map[intArrayOf(android.R.attr.state_pressed)] = color
        }else{
            map[intArrayOf(-android.R.attr.state_pressed)] = color
        }
        return this
    }

    fun enableTextColor(color: Int,reversed:Boolean = true):ColorStateBuilder{
        if(reversed){
            map[intArrayOf(android.R.attr.state_enabled)] = color
        }else{
            map[intArrayOf(-android.R.attr.state_enabled)] = color
        }
        return this
    }


    fun checkedTextColor(color: Int,reversed:Boolean = true):ColorStateBuilder{
        if(reversed){
            map[intArrayOf(android.R.attr.state_checked)] = color
        }else{
            map[intArrayOf(-android.R.attr.state_checked)] = color
        }
        return this
    }


    fun selectedTextColor(color: Int,reversed:Boolean = true):ColorStateBuilder{
        if(reversed){
            map[intArrayOf(android.R.attr.state_selected)] = color
        }else{
            map[intArrayOf(-android.R.attr.state_selected)] = color
        }
        return this
    }


    fun focusedTextColor(color: Int,reversed:Boolean = true):ColorStateBuilder{
        if(reversed){
            map[intArrayOf(android.R.attr.state_focused)] = color
        }else{
            map[intArrayOf(-android.R.attr.state_focused)] = color
        }
        return this
    }

    fun build():ColorStateList{
        val states = mutableListOf<IntArray>()
        val colors = mutableListOf<Int>()
        map.forEach {
            val key = it.key
            val value = it.value
            states.add(key)
            colors.add(value)
        }
        val statesArray = states.toTypedArray()
        val colorsArray:IntArray = colors.toIntArray()
        return ColorStateList(statesArray,colorsArray)
    }

}
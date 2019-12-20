package com.niku.sample01.common.view

import android.annotation.SuppressLint
import android.graphics.Color
import android.graphics.drawable.GradientDrawable
import android.graphics.drawable.GradientDrawable.RECTANGLE
import android.view.View

/**
 * 作者 ：wangJiang
 * 时间 ：2019/12/5
 * 描述 ：
 */


/**
 * 给view设置背景drawable
 * @param fillColor 填充颜色
 * @param cornerRadius 圆角的半径
 * @param strokeWidth 边框的宽度
 * @param strokeColor 边框的颜色
 */
@SuppressLint("WrongConstant")
fun View?.shapeDrawable(
    fillColor: Int,
    cornerRadius: Float = 0f,
    strokeWidth: Int = -1,
    strokeColor: Int = Color.TRANSPARENT,
    gradientType: Int = RECTANGLE
) {
    this?.apply {
        background = buildDrawable(fillColor, cornerRadius, strokeWidth, strokeColor, gradientType)
    }
}

/**
 * 给view设置背景drawable
 * @param fillColor 填充颜色
 * @param leftTopCornerRadius 左上圆角的半径
 * @param leftBottomCornerRadius 左下圆角的半径
 * @param rightTopCornerRadius 右上圆角的半径
 * @param rightBottomCornerRadius 右下圆角的半径
 * @param strokeWidth 边框的宽度
 * @param strokeColor 边框的颜色
 */
@SuppressLint("WrongConstant")
fun View?.shapeDrawable(
    fillColor: Int,
    strokeWidth: Int = -1,
    strokeColor: Int = Color.TRANSPARENT,
    leftTopCornerRadius: Float = 0f,
    leftBottomCornerRadius: Float = 0f,
    rightTopCornerRadius: Float = 0f,
    rightBottomCornerRadius: Float = 0f,
    gradientType: Int = RECTANGLE
) {
    shapeDrawable(
        fillColor,
        strokeWidth,
        strokeColor,
        leftTopCornerRadius,
        leftTopCornerRadius,
        rightTopCornerRadius,
        rightBottomCornerRadius,
        leftBottomCornerRadius,
        leftBottomCornerRadius
        ,
        rightBottomCornerRadius,
        rightBottomCornerRadius,
        gradientType
    )
}

/**
 * 给view设置背景drawable
 * @param fillColor 填充颜色
 * @param strokeWidth 边框的宽度
 * @param strokeColor 边框的颜色
 * @param leftTopCornerRadiusX 左上圆角的半径X
 * @param leftTopCornerRadiusY 左上圆角的半径Y
 * @param leftBottomCornerRadiusX 左下圆角的半径X
 * @param leftBottomCornerRadiusY 左下圆角的半径Y
 * @param rightTopCornerRadiusX 右上圆角的半径X
 * @param rightTopCornerRadiusY 右上圆角的半径Y
 * @param rightBottomCornerRadiusX 右下圆角的半径X
 * @param rightBottomCornerRadiusY 右下圆角的半径Y
 */
@SuppressLint("WrongConstant")
fun View?.shapeDrawable(
    fillColor: Int,
    strokeWidth: Int = -1,
    strokeColor: Int = Color.TRANSPARENT,
    leftTopCornerRadiusX: Float = 0f,
    leftTopCornerRadiusY: Float = 0f,
    rightTopCornerRadiusX: Float = 0f,
    rightTopCornerRadiusY: Float = 0f,
    leftBottomCornerRadiusX: Float = 0f,
    leftBottomCornerRadiusY: Float = 0f,
    rightBottomCornerRadiusX: Float = 0f,
    rightBottomCornerRadiusY: Float = 0f,
    gradientType: Int = RECTANGLE
) {
    this?.apply {
        background = buildDrawable(
            fillColor, strokeWidth, strokeColor,
            leftTopCornerRadiusX, leftTopCornerRadiusY,
            rightTopCornerRadiusX, rightTopCornerRadiusY,
            leftBottomCornerRadiusX, leftBottomCornerRadiusY,
            rightBottomCornerRadiusX, rightBottomCornerRadiusY, gradientType
        )
    }
}


/**
 * 给view设置矩形背景
 * @param fillColor 填充颜色
 * @param strokeWidth 边框的宽度
 * @param strokeColor 边框的颜色
 */
fun View?.rect(fillColor: Int, strokeWidth: Int = -1, strokeColor: Int = Color.TRANSPARENT) {
    this?.apply {
        shapeDrawable(fillColor, strokeWidth = strokeWidth, strokeColor = strokeColor)
    }
}


/**
 * 给view设置圆角矩形背景
 * @param fillColor 填充颜色
 * @param strokeWidth 边框的宽度
 * @param strokeColor 边框的颜色
 * @param leftTopCornerRadiusX 左上圆角的半径X
 * @param leftTopCornerRadiusY 左上圆角的半径Y
 * @param leftBottomCornerRadiusX 左下圆角的半径X
 * @param leftBottomCornerRadiusY 左下圆角的半径Y
 * @param rightTopCornerRadiusX 右上圆角的半径X
 * @param rightTopCornerRadiusY 右上圆角的半径Y
 * @param rightBottomCornerRadiusX 右下圆角的半径X
 * @param rightBottomCornerRadiusY 右下圆角的半径Y
 */
fun View?.roundRect(
    fillColor: Int, strokeWidth: Int = -1, strokeColor: Int = Color.TRANSPARENT,
    leftTopCornerRadiusX: Float = 0f, leftTopCornerRadiusY: Float = 0f,
    rightTopCornerRadiusX: Float = 0f, rightTopCornerRadiusY: Float = 0f,
    leftBottomCornerRadiusX: Float = 0f, leftBottomCornerRadiusY: Float = 0f,
    rightBottomCornerRadiusX: Float = 0f, rightBottomCornerRadiusY: Float = 0f
) {
    this?.apply {
        shapeDrawable(
            fillColor,
            strokeWidth,
            strokeColor,
            leftTopCornerRadiusX,
            leftTopCornerRadiusY,
            rightTopCornerRadiusX,
            rightTopCornerRadiusY,
            leftBottomCornerRadiusX,
            leftBottomCornerRadiusY,
            rightBottomCornerRadiusX,
            rightBottomCornerRadiusY
        )
    }
}

/**
 * 给view设置圆角矩形背景
 * @param fillColor 填充颜色
 * @param leftTopCornerRadius 左上圆角的半径
 * @param leftBottomCornerRadius 左下圆角的半径
 * @param rightTopCornerRadius 右上圆角的半径
 * @param rightBottomCornerRadius 右上圆角的半径
 * @param strokeWidth 边框的宽度
 * @param strokeColor 边框的颜色
 */
fun View?.roundRect(
    fillColor: Int, strokeWidth: Int = -1, strokeColor: Int = Color.TRANSPARENT,
    leftTopCornerRadius: Float = 0f, leftBottomCornerRadius: Float = 0f,
    rightTopCornerRadius: Float = 0f, rightBottomCornerRadius: Float = 0f
) {
    this?.apply {
        shapeDrawable(
            fillColor,
            strokeWidth,
            strokeColor,
            leftTopCornerRadius,
            leftBottomCornerRadius,
            rightTopCornerRadius,
            rightBottomCornerRadius
        )
    }
}

/**
 * 给view设置圆角矩形背景(四个角圆角大小不同)
 * @param fillColor 填充颜色
 * @param cornerRadius 圆角的半径
 * @param strokeWidth 边框的宽度
 * @param strokeColor 边框的颜色
 */
fun View?.roundRect(
    fillColor: Int,
    cornerRadius: Float = -1f,
    strokeWidth: Int = -1,
    strokeColor: Int = Color.TRANSPARENT
) {
    this?.apply {
        shapeDrawable(
            fillColor,
            cornerRadius = cornerRadius,
            strokeWidth = strokeWidth,
            strokeColor = strokeColor
        )
    }
}

/**
 * 给view设置椭圆背景
 * @param fillColor 填充颜色
 * @param strokeWidth 边框的宽度
 * @param strokeColor 边框的颜色
 */
fun View?.ovel(fillColor: Int, strokeWidth: Int = -1, strokeColor: Int = Color.TRANSPARENT) {
    this?.apply {
        shapeDrawable(fillColor, strokeWidth, strokeColor, gradientType = GradientDrawable.OVAL)
    }
}

/**
 * 给view设置一个渐变的背景
 * @param colors 渐变的数组颜色（分别为开始颜色，中间夜色，结束颜色）
 * @param orientation 渐变方向
 */
fun View?.gradient(colors: IntArray, orientation: GradientDrawable.Orientation = GradientDrawable.Orientation.TOP_BOTTOM
) {
    this?.apply {
        background = buildDrawable(colors, orientation)
    }
}


/**
 * 构建一个渐变的drawable
 * @param colors 渐变的数组颜色（分别为开始颜色，中间夜色，结束颜色）
 * @param orientation 渐变方向
 */
inline fun buildDrawable(
    colors: IntArray,
    orientation: GradientDrawable.Orientation = GradientDrawable.Orientation.TOP_BOTTOM
): GradientDrawable {
    return GradientDrawable(orientation, colors)
}


/**
 * 构建一个drawable
 * @param fillColor 填充颜色
 * @param cornerRadius 圆角的半径
 * @param strokeWidth 边框的宽度
 * @param strokeColor 边框的颜色
 */
inline fun buildDrawable(
    fillColor: Int = Color.TRANSPARENT,
    cornerRadius: Float = -1f,
    strokeWidth: Int = -1,
    strokeColor: Int = Color.TRANSPARENT,
    gradientType: Int = RECTANGLE
): GradientDrawable {
    val shapeDrawable = GradientDrawable()
    shapeDrawable.setColor(fillColor)
    if (strokeWidth > 0) {
        shapeDrawable.setStroke(strokeWidth, strokeColor)
    }
    if (cornerRadius > 0) {
        shapeDrawable.cornerRadius = cornerRadius
    }
    shapeDrawable.shape = gradientType
    return shapeDrawable
}

/**
 * 构建一个drawable
 * @param fillColor 填充颜色
 * @param strokeWidth 边框的宽度
 * @param strokeColor 边框的颜色
 * @param leftTopCornerRadiusX 左上圆角的半径X
 * @param leftTopCornerRadiusY 左上圆角的半径Y
 * @param leftBottomCornerRadiusX 左下圆角的半径X
 * @param leftBottomCornerRadiusY 左下圆角的半径Y
 * @param rightTopCornerRadiusX 右上圆角的半径X
 * @param rightTopCornerRadiusY 右上圆角的半径Y
 * @param rightBottomCornerRadiusX 右下圆角的半径X
 * @param rightBottomCornerRadiusY 右下圆角的半径Y
 */
inline fun buildDrawable(
    fillColor: Int,
    strokeWidth: Int = -1,
    strokeColor: Int = Color.TRANSPARENT,
    leftTopCornerRadiusX: Float = 0f,
    leftTopCornerRadiusY: Float = 0f,
    rightTopCornerRadiusX: Float = 0f,
    rightTopCornerRadiusY: Float = 0f,
    leftBottomCornerRadiusX: Float = 0f,
    leftBottomCornerRadiusY: Float = 0f,
    rightBottomCornerRadiusX: Float = 0f,
    rightBottomCornerRadiusY: Float = 0f,
    gradientType: Int = RECTANGLE
): GradientDrawable {
    val shapeDrawable = GradientDrawable()
    shapeDrawable.setColor(fillColor)
    if (strokeWidth > 0) {
        shapeDrawable.setStroke(strokeWidth, strokeColor)
    }
    shapeDrawable.cornerRadii = floatArrayOf(
        leftTopCornerRadiusX,
        leftTopCornerRadiusY,
        rightTopCornerRadiusX,
        rightTopCornerRadiusY,
        rightBottomCornerRadiusX,
        rightBottomCornerRadiusY,
        leftBottomCornerRadiusX,
        leftBottomCornerRadiusY
    )
    shapeDrawable.shape = gradientType
    return shapeDrawable
}


/**
 * 给view设置圆角矩形背景
 * @param fillColor 填充颜色
 * @param leftTopCornerRadius 左上圆角的半径
 * @param leftBottomCornerRadius 左下圆角的半径
 * @param rightTopCornerRadius 右上圆角的半径
 * @param rightBottomCornerRadius 右上圆角的半径
 * @param strokeWidth 边框的宽度
 * @param strokeColor 边框的颜色
 */
inline fun buildDrawable(
    fillColor: Int = Color.TRANSPARENT, strokeWidth: Int = -1, strokeColor: Int = Color.TRANSPARENT,
    leftTopCornerRadius: Float = 0f, leftBottomCornerRadius: Float = 0f,
    rightTopCornerRadius: Float = 0f, rightBottomCornerRadius: Float = 0f
): GradientDrawable {
    return buildDrawable(
        fillColor,
        strokeWidth,
        strokeColor,
        leftTopCornerRadius,
        leftTopCornerRadius,
        rightTopCornerRadius,
        rightTopCornerRadius,
        leftBottomCornerRadius,
        leftBottomCornerRadius
        ,
        rightBottomCornerRadius,
        rightBottomCornerRadius
    )
}

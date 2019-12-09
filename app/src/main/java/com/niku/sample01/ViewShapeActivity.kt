package com.niku.sample01

import android.graphics.Color
import android.graphics.drawable.GradientDrawable
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.niku.sample01.common.utils.dpToPx
import com.niku.sample01.common.utils.dpToPx2
import com.niku.sample01.common.utils.getResColor
import com.niku.sample01.common.view.gradient
import com.niku.sample01.common.view.ovel
import com.niku.sample01.common.view.rect
import com.niku.sample01.common.view.roundRect
import kotlinx.android.synthetic.main.activity_view_shape.*

class ViewShapeActivity : AppCompatActivity() {


    private val fillColor = Color.argb(255,3,169,244)
    private val strokeColor = Color.argb(255,96,125,139)

    private val gradientColors = intArrayOf(Color.YELLOW,Color.BLUE,Color.GREEN)


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_view_shape)
        rectFill.rect(getResColor(R.color.fillColor))
        rectFillAndStroke.rect(getResColor(R.color.fillColor), dpToPx(3f),getResColor(R.color.strokeColor))
        roundRect.roundRect(fillColor,cornerRadius = dpToPx2(10f))
        roundRectWithStroke.roundRect(getResColor(R.color.fillColor),cornerRadius = dpToPx2(5f),
            strokeWidth = dpToPx(3f),strokeColor = getResColor(R.color.strokeColor))
        roundRect1.roundRect(fillColor,leftTopCornerRadius = dpToPx2(10f),leftBottomCornerRadius = dpToPx2(5f),rightTopCornerRadius = dpToPx2(20f),
            rightBottomCornerRadius = dpToPx2(30f))
        roundRect2.roundRect(fillColor,strokeWidth = dpToPx(3f),strokeColor = strokeColor,leftTopCornerRadius = dpToPx2(10f),rightTopCornerRadius = dpToPx2(15f))
        roundRect3.roundRect(fillColor,strokeWidth = dpToPx(3f),strokeColor = strokeColor,leftTopCornerRadius = dpToPx2(10f),leftBottomCornerRadius = dpToPx2(15f))

        roundRect4.roundRect(fillColor,leftTopCornerRadiusX = dpToPx2(10f),leftTopCornerRadiusY = dpToPx2(5f),
            rightTopCornerRadiusX = dpToPx2(5f),rightTopCornerRadiusY = dpToPx2(10f),
            leftBottomCornerRadiusX = dpToPx2(10f),leftBottomCornerRadiusY = dpToPx2(20f),
            rightBottomCornerRadiusX = dpToPx2(8f),rightBottomCornerRadiusY = dpToPx2(14f))

        roundRect5.roundRect(getResColor(R.color.fillColor),dpToPx(3f),getResColor(R.color.strokeColor),
            leftTopCornerRadiusX = dpToPx2(10f),leftTopCornerRadiusY = dpToPx2(5f),
            rightTopCornerRadiusX = dpToPx2(5f),rightTopCornerRadiusY = dpToPx2(10f),
            leftBottomCornerRadiusX = dpToPx2(10f),leftBottomCornerRadiusY = dpToPx2(20f),
            rightBottomCornerRadiusX = dpToPx2(8f),rightBottomCornerRadiusY = dpToPx2(14f))

        roundRect6.roundRect(fillColor,dpToPx(3f),strokeColor,
            leftBottomCornerRadiusX = dpToPx2(10f),leftBottomCornerRadiusY = dpToPx2(20f),
            rightBottomCornerRadiusX = dpToPx2(8f),rightBottomCornerRadiusY = dpToPx2(14f))

        ovelRect.ovel(fillColor, dpToPx2(30f), dpToPx2(30f),strokeWidth = dpToPx(3f),strokeColor = strokeColor)
        ovelRect1.ovel(getResColor(R.color.fillColor), cornerRadiusX = dpToPx2(50f), cornerRadiusY = dpToPx2(30f),strokeWidth = dpToPx(3f),strokeColor = getResColor(R.color.strokeColor))

        ovelRect2.roundRect(fillColor, dpToPx2(30f))
        ovelRect3.roundRect(getResColor(R.color.fillColor), dpToPx2(30f),strokeWidth = dpToPx(5f),strokeColor = getResColor(R.color.strokeColor))
        gradient.gradient(gradientColors)
        gradient1.gradient(gradientColors,GradientDrawable.Orientation.LEFT_RIGHT)
        gradient2.gradient(gradientColors,GradientDrawable.Orientation.BL_TR)
    }
}

package com.niku.sample01

import android.graphics.Color
import android.graphics.drawable.GradientDrawable
import android.graphics.drawable.RippleDrawable
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.niku.sample01.common.utils.dpToPx
import com.niku.sample01.common.utils.dpToPx2
import com.niku.sample01.common.view.*
import kotlinx.android.synthetic.main.activity_ripple_drawable.*


class RippleDrawableActivity : AppCompatActivity() {



    private val rippleColor = Color.parseColor("#FF5A13D8")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_ripple_drawable)

        button1.ripple(rippleColor,maskFillColor = Color.parseColor("#FFE60D3E"))
        button2.ripple(rippleColor)

        button3.ripple(rippleColor,fillColor = Color.parseColor("#1296db"),cornerRadius = dpToPx2(5f))
        button3.setTextColor(Color.WHITE)

        button4.ripple(rippleColor,fillColor = Color.TRANSPARENT,cornerRadius = dpToPx2(5f),
            strokeWidth = dpToPx(2f),strokeColor = Color.parseColor("#1296db"),
            maskFillColor = Color.parseColor("#FFE60D3E"),maskCornerRadius = dpToPx2(5f))

        val normalDrawable = buildDrawable(fillColor = Color.parseColor("#1296db"),cornerRadius = dpToPx2(5f))
        val pressedDrawable = buildDrawable(fillColor = Color.parseColor("#FFE60D3E"),cornerRadius = dpToPx2(5f))
        val sd = buildStateListDrawable()
            .pressed(pressedDrawable)
            .normal(normalDrawable)
        button6.ripple(rippleColor,sd)
        button6.setTextColor(Color.WHITE)

        val circleDrawable = buildDrawable(Color.parseColor("#1296db"),gradientType = GradientDrawable.OVAL)
        circle_ripple.ripple(rippleColor,circleDrawable)


        circle_ripple2.rippleRes(rippleColor,R.drawable.ic_collection)

        circle_ripple3.ripple(rippleColor)

        circle_ripple4.rippleSrc(rippleColor,R.drawable.ic_back_blue)


        tv_ripple.ripple(rippleColor)

        tv_ripple1.ripple(rippleColor,fillColor = Color.parseColor("#1296db"))
        tv_ripple1.setTextColor(Color.WHITE)
    }
}

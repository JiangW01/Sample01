package com.niku.sample01

import android.content.res.ColorStateList
import android.graphics.Color
import android.graphics.drawable.RippleDrawable
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.niku.sample01.common.utils.dpToPx2
import com.niku.sample01.common.view.*
import kotlinx.android.synthetic.main.activity_state_list_drawable.*
import android.R.id.button1
import android.content.res.TypedArray
import android.graphics.drawable.GradientDrawable
import androidx.core.app.ComponentActivity.ExtraData
import androidx.core.content.ContextCompat.getSystemService
import android.icu.lang.UCharacter.GraphemeClusterBreak.T



class StateListDrawableActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_state_list_drawable)
        val pressedDrawable = buildDrawable(Color.parseColor("#8B9EB3"), dpToPx2(5f))
        val normalDrawable = buildDrawable(Color.parseColor("#4498F2"), dpToPx2(5f))
        val unenableDrawable = buildDrawable(Color.parseColor("#A8A9AC"), dpToPx2(5f))
        val sd = buildStateListDrawable()
            .pressed(pressedDrawable)
            .enable(unenableDrawable,false)
            .normal(normalDrawable)
        btnMuilti.setStateDrawable(sd)
        btnUnenable.enable(normalDrawable,unenableDrawable,false)
        btnPressed.pressed(normalDrawable,pressedDrawable)
        btnPressed.pressedTextColor(Color.WHITE,Color.GRAY)
        btnPressed.setOnClickListener {

        }
        btnUnenable.enable(normalDrawable,unenableDrawable,false)
        btnUnenable.enabledTextColor(Color.WHITE,Color.GRAY,false)
        checkBox.setOnCheckedChangeListener { buttonView, isChecked ->
            btnUnenable.isEnabled = isChecked
        }

        val colorState = ColorStateBuilder()
            .enableTextColor(Color.GRAY,false)
            .pressedTextColor(Color.LTGRAY)
            .normalTextColor(Color.WHITE)
            .build()
        btnMuilti.setTextColor(colorState)
        btnMuilti.setOnClickListener {

        }
        checkBox1.pressedTextColor(Color.RED,Color.GRAY)
        checkBox1.setOnCheckedChangeListener { buttonView, isChecked ->
            btnMuilti.isEnabled = isChecked
        }
        iv_back.pressed(R.drawable.back,R.drawable.back_pressed)
        iv_back.setOnClickListener {

        }
        radioButton.checkedTextColor(Color.parseColor("#bfbfbf"),Color.parseColor("#1296db"))
        radioButton.leftCheckedCompoundDrawable(R.drawable.ic_radio_normal,R.drawable.ic_radiobutton_checked)
        radioButton3.checkedTextColor(Color.parseColor("#bfbfbf"),Color.parseColor("#1296db"))
        radioButton2.leftCheckedCompoundDrawable(R.drawable.ic_radio_normal,R.drawable.ic_radiobutton_checked)
        radioButton2.checkedTextColor(Color.parseColor("#bfbfbf"),Color.parseColor("#1296db"))
        radioButton3.leftCheckedCompoundDrawable(R.drawable.ic_radio_normal,R.drawable.ic_radiobutton_checked)
        radioButton.compoundDrawablePadding = 20
        radioButton2.compoundDrawablePadding = 20
        radioButton3.compoundDrawablePadding = 20

        checkBox2.checkedTextColor(Color.parseColor("#bfbfbf"),Color.parseColor("#1296db"))
        checkBox2.leftCheckedCompoundDrawable(R.drawable.checkbox_unchecked,R.drawable.checkbox_checked)
        checkBox2.compoundDrawablePadding = 20

    }
}

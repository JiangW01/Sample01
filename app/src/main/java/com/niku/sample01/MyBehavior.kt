package com.niku.sample01

import android.content.Context
import android.util.AttributeSet
import android.view.View
import android.widget.LinearLayout
import androidx.coordinatorlayout.widget.CoordinatorLayout
import androidx.core.view.ViewCompat

/**
 * 作者 ：wangJiang
 * 时间 ：2019/11/27
 * 描述 ：
 */
class MyBehavior:CoordinatorLayout.Behavior<View> {

    constructor(ctx:Context,attributeSet: AttributeSet):super(ctx,attributeSet)


    override fun layoutDependsOn(
        parent: CoordinatorLayout,
        child: View,
        dependency: View
    ): Boolean {
        return dependency is LinearLayout
    }

    override fun onDependentViewChanged(
        parent: CoordinatorLayout,
        child: View,
        dependency: View
    ): Boolean {
        ViewCompat.offsetTopAndBottom(child,100)
        return false
    }
}
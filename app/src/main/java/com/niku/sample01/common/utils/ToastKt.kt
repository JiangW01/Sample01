package com.niku.sample01.common.utils

import android.widget.Toast
import androidx.annotation.StringRes
import com.niku.sample01.common.ApplactionInject

/**
 * 作者 ：wangJiang
 * 时间 ：2019/11/28
 * 描述 ：
 */


/**
 * 显示toast
 * @param resId 需要显示的文本的资源id
 * @param isLong 是否显示时间长点
 */
inline fun showToast(@StringRes resId: Int,isLong:Boolean = false) {
    showToast(getString(resId),isLong)
}

/**
 * 显示toast
 * @param text 需要显示的文本
 * @param isLong 是否显示时间长点
 */
inline fun showToast(text: String,isLong:Boolean = false) {
    Toast.makeText(ApplactionInject.getApplication(), text, if(isLong) Toast.LENGTH_LONG else  Toast.LENGTH_SHORT).show()
}
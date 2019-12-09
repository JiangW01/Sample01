package com.niku.sample01.application

import android.app.Application
import com.niku.sample01.common.ApplactionInject

/**
 * 作者 ：wangJiang
 * 时间 ：2019/12/5
 * 描述 ：
 */
class MyApplication:Application() {

    override fun onCreate() {
        super.onCreate()
        ApplactionInject.inject(this)
    }

}
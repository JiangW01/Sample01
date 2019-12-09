package com.niku.sample01.common

import android.app.Application

/**
 * 作者 ：wangJiang
 * 时间 ：2019/11/28
 * 描述 ：
 */
object ApplactionInject {

    private lateinit var application:Application

    fun inject(application:Application){
        this.application = application
    }

    fun getApplication():Application{
        if(::application.isInitialized){
            return application
        }
        throw Error("application not Initialized")
    }


}
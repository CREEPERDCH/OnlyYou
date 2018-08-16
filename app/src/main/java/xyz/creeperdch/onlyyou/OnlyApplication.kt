package xyz.creeperdch.onlyyou

import android.app.Application

/*
 * Created by creeper on 2018/8/16
 * Hint: 
 * Email: wwwwyn4240@gmail.com
 */
class OnlyApplication : Application() {

    companion object {
        lateinit var application: Application
    }

    override fun onCreate() {
        super.onCreate()
        application = this
        init()
    }

    private fun init() {
        //初始化
    }
}
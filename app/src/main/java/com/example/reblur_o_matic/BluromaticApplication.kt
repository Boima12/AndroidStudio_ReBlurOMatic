package com.example.reblur_o_matic

import android.app.Application
import com.example.reblur_o_matic.data.AppContainer
import com.example.reblur_o_matic.data.DefaultAppContainer

class BluromaticApplication : Application()  {
    lateinit var container: AppContainer
    override fun onCreate() {
        super.onCreate()
        container = DefaultAppContainer(this)
    }
}
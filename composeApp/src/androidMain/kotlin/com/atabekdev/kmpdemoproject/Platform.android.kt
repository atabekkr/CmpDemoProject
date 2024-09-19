package com.atabekdev.kmpdemoproject

import android.os.Build

class AndroidPlatform : Platform {
    private val versionCode = BuildConfig.VERSION_CODE
    private val versionName = BuildConfig.VERSION_NAME
    override val name: String = "Android ${Build.VERSION.SDK_INT} \nversionCode $versionCode \nversionName $versionName"
}

actual fun getPlatform(): Platform = AndroidPlatform()
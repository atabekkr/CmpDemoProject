package com.atabekdev.kmpdemoproject

class AndroidPlatform : Platform {
    private val versionName = BuildConfig.VERSION_NAME
    private val versionCode = BuildConfig.VERSION_CODE
    override val name: String = "$versionName ($versionCode)"
}

actual fun getPlatform(): Platform = AndroidPlatform()
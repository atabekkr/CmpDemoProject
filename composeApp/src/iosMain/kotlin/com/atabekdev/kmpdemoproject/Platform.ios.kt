package com.atabekdev.kmpdemoproject

import platform.Foundation.NSBundle

class IOSPlatform: Platform {
    private val versionName = NSBundle.mainBundle.objectForInfoDictionaryKey("CFBundleShortVersionString") as? String
    private val versionCode = NSBundle.mainBundle.objectForInfoDictionaryKey("CFBundleVersion") as? String
    override val name: String = "$versionName ($versionCode)"
}

actual fun getPlatform(): Platform = IOSPlatform()
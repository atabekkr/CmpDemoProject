package com.atabekdev.kmpdemoproject

class JVMPlatform: Platform {
    private val versionName = System.getProperty("app.version.name", "1.0.0")
    private val versionCode = System.getProperty("app.version.code", "1")
    override val name: String = "$versionName ($versionCode)"
}

actual fun getPlatform(): Platform = JVMPlatform()
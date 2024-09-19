package com.atabekdev.kmpdemoproject

class JVMPlatform: Platform {
    override val name: String = "Java ${System.getProperty("jpackage.app-version")}\n${System.getProperty("jpackage.app-code")}"
}

actual fun getPlatform(): Platform = JVMPlatform()
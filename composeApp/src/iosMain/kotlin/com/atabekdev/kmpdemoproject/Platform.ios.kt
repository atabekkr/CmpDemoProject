package com.atabekdev.kmpdemoproject

import platform.UIKit.UIDevice

class IOSPlatform: Platform {
    val version = platform.Foundation.NSBundle.mainBundle.infoDictionary?.get("CFBundleVersion")
    override val name: String = version
}

actual fun getPlatform(): Platform = IOSPlatform()
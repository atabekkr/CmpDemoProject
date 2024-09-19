package com.atabekdev.kmpdemoproject

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform
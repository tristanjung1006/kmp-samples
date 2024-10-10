package com.wash.myfirstkmp

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform
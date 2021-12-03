package com.stegnerd.shared.ptbkmp

class Greeting {
    fun greeting(): String {
        return "Hello, ${Platform().platform}!"
    }
}
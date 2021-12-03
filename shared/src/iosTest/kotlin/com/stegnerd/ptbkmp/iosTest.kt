package com.stegnerd.ptbkmp

import com.stegnerd.shared.ptbkmp.Greeting
import kotlin.test.Test
import kotlin.test.assertTrue

class IosGreetingTest {

    @Test
    fun testExample() {
        assertTrue(Greeting().greeting().contains("iOS"), "Check iOS is mentioned")
    }
}
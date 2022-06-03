package com.stegnerd.ptbkmp

import com.stegnerd.shared.ptbkmp.Greeting
import kotlin.test.Test
import kotlin.test.assertTrue

class  MacosGreetingTest {

    @Test
    fun testExample() {
        assertTrue(Greeting().greeting().contains("macOS"), "Check macOS is mentioned")
    }
}
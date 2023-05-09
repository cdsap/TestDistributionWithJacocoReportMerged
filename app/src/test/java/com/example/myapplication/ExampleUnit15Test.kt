package com.example.myapplication

import org.junit.Test

import org.junit.Assert.*

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
class ExampleUnit15Test {
    @Test
    fun addition_isCorrect() {
        val example = Example()

        assertTrue(example.b() == 2)

        assertEquals(4, 2 + 2)
    }
}

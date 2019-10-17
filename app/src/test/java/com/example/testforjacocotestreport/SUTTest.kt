package com.example.testforjacocotestreport

import org.junit.Before
import org.junit.Test

import org.junit.Assert.*

class SUTTest {

    lateinit var sut: SUT

    @Before
    fun setUp() {
        sut = SUT()
    }

    @Test
    fun execute() {
        val result = sut.execute(1,2)
        assertEquals(result,3)
    }
}
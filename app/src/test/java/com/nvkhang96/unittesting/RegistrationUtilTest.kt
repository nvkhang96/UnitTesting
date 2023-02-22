package com.nvkhang96.unittesting

import org.junit.Assert.assertFalse
import org.junit.Assert.assertTrue
import org.junit.Test

class RegistrationUtilTest {

    @Test
    fun `empty username returns false` () {
        val result = RegistrationUtil.validRegistrationInput(
            "",
            "123",
            "123"
        )
        assertFalse(result)
    }

    @Test
    fun `valid username and correctly repeated password return true` () {
        val result = RegistrationUtil.validRegistrationInput(
            "Philipp",
            "123",
            "123"
        )
        assertTrue(result)
    }

    @Test
    fun `username already exists returns false` () {
        val result = RegistrationUtil.validRegistrationInput(
            "Carl",
            "123",
            "123"
        )
        assertFalse(result)
    }

    @Test
    fun `incorrectlt confirmed password returns false` () {
        val result = RegistrationUtil.validRegistrationInput(
            "Philipp",
            "123456",
            "abcdef"
        )
        assertFalse(result)
    }

    @Test
    fun `empty password returns false` () {
        val result = RegistrationUtil.validRegistrationInput(
            "Philipp",
            "",
            ""
        )
        assertFalse(result)
    }

    @Test
    fun `less than 2 digit password return false` () {
        val result = RegistrationUtil.validRegistrationInput(
            "Philipp",
            "abcdefg5",
            "abcdefg5"
        )
        assertFalse(result)
    }
}
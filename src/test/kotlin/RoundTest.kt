package com.cocharge.game


import com.cocharge.Choice
import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

class ChoiceTest {

    @Test
    fun `rock should beat scissors`() {
        assertTrue(Choice.ROCK.beats(Choice.SCISSORS))
    }

    @Test
    fun `rock should not beat paper or rock`() {
        assertFalse(Choice.ROCK.beats(Choice.PAPER))
        assertFalse(Choice.ROCK.beats(Choice.ROCK))
    }

    @Test
    fun `scissors should beat paper`() {
        assertTrue(Choice.SCISSORS.beats(Choice.PAPER))
    }

    @Test
    fun `scissors should not beat rock or scissors`() {
        assertFalse(Choice.SCISSORS.beats(Choice.ROCK))
        assertFalse(Choice.SCISSORS.beats(Choice.SCISSORS))
    }

    @Test
    fun `paper should beat rock`() {
        assertTrue(Choice.PAPER.beats(Choice.ROCK))
    }

    @Test
    fun `paper should not beat scissors or paper`() {
        assertFalse(Choice.PAPER.beats(Choice.SCISSORS))
        assertFalse(Choice.PAPER.beats(Choice.PAPER))
    }

}
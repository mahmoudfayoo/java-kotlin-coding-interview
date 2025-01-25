package com.cocharge.game

import com.cocharge.Choice
import com.cocharge.Game
import com.cocharge.Player
import com.cocharge.Result
import io.mockk.every
import io.mockk.mockk
import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class GameTest {

    @Test
    fun `when firstPlayer chooses rock and secondPlayer chooses scissors, firstPlayer should win`() {
        // Given
        val firstPlayer = mockk<Player> {
            every { choose() } returns Choice.ROCK
        }
        val secondPlayer = mockk<Player> {
            every { choose() } returns Choice.SCISSORS
        }
        val game = Game(firstPlayer, secondPlayer)

        // When
        val result = game.playRound()

        // Then
        assertEquals(com.cocharge.Result.WIN, result)
    }

    @Test
    fun `when firstPlayer chooses rock and secondPlayer chooses paper, secondPlayer should win`() {
        val firstPlayer = mockk<Player> {
            every { choose() } returns Choice.ROCK
        }
        val secondPlayer = mockk<Player> {
            every { choose() } returns Choice.PAPER
        }
        val game = Game(firstPlayer, secondPlayer)

        // when
        val result = game.playRound()

        // Then
        assertEquals(com.cocharge.Result.LOSE, result)
    }

    @Test
    fun `when firstPlayer chooses rock and secondPlayer chooses rock, it should be a draw`() {
        val firstPlayer = mockk<Player> {
            every { choose() } returns Choice.ROCK
        }
        val secondPlayer = mockk<Player> {
            every { choose() } returns Choice.ROCK
        }
        val game = Game(firstPlayer, secondPlayer)

        // When
        val result = game.playRound()

        // Then
        assertEquals(Result.DRAW, result)
    }


}
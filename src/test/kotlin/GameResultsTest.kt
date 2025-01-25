
import com.cocharge.GameResults
import kotlin.test.Test
import kotlin.test.assertEquals

class GameResultsTest {

    @Test
    fun     `test results formatting`() {
        // Given
        val stats = GameResults(
            firstPlayerWins = 31,
            secondPlayerWins = 37,
            draws = 32
        )
        val expected = """
            A wins 31 of 100 games
            B wins 37 of 100 games
            Draws: 32 of 100 games
        """.trimIndent()

        // Then
        assertEquals(
            expected,
            stats.format("A", "B")
        )
    }

    @Test
    fun `test statistics with zero games`() {
        val stats = GameResults()
        val formatted = stats.format("Player A", "Player B")
        val expected = """
            Player A wins 0 of 0 games
            Player B wins 0 of 0 games
            Draws: 0 of 0 games
        """.trimIndent()

        assertEquals(expected, formatted)
    }

}
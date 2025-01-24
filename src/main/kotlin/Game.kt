package com.cocharge


class Game(private val playerA: Player, private val playerB: Player) {
    private var results = GameResults()

    fun playRound(): Result {
        val choiceA = playerA.choose()
        val choiceB = playerB.choose()

        return when {
            choiceA == choiceB -> Result.DRAW
            choiceA.beats(choiceB) -> Result.WIN
            else -> Result.LOSE
        }.also { updateResults(it) }
    }

    private fun updateResults(roundResult: Result) {
        results = when (roundResult) {
            Result.WIN -> results.copy(firstPlayerWins = results.firstPlayerWins + 1)
            Result.LOSE -> results.copy(secondPlayerWins = results.secondPlayerWins + 1)
            Result.DRAW -> results.copy(draws = results.draws + 1)
        }
    }

    fun getResults(): String = results.format(firstPlayerName = playerA.getName(), secondPlayerName = playerB.getName())
}
import com.cocharge.Game
import com.cocharge.RandomPlayer
import com.cocharge.RockPlayer


fun main() {
    val game = Game(RandomPlayer(), RockPlayer())
    repeat(100) { game.playRound() }
    println(game.getResults())
}


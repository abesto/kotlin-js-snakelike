package net.abesto.snakelike.logic

public class Game(private val tick: Int) {
    public fun getTick(): Int = tick
    public fun tick(): Game = Game(tick + 1)
}

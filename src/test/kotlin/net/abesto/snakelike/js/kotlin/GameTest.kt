package net.abesto.snakelike.js.kotlin

import org.junit.Test as test
import kotlin.test.*

open class SampleTest {
    test fun getTick(): Unit {
        val game = Game(6)
        assertEquals(game.getTick(), 6)
    }
}

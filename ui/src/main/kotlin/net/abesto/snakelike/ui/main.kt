package net.abesto.snakelike.ui

import js.jquery.jq
import js.dom.html.window

import net.abesto.snakelike.logic

fun tick(game: net.abesto.snakelike.logic.Game) {
    jq("#container").text("coolness" + game.getTick())
    window.setTimeout({tick(game.tick())}, 1000)
}

fun main(args: Array<String>) {
    jq {
        var game = net.abesto.snakelike.logic.Game(42)
        tick(game)
    }
}

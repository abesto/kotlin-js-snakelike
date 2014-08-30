package net.abesto.snakelike.ui

import js.jquery.jq
import js.dom.html.window
import js.dom.html.document
import js.crafty.*
import js.crafty.Component.*

import net.abesto.snakelike.logic
import java.util.HashMap

fun tick(game: net.abesto.snakelike.logic.Game) {
    jq("#container").text("coolness" + game.getTick())
    window.setTimeout({tick(game.tick())}, 1000)
}

fun main(args: Array<String>) {
    jq {
        var game = net.abesto.snakelike.logic.Game(42)
        tick(game)
    }

    crafty.init(640, 480, document.getElementById("game"))
    crafty.e(TwoD, DOM, Color, Fourway)
            .attr(Attributes(x=0, w=200, y=0, h=150))
            .color(255, 0, 0)
            .fourway(4)
}

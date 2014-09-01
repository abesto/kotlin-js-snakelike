package net.abesto.snakelike.ui

import js.jquery.jq
import js.dom.html.window
import js.dom.html.document

import js.pixi.*

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

    val stage = PIXI.Stage(0x66ff99)
    val renderer = PIXI.autoDetectRenderer(400, 300)

    document.body.appendChild(renderer.view)

    val texture = PIXI.Texture.fromImage("img/bunny.png")
    val bunny = PIXI.Sprite(texture)
    bunny.anchor.x = 0.5
    bunny.anchor.y = 0.5
    bunny.position.x = 200.0
    bunny.position.y = 150.0
    stage.addChild(bunny)

    fun animation() {
        requestAnimFrame{animation()}
        bunny.rotation += 0.1
        renderer.render(stage)
    }
    requestAnimFrame{animation()}
}

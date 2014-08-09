package net.abesto.snakelike.js.kotlin

import js.jquery.jq

fun main(args: Array<String>) {
    jq {
        jq("#container").text("coolness")
    }
}

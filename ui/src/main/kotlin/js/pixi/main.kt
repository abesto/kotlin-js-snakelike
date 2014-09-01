package js.pixi

import org.w3c.dom.Element
import js.native
import js.dom.html.window

native val <T> undefined: T = noImpl

native object PIXI {
    class Stage(backgroundColor: Int) {
        fun addChild(sprite: Sprite): Unit = noImpl
    }

    class Renderer {
        val view: Element = noImpl
        fun render(stage: Stage) = noImpl
    }
    fun autoDetectRenderer(width: Int, height: Int): Renderer = noImpl

    class Texture {
        class object {
            fun fromImage(path: String): Texture = noImpl
        }
    }

    class Sprite(texture: Texture) {
        var rotation: Double = 0.0
        var anchor: Point = noImpl
        var position: Point = noImpl
    }

    class Point {
        var x: Double = noImpl
        var y: Double = noImpl
    }
}

native fun requestAnimFrame(animation: () -> Unit) = noImpl


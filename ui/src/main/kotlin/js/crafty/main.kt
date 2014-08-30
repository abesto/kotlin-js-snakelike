package js.crafty

import org.w3c.dom.Element
import js.native

enum class Component {
    TwoD
    DOM
    Color
    Fourway

    fun repr() : String = if (this == TwoD) "2D" else toString()
}

native val <T> undefined: T = noImpl

native class Crafty {
    public fun init(width: Int, height: Int, container: Element): Unit = js.noImpl
    native("e") fun _e(components: String): Entity = js.noImpl
}

public fun Crafty.e(vararg components: Component): Entity {
    var s = ""
    for (c in components) {
        s += c.repr() + ","
    }
    return _e(s.substring(0, s.length-1))
}

native class Entity {
    public fun attr(attrs: Attributes): Entity = js.noImpl
    public fun color(color: String): Entity = js.noImpl
    public fun fourway(speed: Int): Entity = js.noImpl
}

class Attributes(
    val x: Int = undefined,
    val y: Int = undefined,
    val w: Int = undefined,
    val h: Int = undefined
)

js.native("Crafty") val crafty = Crafty()



package org.example

class Point(private var x: Double, private var y: Double) {
    fun getX(): Double {
        return x
    }
    fun getY(): Double {
        return y
    }
    fun clone(): Point {
        return Point(x, y)
    }
    fun move(dX: Double, dY: Double) {
        x += dX
        y += dY
    }
}
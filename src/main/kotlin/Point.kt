package org.example

class Point(private var x: Double, private var y: Double) {
    fun getX(): Double {
        return x
    }
    fun getY(): Double {
        return y
    }
    fun clonePoint(): Point {
        return Point(x, y)
    }
    fun movePoint(dx: Double, dy: Double) {
        x += dx
        y += dy
    }
}
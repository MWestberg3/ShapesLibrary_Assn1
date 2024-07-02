package org.example

import kotlin.math.pow
import kotlin.math.sqrt

class Line(private var start: Point, private var end: Point) {
    private var length: Double = sqrt((end.getX() - start.getX()).pow(2.0) + (end.getY() - start.getY()).pow(2.0))

    fun getStart(): Point {
        return start
    }
    fun getEnd(): Point {
        return end
    }
    fun getSlope(): Double {
        return (end.getY() - start.getY()) / (end.getX() - start.getX())
    }
    fun getLength(): Double {
        return length
    }
    fun moveLine(dX: Double, dY: Double) {
        start.move(dX, dY)
        end.move(dX, dY)
    }
}
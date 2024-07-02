package org.example

class Rectangle(private var width: Line, private var height: Line) {
    fun getWidth(): Line {
        return width
    }

    fun getHeight(): Line {
        return height
    }

    fun getArea(): Double {
        return width.getLength() * height.getLength()
    }

    fun moveRectangle(dX: Double, dY: Double) {
        width.moveLine(dX, dY)
        height.moveLine(dX, dY)
    }
}
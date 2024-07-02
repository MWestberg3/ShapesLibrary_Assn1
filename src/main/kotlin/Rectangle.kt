//package org.example
//
//class Rectangle(private var topLeft: Point, private var bottomRight: Point) {
//    private val heightLine = Line(topLeft, Point(topLeft.getX(), bottomRight.getY()))
//    private val widthLine = Line(topLeft, Point(bottomRight.getX(), topLeft.getY()))
//
//    fun getTopLeft(): Point {
//        return topLeft
//    }
//    fun getBottomRight(): Point {
//        return bottomRight
//    }
//    fun getWidth(): Double {
//        return widthLine.getLength()
//    }
//
//    fun getHeight(): Double {
//        return heightLine.getLength()
//    }
//
//    fun getArea(): Double {
//        return getWidth() * getHeight()
//    }
//
//    fun moveRectangle(dX: Double, dY: Double) {
//        widthLine.moveLine(dX, dY)
//        heightLine.moveLine(dX, dY)
//    }
//}
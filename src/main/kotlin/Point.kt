class Point(private var x: Double, private var y: Double) {
    val getX: Double
        get() = x

    val getY: Double
        get() = y

    fun clone(): Point {
        return Point(x, y)
    }
    fun move(dX: Double, dY: Double) {
        x += dX
        y += dY
    }
}
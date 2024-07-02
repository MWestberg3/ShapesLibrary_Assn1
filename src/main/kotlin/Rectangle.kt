import kotlin.math.abs

open class Rectangle(private var pointA: Point, private var pointB: Point) {
    private val height: Double = abs(pointA.getY - pointB.getY)
    private val width: Double = abs(pointB.getX - pointA.getX)
    private val area: Double = height * width

    init {
        require(height != 0.0 && width != 0.0) { "Rectangle height and width cannot be zero."}
    }

    val getPointA: Point
        get() = pointA.clone()

    val getPointB: Point
        get() = pointB.clone()

    fun getArea(): Double {
        return area
    }
    fun moveRectangle(dX: Double, dY: Double) {
        pointA.move(dX, dY)
        pointB.move(dX, dY)
    }
}
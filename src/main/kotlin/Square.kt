import kotlin.math.abs

class Square(private var pointA: Point, private var pointB: Point) : Rectangle(pointA, pointB) {
    init {
        val height = abs(pointA.getY - pointB.getY)
        val width = abs(pointB.getX - pointA.getX)
        require(height == width) { "Square height and width must be equal." }
    }
}
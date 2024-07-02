import kotlin.math.sqrt

class Triangle(private val pointA: Point, private val pointB: Point, private val pointC: Point) {
    private val sideA: Line
    private val sideB: Line
    private val sideC: Line
    private val semiperimeter: Double
    private val area: Double

    init {
        try {
            sideA = Line(pointA, pointB)
            sideB = Line(pointB, pointC)
            sideC = Line(pointC, pointA)
        } catch (e: IllegalArgumentException) {
            throw e
        }
        semiperimeter = (sideA.getLength() + sideB.getLength() + sideC.getLength()) / 2
        // Heron's Area Formula
        area = sqrt(semiperimeter * (semiperimeter - sideA.getLength()) * (semiperimeter - sideB.getLength()) * (semiperimeter - sideC.getLength()))

        require(sideA.getSlope() != sideB.getSlope() && sideB.getSlope() != sideC.getSlope() && sideC.getSlope() != sideA.getSlope()) { "Triangle sides cannot be collinear." }
    }

    val getPointA: Point
        get() = pointA.clone()

    val getPointB: Point
        get() = pointB.clone()

    val getPointC: Point
        get() = pointC.clone()

    fun getArea(): Double {
        return area
    }

    fun moveTriangle(dX: Double, dY: Double) {
        pointA.move(dX, dY)
        pointB.move(dX, dY)
        pointC.move(dX, dY)
    }
}
import kotlin.math.abs

open class Ellipse(private val center: Point, private val radiusAParam: Double, private val radiusBParam: Double) {
    private val radiusA: Double = abs(radiusAParam)
    private val radiusB: Double = abs(radiusBParam)

    init {
        require(area != 0.0) { "Ellipse area cannot be zero." }
    }

    val area: Double
        get() = Math.PI * radiusA * radiusB

    val getCenter: Point
        get() = center.clone()

    val getRadiusX: Double
        get() = radiusA

    val getRadiusY: Double
        get() = radiusB

    fun moveEllipse(dX: Double, dY: Double) {
        center.move(dX, dY)
    }
}
class Circle(private val center: Point, private val radiusAParam: Double, private val radiusBParam: Double) : Ellipse(center, radiusAParam, radiusBParam) {
    init {
        require(radiusAParam == radiusBParam) { "Circle radii must be equal." }
    }
}
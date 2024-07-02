import kotlin.math.pow
import kotlin.math.sqrt

class Line(private var start: Point, private var end: Point) {
    private val length: Double = sqrt((end.getX - start.getX).pow(2.0) + (end.getY - start.getY).pow(2.0))
    private val slope: Double = (end.getY - start.getY) / (end.getX - start.getX)

    init {
        require(getLength() != 0.0) { "Line length cannot be zero."}
        require(end.getX - start.getX != 0.0) { "Slope is undefined."}
    }

    val getStart: Point
        get() = start.clone()

    val getEnd: Point
        get() = end.clone()

    fun getSlope(): Double {
        return slope
    }
    fun getLength(): Double {
        return length
    }
    fun moveLine(dX: Double, dY: Double) {
        start.move(dX, dY)
        end.move(dX, dY)
    }
}
import kotlin.test.assertEquals
import kotlin.test.Test

class CircleTest {
    private val center = Point(0.0, 0.0)
    @Test
    fun testArea() {
        val circle = Circle(center, 5.0, 5.0)
        assertEquals(78.543982, circle.area, 0.1)
    }
    @Test
    fun testMoveCircle() {
        val circle = Circle(center, 5.0, 5.0)
        circle.moveEllipse(1.0, 1.0)
        assertEquals(1.0, circle.getCenter.getX)
        assertEquals(1.0, circle.getCenter.getY)
    }
    @Test
    fun testZeroArea() {
        try {
            Circle(center, 6.0, 0.0)
        } catch (e: IllegalArgumentException) {
            assertEquals("Ellipse area cannot be zero.", e.message)
        }
    }
    @Test
    fun testDifferentRadii() {
        try {
            val circle = Circle(center, 3.0, 5.0)
        } catch (e: IllegalArgumentException) {
            assertEquals("Circle radii must be equal.", e.message)
        }
    }
}
import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class EllipseTest {
    private val center = Point(0.0, 0.0)
    @Test
    fun testArea() {
        val ellipse = Ellipse(center, 3.0, 5.0)
        assertEquals(47.12388980384689, ellipse.area, 0.00000000000001)
    }
    @Test
    fun testMoveEllipse() {
        val ellipse = Ellipse(center, 3.0, 5.0)
        ellipse.moveEllipse(1.0, 1.0)
        assertEquals(1.0, ellipse.getCenter.getX)
        assertEquals(1.0, ellipse.getCenter.getY)
    }
    @Test
    fun testZeroArea() {
        try {
            Ellipse(center, 6.0, 0.0)
        } catch (e: IllegalArgumentException) {
            assertEquals("Ellipse area cannot be zero.", e.message)
        }
    }
}
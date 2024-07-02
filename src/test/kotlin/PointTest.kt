import kotlin.test.assertEquals
import kotlin.test.Test

class PointTest {
    @Test
    fun testPoint() {
        val point = Point(1.0, 2.0)
        assertEquals(1.0, point.getX)
        assertEquals(2.0, point.getY)
    }
    @Test
    fun testClonePoint() {
        val point = Point(1.0, 2.0)
        val clone = point.clone()
        assertEquals(1.0, clone.getX)
        assertEquals(2.0, clone.getY)
    }
    @Test
    fun testMovePoint() {
        val point = Point(1.0, 2.0)
        point.move(3.0, 4.0)
        assertEquals(4.0, point.getX)
        assertEquals(6.0, point.getY)
    }
}
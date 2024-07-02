import kotlin.test.assertEquals
import kotlin.test.Test

class TriangleTest {
    @Test
    fun testTriangle() {
        val pointA = Point(0.0, 0.0)
        val pointB = Point(0.0, 3.0)
        val pointC = Point(4.0, 0.0)
        val triangle = Triangle(pointA, pointB, pointC)
        assertEquals(pointA.getX, triangle.getPointA.getX)
        assertEquals(pointB.getX, triangle.getPointB.getX)
        assertEquals(pointC.getX, triangle.getPointC.getX)
    }
    @Test
    fun testArea() {
        val pointA = Point(0.0, 0.0)
        val pointB = Point(0.0, 3.0)
        val pointC = Point(4.0, 0.0)
        val triangle = Triangle(pointA, pointB, pointC)
        assertEquals(6.0, triangle.getArea())
    }
    @Test
    fun testMoveTriangle() {
        val pointA = Point(0.0, 0.0)
        val pointB = Point(0.0, 3.0)
        val pointC = Point(4.0, 0.0)
        val triangle = Triangle(pointA, pointB, pointC)
        triangle.moveTriangle(6.0, 1.0)
        assertEquals(6.0, triangle.getPointA.getX)
        assertEquals(1.0, triangle.getPointA.getY)
        assertEquals(6.0, triangle.getPointB.getX)
        assertEquals(4.0, triangle.getPointB.getY)
        assertEquals(10.0, triangle.getPointC.getX)
        assertEquals(1.0, triangle.getPointC.getY)
    }
    @Test
    fun testCollinearPoints() {
        val pointA = Point(0.0, 0.0)
        val pointB = Point(1.0, 1.0)
        val pointC = Point(2.0, 2.0)
        try {
            Triangle(pointA, pointB, pointC)
        } catch (e: IllegalArgumentException) {
            assertEquals("Triangle sides cannot be collinear.", e.message)
        }
        val pointD = Point(0.0, 0.0)
        val pointE = Point(0.0, 3.0)
        val pointF = Point(0.0, 6.0)
        try {
            Triangle(pointD, pointE, pointF)
        } catch (e: IllegalArgumentException) {
            assertEquals("Triangle sides cannot be collinear.", e.message)
        }
    }
    @Test
    fun testDoublePoint() {
        val pointA = Point(0.0, 0.0)
        val pointB = Point(0.0, 3.0)
        val pointC = Point(0.0, 3.0)
        try {
            Triangle(pointA, pointB, pointC)
        } catch (e: IllegalArgumentException) {
            assertEquals("Line length cannot be zero.", e.message)
        }
    }
}
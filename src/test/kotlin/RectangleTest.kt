import kotlin.test.assertEquals
import kotlin.test.Test
import Line
import Point
import Rectangle

class RectangleTest {
    private val pointA = Point(0.0, 0.0)
    private val pointB = Point(3.0, 5.0)
    private val rectangle = Rectangle(pointA, pointB)
    @Test
    fun testRectangle() {
        assertEquals(pointA.getX, rectangle.getPointA.getX)
        assertEquals(pointB.getX, rectangle.getPointB.getX)
        assertEquals(pointA.getY, rectangle.getPointA.getY)
        assertEquals(pointB.getY, rectangle.getPointB.getY)
    }
    @Test
    fun testArea() {
        assertEquals(15.0, rectangle.getArea())
    }
    @Test
    fun testMoveRectangle() {
        rectangle.moveRectangle(1.0, 1.0)
        assertEquals(1.0, rectangle.getPointA.getX)
        assertEquals(1.0, rectangle.getPointA.getY)
        assertEquals(4.0, rectangle.getPointB.getX)
        assertEquals(6.0, rectangle.getPointB.getY)
    }
    @Test
    fun testMovePointAndCheckArea() {
        val pointA = Point(0.0, 0.0)
        val pointB = Point(3.0, 5.0)
        val rectangle = Rectangle(pointA, pointB)
        assertEquals(15.0, rectangle.getArea())
        // this is important, because the user cannot mutate the rectangle (move a point), only MOVE the rectangle
        rectangle.getPointA.move(1.0, 1.0)
        assertEquals(15.0, rectangle.getArea())
    }
    @Test
    fun testZeroArea() {
        val pointA = Point(1.0, 1.0)
        val pointB = Point(1.0, 1.0)
        try {
            Rectangle(pointA, pointB)
        } catch (e: IllegalArgumentException) {
            assertEquals("Rectangle height and width cannot be zero.", e.message)
        }
    }
    @Test
    fun testZeroHeight() {
        val pointA = Point(1.0, 1.0)
        val pointB = Point(2.0, 1.0)
        try {
            Rectangle(pointA, pointB)
        } catch (e: IllegalArgumentException) {
            assertEquals("Rectangle height and width cannot be zero.", e.message)
        }
    }
    @Test
    fun testZeroWidth() {
        val pointA = Point(1.0, 1.0)
        val pointB = Point(1.0, 2.0)
        try {
            Rectangle(pointA, pointB)
        } catch (e: IllegalArgumentException) {
            assertEquals("Rectangle height and width cannot be zero.", e.message)
        }
    }
}

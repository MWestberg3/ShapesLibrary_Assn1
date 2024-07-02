import kotlin.test.assertEquals
import kotlin.test.Test

class SquareTest {
    private val pointA = Point(0.0, 0.0)
    private val pointB = Point(5.0, 5.0)
    private val square = Square(pointA, pointB)
    @Test
    fun testSquare() {
        assertEquals(pointA.getX, square.getPointA.getX)
        assertEquals(pointB.getX, square.getPointB.getX)
        assertEquals(pointA.getY, square.getPointA.getY)
        assertEquals(pointB.getY, square.getPointB.getY)
    }
    @Test
    fun testArea() {
        assertEquals(25.0, square.getArea())
    }
    @Test
    fun testMoveSquare() {
        square.moveRectangle(2.0, 1.0)
        assertEquals(2.0, square.getPointA.getX)
        assertEquals(1.0, square.getPointA.getY)
        assertEquals(7.0, square.getPointB.getX)
        assertEquals(6.0, square.getPointB.getY)
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

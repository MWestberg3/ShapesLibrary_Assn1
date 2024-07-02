import kotlin.test.assertEquals
import kotlin.test.Test
import org.example.Line
import org.example.Point

class LineTest {
    @Test
    fun testLine() {
        val start = Point(1.0, 2.0)
        val end = Point(3.0, 4.0)
        val line = Line(start, end)
        assertEquals(start, line.getStart())
        assertEquals(end, line.getEnd())
    }
    @Test
    fun testZeroLength() {
        val start = Point(1.0, 1.0)
        val end = Point(1.0, 1.0)
        try {
            Line(start, end)
        } catch (e: IllegalArgumentException) {
            assertEquals("Line length cannot be zero.", e.message)
        }
    }
    @Test
    fun testSlope() {
        val start = Point(1.0, 1.0)
        val end = Point(6.5, 6.5)
        val line = Line(start, end)
        assertEquals(1.0, line.getSlope())
    }
    @Test
    fun testLength() {
        val start = Point(1.0, 2.0)
        val end = Point(3.0, 4.0)
        val line = Line(start, end)
        assertEquals(2.8284271247461903, line.getLength())
    }
    @Test
    fun testMoveLine() {
        val start = Point(1.0, 1.0)
        val end = Point(4.0, 4.0)
        val line = Line(start, end)
        line.moveLine(1.0, 1.0)
        assertEquals(2.0, line.getStart().getX())
        assertEquals(2.0, line.getStart().getY())
        assertEquals(5.0, line.getEnd().getX())
        assertEquals(5.0, line.getEnd().getY())

        line.moveLine(-1.0, -1.0)
        assertEquals(1.0, line.getStart().getX())
        assertEquals(1.0, line.getStart().getY())
        assertEquals(4.0, line.getEnd().getX())
        assertEquals(4.0, line.getEnd().getY())
    }
}
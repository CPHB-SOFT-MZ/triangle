import org.junit.Assert;
import org.junit.Test;
import org.ziemer.test.triangle.Triangle;

import java.util.concurrent.ThreadLocalRandom;

public class TriangleTest {

    @Test
    public void testDetermineIsolescesTest() {
        Triangle.State expected = Triangle.State.ISOSCELES;

        // Test for failing
        Triangle.State result = Triangle.determine(1, 1, 2);
        Assert.assertNotEquals(expected, result);


        result = Triangle.determine(2, 2, 3);
        Assert.assertEquals(expected, result);
    }

    @Test
    public void testDetermineequiliteralTest() {
        Triangle.State expected = Triangle.State.EQUILITERAL;
        Triangle.State result = Triangle.determine(2, 2, 2);
        Assert.assertEquals(expected, result);

        result = Triangle.determine(1, 1, 1);
        Assert.assertEquals(expected, result);

        result = Triangle.determine(999999, 999999, 999999);
        Assert.assertEquals(expected, result);

        for (int i = 0; i < 10; i++) {
            int side = ThreadLocalRandom.current().nextInt(1, 999999 + 1);
            result = Triangle.determine(side, side, side);
            Assert.assertEquals(expected, result);
        }
    }

    @Test
    public void testDetermineScaleneTest() {
        Triangle.State expected = Triangle.State.SCALENE;
        // Test for failing
        Triangle.State result = Triangle.determine(1, 2, 2);
        Assert.assertNotEquals(expected, result);

        result = Triangle.determine(2, 3, 4);
        Assert.assertEquals(expected, result);
    }

    @Test
    public void testDetermineNotTriangleTest() {
        Triangle.State expected = Triangle.State.NOT_A_TRIANGLE;

        Triangle.State result = Triangle.determine(1, 1, 2);
        Assert.assertEquals(expected, result);

        result = Triangle.determine(0, 2, 2);
        Assert.assertEquals(expected, result);

        result = Triangle.determine(-2, -2, -2);
        Assert.assertEquals(expected, result);

    }
}

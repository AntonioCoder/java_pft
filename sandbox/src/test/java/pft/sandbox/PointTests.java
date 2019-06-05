package pft.sandbox;

import org.testng.Assert;
import org.testng.annotations.Test;

public class PointTests {

    @Test
    public void testDistance(){
        Point point1 = new Point(0,1);
        Point point2 = new Point(0,0);
        Assert.assertEquals(Point.distance(point1, point2), 1.0);
    }

}

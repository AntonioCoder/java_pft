package pft.sandbox;

import org.testng.Assert;
import org.testng.annotations.Test;

public class RectangleTests {

    @Test
    public void testArea(){
        Rectangle rectangle = new Rectangle(4,5);
        Assert.assertEquals(rectangle.area(), 20.0);
    }

}

package Tests.calculatorTest;

import classes.calculator.Devider;
import org.junit.Assert;
import org.junit.Test;

public class DeviderTest {

    @Test
    public void dev_4Dev2_2Returned(){

        Devider devider = new Devider();

        int result = devider.dev(4,2);

        Assert.assertEquals("",2,result);
    }
}

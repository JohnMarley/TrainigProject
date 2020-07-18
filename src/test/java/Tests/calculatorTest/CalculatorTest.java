package Tests.calculatorTest;

import classes.calculator.Calculator;
import org.junit.Assert;
import org.junit.Test;

public class CalculatorTest {

    @Test
    public void sum_2Plus5_7Returned(){
        //arrange
        Calculator calc = new Calculator();

        //act
        int result = calc.sum(2,5);

        //assert
        Assert.assertEquals("",7,result);
    }

    @Test
    public void calc(){
        System.out.println("Hollo!");
    }

}

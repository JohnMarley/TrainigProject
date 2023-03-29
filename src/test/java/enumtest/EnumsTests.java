package enumtest;

import enums.CalculatorOperationsSimpleEnum;
import enums.CalculatorOperationsWithDataEnum;
import enums.CalculatorOperationsWithDataLambdaEnum;
import org.junit.Test;

public class EnumsTests {

    @Test
    public void calculatorOperationsSimpleEnumTest() {
        var plus = CalculatorOperationsSimpleEnum.PLUS.apply(3, 4);
    }

    @Test
    public void calculatorOperationsWithDataEnum() {
        var operation = CalculatorOperationsWithDataEnum.MINUS.getOperation();
        CalculatorOperationsWithDataEnum.MINUS.apply(5, 1);
        var enumConst = CalculatorOperationsWithDataEnum.fromString("+");
        var enumConst1 = CalculatorOperationsWithDataEnum.fromString("*");
        System.out.println(enumConst);
    }

    @Test
    public void calculatorOperationsWithDataLambdaEnum() {
        var result1 = CalculatorOperationsWithDataLambdaEnum.PLUS.apply(4, 3);
    }
}

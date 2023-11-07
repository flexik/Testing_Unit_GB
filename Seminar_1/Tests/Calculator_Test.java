package Tests;


import seminars.first.Calculator.Calculator;
import org.assertj.core.api.Assertions;
import org.junit.Test;


public class Calculator_Test {
    @Test
    public void testCalculateDiscount() {
        Calculator calculator = new Calculator();
        double purchaseAmount = 100.0;
        int discountPercent = 20;
        double expectedDiscountedAmount = 80.0;

        double actualDiscountedAmount = calculator.calculatingDiscount(purchaseAmount, discountPercent);

        Assertions.assertThat(actualDiscountedAmount).isEqualTo(expectedDiscountedAmount);
    }

    @Test(expected = ArithmeticException.class)
    public void testCalculateDiscountWithInvalidArguments() {
        Calculator calculator = new Calculator();
        double purchaseAmount = -100.0;
        int discountPercent = 20;

        calculator.calculatingDiscount(purchaseAmount, discountPercent);
    }
}

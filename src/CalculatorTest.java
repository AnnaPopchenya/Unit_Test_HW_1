//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/>icon in the gutter.


import org.assertj.core.api.Assertions;


public class CalculatorTest {
    public static void main(String[] args) {

    }

    public void testCalculateDiscountValidArguments() {
        double purchaseAmount = 100.0;
        int discountAmount = 20;
        double expectedDiscountedAmount = 80.0;

        double discountedAmount = Calculator.calculateDiscount(purchaseAmount, discountAmount);

        Assertions.assertThat(discountedAmount).isEqualTo(expectedDiscountedAmount);
    }


    public void testCalculateDiscountInvalidArguments() {
        double purchaseAmount = -100.0;
        int discountAmount = 20;

        Assertions.assertThatThrownBy(() -> Calculator.calculateDiscount(purchaseAmount, discountAmount))
                .isInstanceOf(ArithmeticException.class)
                .hasMessage("Аргументы должны быть неотрицательными");
    }
}
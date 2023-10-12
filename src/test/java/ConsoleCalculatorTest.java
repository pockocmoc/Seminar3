import com.pockocmoc.calculator.Calculator;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertThrows;

public class ConsoleCalculatorTest {

    @Test
    void testSum() {
        double result = Calculator.sum(5, 3);
        Assertions.assertEquals(8, result, 0.0001);
    }

    @Test
    void testMultiply() {
        double result = Calculator.multiply(5, 3);
        Assertions.assertEquals(15, result, 0.0001);
    }

    @Test
    void testDivide() {
        double result = Calculator.divide(10, 2);
        Assertions.assertEquals(5, result, 0.0001);
    }

    @Test
    void testDivideByZero() {
        assertThrows(IllegalArgumentException.class, () -> Calculator.divide(10, 0));
    }

    @Test
    void testSubtract() {
        double result = Calculator.subtract(5, 3);
        Assertions.assertEquals(2, result, 0.0001);
    }

}
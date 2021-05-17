import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class CalculatorTests {

    private Calculator calculator;

    @Before
    public void setUp() throws Exception {
        calculator = new Calculator();
    }

    // Test for method add with double input.
    @Test
    public void add() {
        double result = calculator.add(10,5);
        double expected = 15;
        assertEquals(expected, result, 0.001);
    }

    // Test for method add with String input.
    @Test
    public void getStringAddNumbers() {
        double result = calculator.add("2", "3");
        double expected = 5;
        assertEquals(expected, result, 0.001);
    }

    // Test for method add with incorrect String input.
    @Test (expected = NumberFormatException.class)
    public void whenInputIncorrectValueThanThrowException(){
        calculator.add("14", "vnvnj");
    }

    // Test for method decrease with double input.
    @Test
    public void decrease() {
        double result = calculator.decrease(10,5);
        double expected = 5;
        assertEquals(expected, result, 0.001);
    }

    // Test for method decrease with String input.
    @Test
    public void getStringDecreaseNumber() {
        double result = calculator.decrease("5", "2");
        double expected = 3;
        assertEquals(expected, result, 0.001);
    }

    // Test for method multiply with double input.
    @Test
    public void multiply() {
        double result = calculator.multiply(2, 4);
        double expected = 8;
        assertEquals(expected, result, 0.001);
    }

    // Test for method multiply with String input.
    @Test
    public void getStringMultiplyNumbers() {
        double result = calculator.multiply("5", "4");
        double expected = 20;
        assertEquals(expected, result, 0.001);
    }

    // Test for method divide with double input.
    @Test
    public void divide() {
        double result = calculator.divide(11, 1.1);
        double expected = 10;
        assertEquals(expected, result, 0.001);
    }

    // Test for method divide with String input.
    @Test
    public void testDivide() {
        double result = calculator.divide("15", "3");
        double expected = 5;
        assertEquals(expected, result, 0.001);
    }

    // Test for method power with double input.
    @Test
    public void power() {
        double result = calculator.power(2, 3);
        double expected = 8;
        assertEquals(expected, result, 0.001);
    }

    // Test for method power with String input.
    @Test
    public void getStringTakeNumberToPower() {
        double result = calculator.power("3", "3");
        double expected = 27;
        assertEquals(expected, result, 0.001);
    }

}
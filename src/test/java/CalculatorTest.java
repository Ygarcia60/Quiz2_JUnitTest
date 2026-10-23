import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
//Will use TDD- Test Driven Development
// 1. Write failing unit tests first
// 2. Write just enough of production code to pass unit test

public class CalculatorTest {
    Calculator calculator = new Calculator();

    // Follow BUILD, OPERATE, CHECK
    //SUM
    @Test
    public void testSum() {
        int expected = 3;
        int actual = calculator.sum(1,2);
        assertEquals(expected, actual);
    }
    @Test
    public void testSumNegative() {
        int expected = 5;
        int actual = calculator.sum(-2,3);
        assertEquals(expected, actual);
    }
    @Test
    public void testSumZero() {
        int expected = 0;
        int actual = calculator.sum(7,0);
        assertEquals(expected, actual);
    }
    //Subtract
    @Test
    public void testSubtract() {
        int expected = -1;
        int actual = calculator.subtract(1,2);
        assertEquals(expected, actual);
    }
    @Test
    public void testSubtractNegative() {
        int expected = 1;
        int actual = calculator.subtract(-2,-3);
        assertEquals(expected, actual);
    }
    @Test
    public void testSubtractZero() {
        int expected = 3;
        int actual = calculator.subtract(0,-3);
        assertEquals(expected, actual);
    }
    //Multiply
    @Test
    public void testMultiply() {
        int expected = 2;
        int actual = calculator.multiply(1,2);
        assertEquals(expected, actual);
    }
    @Test
    public void testDivide() {
        int expected = 2;
        int actual = calculator.divide(2,1);
        assertEquals(expected, actual);
    }

    //boolean test --> true or false
    @Test
    public void testIsEven() {
        boolean actual = calculator.isEven(2);
        assertTrue(actual);
    }
    @Test
    public void testIsOdd() {
        boolean actual = calculator.isEven(3);
        assertFalse(actual);
    }

    @Test
    public void testDivideByZero() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> calculator.divide(1,0));
        String expectedMessage = "Ints can NOT be divided by zero";
        String actualMessage= exception.getMessage();
        assertEquals(expectedMessage,actualMessage);
    }

}

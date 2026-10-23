import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
//Will use TDD- Test Driven Development
// 1. Write failing unit tests first
// 2. Write just enough of production code to pass unit test

public class CalculatorTest {
    Calculator calculator = new Calculator();

    // Follow BUILD, OPERATE, CHECK
    @Test
    public void testSum() {
        int expected = 3;
        int actual = calculator.sum(1,2);
        assertEquals(expected, actual);
    }
    @Test
    public void testSubtract() {
        int expected = -1;
        int actual = calculator.subtract(1,2);
        assertEquals(expected, actual);
    }
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
    public void testIncrementArrays() {

        int[] expected = new int[]{2,3,4};
        int[] actual = calculator.incrementArrays(new int[]{1,2,3});
        assertArrayEquals(expected,actual);


    }

}

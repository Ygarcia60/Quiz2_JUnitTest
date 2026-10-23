import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
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

}

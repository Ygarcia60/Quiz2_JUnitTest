import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorTest {
    Calculator calculator = new Calculator();

    // Follow BUILD, OPERATE, CHECK
    @Test
    public void testSum() {
        //Recall that we should FIRST have a failing unit test

        int expected = 3;
        int actual = calculator.sum(1,2);
        assertEquals(expected, actual);

    }

}

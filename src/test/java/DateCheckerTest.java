import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.EnumSource;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class DateCheckerTest {

    DateChecker dateChecker = new DateChecker();
    //use Parameterized test for multiple values, or we run 12 individual unit tests
    //January , March, May, July, August, October, December

    //Single TEST case
    @Test
    public void testHas31DaysJanuary() {
        assertTrue(dateChecker.has31Days(DateChecker.Month.JANUARY));
    }
    // Parameterized TESTS
    @ParameterizedTest
    @EnumSource(value = DateChecker.Month.class, names = {"JANUARY" , "MARCH", "MAY", "JULY", "AUGUST",
            "OCTOBER", "DECEMBER" })

    public void testHas31Days(DateChecker.Month month) {

        assertTrue(dateChecker.has31Days(month));
    }
    //checking for months that DO NOT have 31 days
    // February, April, September
    @ParameterizedTest
    @EnumSource(value = DateChecker.Month.class, names = {"FEBRUARY" , "APRIL", "JUNE", "SEPTEMBER", "NOVEMBER"})
    public void testDoesNotHave31Days(DateChecker.Month month) {
        assertFalse(dateChecker.has31Days(month));
    }

    //EDGE CASES TESTS
    @Test
    public void testHas31DaysFeb() {
        assertTrue(dateChecker.has31Days(DateChecker.Month.FEBRUARY));
    }

}

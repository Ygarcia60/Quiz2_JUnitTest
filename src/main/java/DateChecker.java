public class DateChecker {
    enum Month {
        JANUARY,
        FEBRUARY,
        MARCH,
        APRIL,
        MAY,
        JUNE,
        JULY,
        AUGUST,
        SEPTEMBER,
        OCTOBER,
        NOVEMBER,
        DECEMBER
    }
    //January , March, May, July, August, October, December
    private DateChecker.Month[] monthThirtyOneDays = {Month.JANUARY, Month.MARCH, Month.MAY,
            Month.JULY, Month.AUGUST, Month.OCTOBER, Month.DECEMBER};

    public boolean has31Days(Month month) {
        return false;
    }

}

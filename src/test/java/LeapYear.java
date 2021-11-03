import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;


public class LeapYear {

    //Når det er delelig med 4, men ikke 100. 100 fails the test.
    @ParameterizedTest
    @ValueSource(ints = {40, 80, 120, 160, 240, 320})
    public void years_dividable_by_four_and_not_100_are_leap_years(int year){
        assertTrue(LeapYearCheck.isLeapYear(year));
    }

    //Når det er delelig med 400.
    @ParameterizedTest
    @ValueSource(ints = {400, 800, 1200, 2000, 2400})
    public void years_dividable_by_400_are_leap_years(int year) {
        assertTrue(LeapYearCheck.isLeapYear(year));
    }

    @ParameterizedTest
    @ValueSource(ints = {5, 7, 9, 13, 2027})
    public void years_not_dividable_by_4_are_not_leap_years(int year){
        assertFalse(LeapYearCheck.isLeapYear(year));
    }

    @ParameterizedTest
    @ValueSource(ints = {100, 200, 300, 500, 600})
    public void years_dividable_by_100_and_not_400_are_not_leap_years(int year){
        assertFalse(LeapYearCheck.isLeapYear(year));
    }

    @ParameterizedTest
    @ValueSource(ints = {2020, 2028, 2032, 2036})
    public void thisIsALeapYear(int year){
        assertTrue(LeapYearCheck.isLeapYear(year));
    }

    @ParameterizedTest
    @ValueSource(ints = {2021, 2029, 2033, 2037})
    public void thisIsNotALeapYear(int year){
        assertFalse(LeapYearCheck.isLeapYear(year));
    }
}
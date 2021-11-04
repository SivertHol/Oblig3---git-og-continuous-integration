public class LeapYearCheck {

    public static boolean isLeapYear(int year) {

        if (year % 4 == 0){ // Return true if "year" is dividable by 4
            if (year % 100 == 0) {  // However, if "year" is dividable by 100, return false.
                if (year % 400 == 0) {return true;} // Unless if it's also dividable by 400.
                return false;
            }
            return true;
        }
        else
            return false;
    }
}
package DayofWeek;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class DayOfWeekCalc {
	public static String find(int Year, int Month, int Day) {
        GregorianCalendar DayCalc = new GregorianCalendar(Year,Month - 1,Day);
        int DayOfWeek = DayCalc.get(Calendar.DAY_OF_WEEK);
        String DayName = "";

        if(DayOfWeek == Calendar.MONDAY) {
            DayName = "Monday";
        } else if(DayOfWeek == Calendar.TUESDAY) {
            DayName = "Tuesday";
        } else if(DayOfWeek == Calendar.WEDNESDAY) {
            DayName = "Wednesday";
        } else if(DayOfWeek == Calendar.THURSDAY) {
            DayName = "Thursday";
        } else if(DayOfWeek == Calendar.FRIDAY) {
            DayName = "Friday";
        } else if(DayOfWeek == Calendar.SATURDAY) {
            DayName = "Saturday";
        } else if(DayOfWeek == Calendar.SUNDAY) {
            DayName = "Sunday";
        }

        return DayName;
    }


}

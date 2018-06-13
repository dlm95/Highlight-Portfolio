package DayofWeek;

import java.util.Scanner;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

           
	Scanner stdin = new Scanner(System.in);
        String LineIn;
        int Year;
        int Month;
        int Day;

        System.out.print("Year: ");
        while(stdin.hasNextLine()) {
            LineIn = stdin.nextLine();
            Year = Integer.parseInt(LineIn);
            System.out.print("Month: ");
            LineIn = stdin.nextLine();
            Month = Integer.parseInt(LineIn);
            System.out.print("Day  : ");
            LineIn = stdin.nextLine();
            Day = Integer.parseInt(LineIn);
            System.out.println(Month + "/" + Day + "/" + Year + " is a " +
                               DayOfWeekCalc.find(Year, Month, Day));
           
        }
    }
}

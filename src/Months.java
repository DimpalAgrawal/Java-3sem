/*  Created by IntelliJ IDEA.
 *  User: Dimpal Agrawal
 *  Date: 27/10/20
 *  Time: 3:50 PM
 *  File Name : Months.java
 * */
import java.time.Month;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Locale;
import java.util.Scanner;

public enum Months {
    JANUARY(31),
    FEBRUARY(28),
    MARCH(31),
    APRIL(30),
    MAY(31),
    JUNE(30),
    JULY(31),
    AUGUST(31),
    SEPTEMBER(30),
    OCTOBER(31),
    NOVEMBER(30),
    DECEMBER(31);

    private final int numberOfDays;

    Months(int numberOfDays) {
        this.numberOfDays = numberOfDays;
    }

    public int getNumberOfDays() {
        return numberOfDays;
    }
}

class Main {
    private static final int JANUARY = 0;
    private static final int FEBRUARY = 1;
    private static final int MARCH = 2;
    private static final int APRIL = 3;
    private static final int MAY = 4;
    private static final int JUNE = 5;
    private static final int JULY = 6;
    private static final int AUGUST = 7;
    private static final int SEPTEMBER = 8;
    private static final int OCTOBER = 9;
    private static final int NOVEMBER = 10;
    private static final int DECEMBER = 11;

    public static void main(String[] args) {
        int currentMonth = new GregorianCalendar().get(Calendar.MONTH);
        System.out.println("The current Month is " + currentMonth);
        System.out.println(new GregorianCalendar().getDisplayName(Calendar.MONTH, Calendar.LONG, Locale.ENGLISH));
        int currentDate = new GregorianCalendar().get(Calendar.DATE);
        System.out.println("The current date is " + currentDate);
        Scanner scanner = new Scanner(System.in);
        int numberOfDays;
        int numberOfDaysLeftInMonths;
        switch (currentMonth) {
            case JANUARY:
                numberOfDays = Months.JANUARY.getNumberOfDays();
                numberOfDaysLeftInMonths = numberOfDays - currentDate;
                System.out.println("You have " + numberOfDays + " number of days in " + Months.JANUARY.name().toLowerCase()
                        + " days left in this month is " + numberOfDaysLeftInMonths);
                break;
            case FEBRUARY:
                numberOfDays = Months.FEBRUARY.getNumberOfDays();
                numberOfDaysLeftInMonths = numberOfDays - currentDate;
                System.out.println("You have " + numberOfDays + " number of days in " + Months.FEBRUARY.name().toLowerCase()
                        + " days left in this month is " + numberOfDaysLeftInMonths);
                break;
            case MARCH:
                numberOfDays = Months.MARCH.getNumberOfDays();
                numberOfDaysLeftInMonths = numberOfDays - currentDate;
                System.out.println("You have " + numberOfDays + " number of days in " + Months.MARCH.name().toLowerCase()
                        + " days left in this month is " + numberOfDaysLeftInMonths);
                break;
            case APRIL:
                numberOfDays = Months.APRIL.getNumberOfDays();
                numberOfDaysLeftInMonths = numberOfDays - currentDate;
                System.out.println("You have " + numberOfDays + " number of days in " + Months.APRIL.name().toLowerCase()
                        + " days left in this month is " + numberOfDaysLeftInMonths);
                break;
            case MAY:
                numberOfDays = Months.MAY.getNumberOfDays();
                numberOfDaysLeftInMonths = numberOfDays - currentDate;
                System.out.println("You have " + numberOfDays + " number of days in " + Months.MAY.name().toLowerCase()
                        + " days left in this month is " + numberOfDaysLeftInMonths);
                break;
            case JUNE:
                numberOfDays = Months.JUNE.getNumberOfDays();
                numberOfDaysLeftInMonths = numberOfDays - currentDate;
                System.out.println("You have " + numberOfDays + " number of days in " + Months.JUNE.name().toLowerCase()
                        + " days left in this month is " + numberOfDaysLeftInMonths);
                break;
            case JULY:
                numberOfDays = Months.JULY.getNumberOfDays();
                numberOfDaysLeftInMonths = numberOfDays - currentDate;
                System.out.println("You have " + numberOfDays + " number of days in " + Months.JULY.name().toLowerCase()
                        + " days left in this month is" + numberOfDaysLeftInMonths);
                break;
            case AUGUST:
                numberOfDays = Months.AUGUST.getNumberOfDays();
                numberOfDaysLeftInMonths = numberOfDays - currentDate;
                System.out.println("You have " + numberOfDays + " number of days in " + Months.AUGUST.name().toLowerCase()
                        + " days left in this month is " + numberOfDaysLeftInMonths);
                break;
            case SEPTEMBER:
                numberOfDays = Months.SEPTEMBER.getNumberOfDays();
                numberOfDaysLeftInMonths = numberOfDays - currentDate;
                System.out.println("You have " + numberOfDays + " number of days in " + Month.SEPTEMBER.name().toLowerCase()
                        + " days left in this month is " + numberOfDaysLeftInMonths);
                break;
            case OCTOBER:
                numberOfDays = Months.OCTOBER.getNumberOfDays();
                numberOfDaysLeftInMonths = numberOfDays - currentDate;
                System.out.println("You have " + numberOfDays + " number of days in " + Months.OCTOBER.name().toLowerCase()
                        + " days left in this month is " + numberOfDaysLeftInMonths);
                break;
            case NOVEMBER:
                numberOfDays = Months.NOVEMBER.getNumberOfDays();
                numberOfDaysLeftInMonths = numberOfDays - currentDate;
                System.out.println("You have " + numberOfDays + " number of days in " + Months.NOVEMBER.name().toLowerCase()
                        + " days left in this month is " + numberOfDaysLeftInMonths);
                break;
            case DECEMBER:
                numberOfDays = Months.DECEMBER.getNumberOfDays();
                numberOfDaysLeftInMonths = numberOfDays - currentDate;
                System.out.println("You have " + numberOfDays + " number of days in " + Months.DECEMBER.name().toLowerCase()
                        + " days left in this month is " + numberOfDaysLeftInMonths);
                break;
            default:
                System.out.println("Have a nice day");
        }
    }
}


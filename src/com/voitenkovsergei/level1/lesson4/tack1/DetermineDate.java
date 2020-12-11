package com.voitenkovsergei.level1.lesson4.tack1;

import java.util.Scanner;

/**
 * Имеются три числа - день, месяц и год, вводимые пользователем с консоли.
 * Вывести дату следующего дня в формате "День.Месяц.Год".
 * Учесть переход на следующий месяц, а также следующий год.
 * Форматирование строки "День.Месяц.Год" вынести в отдельную функцию.
 */
public class DetermineDate {
    public static void main(String[] args) {
        String date = getDate();

        System.out.println(date);
    }

    public static String getDate() {
        final short dateIncrement = 1;
        int day = entryConsole();
        int month = entryConsole();
        int year = entryConsole();
        boolean isCheckNumbers = false;
        boolean isLeapYear = isLeapYear(year);
        int daysInAMonth = getNumberDaysMonth(month, isLeapYear);

        while (!isCheckNumbers) {
            if (!(isCheckNumbers = isCheckNumbers(day, month, year, daysInAMonth))) {
                day = entryConsole();
                month = entryConsole();
                year = entryConsole();
            }
        }

        return getIncrementalDate(day, month, year, daysInAMonth, dateIncrement);
    }

    public static boolean isCheckNumbers(int day, int month, int year, int daysInAMonth) {
        return (0 < day && day <= daysInAMonth) && (0 < month && month <= 12) && year >= 0;
    }

    public static int entryConsole() {
        @SuppressWarnings("resource")
        Scanner scanner = new Scanner(System.in);

        while (!scanner.hasNextShort()) {
            scanner.nextLine();
        }

        return scanner.nextInt();
    }

    public static boolean isLeapYear(int dateYear) {
        return (dateYear % 4 == 0 && dateYear % 100 != 0) || (dateYear % 400 == 0);
    }

    public static int getNumberDaysMonth(int dateMonth, boolean isLeapYear) {
        if (isLeapYear) {
            return dateMonth == 2 ? 29 : dateMonth == (4 | 6 | 9 | 11) ? 30 : 31;
        } else {
            return dateMonth == 2 ? 28 : dateMonth == (4 | 6 | 9 | 11) ? 30 : 31;
        }
    }

    public static String getIncrementalDate(int day, int month, int year, int daysInAMonth, int dateIncrement) {
        if ((day + dateIncrement) <= daysInAMonth) {
            return (day + dateIncrement) + "." + month + "." + year;
        } else if ((day + dateIncrement) > daysInAMonth && month < 12) {
            return 1 + "." + (month + 1) + "." + year;
        } else {
            return 1 + "." + 1 + "." + (year + 1);
        }
    }


}
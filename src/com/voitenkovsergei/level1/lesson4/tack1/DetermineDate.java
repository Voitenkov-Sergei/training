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
        String date = getIncrementedDate();
        System.out.println(date);
    }

    public static String getIncrementedDate() {

        int day = getDataFromConsole();
        int month = getDataFromConsole();
        int year = getDataFromConsole();
        boolean isCheckNumbers = false;
        boolean isLeapYear = isLeapYear(year);
        int daysInAMonth = getMonthDays(month, isLeapYear);

        while (!isCheckNumbers) {
            if (!(isCheckNumbers = isCheckNumbers(day, month, year, daysInAMonth))) {
                day = getDataFromConsole();
                month = getDataFromConsole();
                year = getDataFromConsole();
            }
        }

        return getIncrementalDate(day, month, year, daysInAMonth);
    }

    public static boolean isCheckNumbers(int day, int month, int year, int daysInAMonth) {
        return (0 < day && day <= daysInAMonth) && (0 < month && month <= 12) && year >= 0;
    }

    public static int getDataFromConsole() {
        @SuppressWarnings("resource")
        Scanner scanner = new Scanner(System.in);

        while (!scanner.hasNextShort()) {
            scanner.nextLine();
        }

        return scanner.nextInt();
    }

    public static boolean isLeapYear(int year) {
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }

    public static int getMonthDays(int month, boolean isLeapYear) {
        int days;

        if (month == 2) {
            days = isLeapYear ? 29 : 28;
        } else {
            days = (month == 4) || (month == 6) || (month == 9) || (month == 11) ? 30 : 31;
        }

        return days;
    }

    public static String getIncrementalDate(int day, int month, int year, int daysInAMonth) {
        final short dateIncrement = 1;

        if ((day + dateIncrement) <= daysInAMonth) {
            return (day + dateIncrement) + "." + month + "." + year;
        } else if ((day + dateIncrement) > daysInAMonth && month < 12) {
            return 1 + "." + (month + 1) + "." + year;
        } else {
            return 1 + "." + 1 + "." + (year + 1);
        }
    }
}
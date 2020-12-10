package com.voitenkovsergei.level1.lesson4_3.tack1;

import java.util.Scanner;

/**
 * Имеются три числа - день, месяц и год, вводимые пользователем с консоли.
 * Вывести дату следующего дня в формате "День.Месяц.Год".
 * Учесть переход на следующий месяц, а также следующий год.
 * Форматирование строки "День.Месяц.Год" вынести в отдельную функцию.
 */

public class Date {

    public static void main(String[] args) {

        short dateDey = 0;
        short dateMonth = 0;
        short dateYear = 0;
        int numberAfterNumberDays = 1;
        boolean matchingEnteredData = false;

        while (!matchingEnteredData) {
            System.out.print("Введите число: ");
            dateDey = entryConsole();
            System.out.print("Введите месяц: ");
            dateMonth = entryConsole();
            System.out.print("Введите год: ");
            dateYear = entryConsole();
            System.out.println("Узнать дату через веденное количество дней. Введите число: ");
            numberAfterNumberDays = entryConsoleInt();

            matchingEnteredData = verificationOfEnteredData(dateDey, dateMonth, dateYear);
        }

        getDate(dateDey, dateMonth, dateYear, numberAfterNumberDays);

    }

    public static short entryConsole() {

        @SuppressWarnings("resource")
        Scanner scanner = new Scanner(System.in);

        while (!scanner.hasNextShort()) {
            scanner.nextLine();
        }

        return scanner.nextShort();

    }

    public static int entryConsoleInt() {

        @SuppressWarnings("resource")
        Scanner scanner = new Scanner(System.in);

        while (!scanner.hasNextInt()) {
            scanner.nextLine();
        }

        return scanner.nextInt();

    }

    public static Short daysInAMonth(short dateMonth, boolean isLeapYear) {

        if (isLeapYear) {
            return switch (dateMonth) {
                case 1, 3, 5, 7, 8, 10, 12 -> (short) 31;
                case 2 -> (short) 29;
                case 4, 6, 9, 11 -> (short) 30;
                default -> (short) 0;
            };

        } else {
            return switch (dateMonth) {
                case 1, 3, 5, 7, 8, 10, 12 -> (short) 31;
                case 2 -> (short) 28;
                case 4, 6, 9, 11 -> (short) 30;
                default -> (short) 0;
            };
        }


    }

    public static boolean verificationOfEnteredData(short dateDey, short dateMonth, short dateYear) {

        short monthsOfYear = 12;
        boolean isLeapYear = isLeapYear(dateYear);

        if (dateYear > 0) {

            if (dateMonth <= monthsOfYear && dateMonth > 0) {

                String endingInAWord;
                int daysInOfAMonth = daysInAMonth(dateMonth, isLeapYear);

                if (daysInOfAMonth == 31) {
                    endingInAWord = "дня";
                } else {
                    endingInAWord = "дней";
                }

                if (dateDey > daysInOfAMonth || dateDey < 1) {
                    System.out.println("В " + dateMonth + " месяце от 1 до " + daysInOfAMonth + " " + endingInAWord + ". Повторите ввод заново!");
                    return false;
                } else {
                    return true;
                }

            } else {
                System.out.println("В году от 1 до 12 месяцев. Вы ввели неверный месяц: " + dateMonth + '\n' + "Повторите ввод заново!");
                return false;
            }

        } else {
            System.out.println("Год не может быть отрицательным! Повторите ввод!");
            return false;
        }

    }

    public static boolean isLeapYear(short dateYear) {

        return (dateYear % 4 == 0 && dateYear % 100 != 0) || (dateYear % 400 == 0);

    }

    public static void getDate(short dateDey, short dateMonth, short dateYear, int numberAfterNumberDays) {

        short monthsOfYear = 12;

        boolean isLeapYear = isLeapYear(dateYear);

        if (numberAfterNumberDays >= 0) {

            while (numberAfterNumberDays != 0) {

                int daysInOfAMonth = daysInAMonth(dateMonth, isLeapYear);

                dateDey++;
                numberAfterNumberDays--;

                if (dateDey > daysInOfAMonth) {
                    dateDey = 1;
                    dateMonth++;

                    if (dateMonth > monthsOfYear) {
                        dateMonth = 1;
                        dateYear++;
                        isLeapYear = isLeapYear(dateYear);

                    }
                }
            }

            System.out.println(dateDey + "." + dateMonth + "." + dateYear);

        } else {

            while (numberAfterNumberDays < 0) {

                int daysInOfAMonth = daysInAMonth(dateMonth, isLeapYear);

                dateDey--;
                numberAfterNumberDays++;

                if (dateDey == 0) {
                    dateMonth--;
                    isLeapYear = isLeapYear(dateYear);
                    dateDey = (short) daysInOfAMonth;

                    if (dateMonth == 0) {
                        dateYear--;
                        dateMonth = monthsOfYear;

                        if (dateYear < 0) {
                            break;
                        }
                    }
                }

            }

            if (dateYear < 0) {
                System.out.println("Год не может быть отрицательным!");

            } else {
                System.out.println(dateDey + "." + dateMonth + "." + dateYear);
            }
        }
    }
}

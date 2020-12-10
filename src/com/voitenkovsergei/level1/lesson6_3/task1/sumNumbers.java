package com.voitenkovsergei.level1.lesson6_3.task1;

import java.util.Scanner;

/**
 * Написать программу, вычисляющую сумму цифр введённого пользователем целого числа.
 */
public class sumNumbers {
    public static void main(String[] args) {

        int numberUser = entryConsole("Введите целое число: ");

        calculateSumNumbers(numberUser);

    }

    public static int entryConsole(String text) {
        System.out.print(text);

        @SuppressWarnings("resource")
        Scanner scanner = new Scanner(System.in);

        while (!scanner.hasNextInt()) {

            System.out.print("Введенное данные не соответствует требованию." + '\n' + text);
            scanner.nextLine();

        }

        return scanner.nextInt();

    }

    public static void calculateSumNumbers(int numberUser) {

        int number = numberUser;
        int sumNumbers = 0;

        while (number != 0) {
            sumNumbers += number % 10;
            number /= 10;

        }

        System.out.println("Сумма цифр числа '" + numberUser + "' = " + sumNumbers);
    }
}

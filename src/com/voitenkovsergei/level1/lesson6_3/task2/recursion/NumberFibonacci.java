package com.voitenkovsergei.level1.lesson6_3.task2.recursion;

import java.util.Scanner;

/**
 * Написать программу, вычисляющую и отображающую все числа Фибоначчи меньше введённого пользователем целого числа.
 * Решить двумя способами: с помощью цикла и с помощью рекурсии.
 */
public class NumberFibonacci {
    public static void main(String[] args) {

        int numberUser = entryConsole("Введите челое число: ");
        numberFibonacciRecursion(numberUser, numberUser);
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

    public static int formulaFibonacci(int indexRecursion) {
        double a = Math.pow(((1 + Math.sqrt(5)) / 2), indexRecursion);
        double b = Math.pow(((1 - Math.sqrt(5)) / 2), indexRecursion);
        return (int) ((a - b) / Math.sqrt(5));
    }

    public static void numberFibonacciRecursion(int numberUser, int indexRecursion) {

        if (numberUser > 0) {

            int numberFibonacci = formulaFibonacci(indexRecursion);

            if (numberFibonacci < numberUser && numberFibonacci >= 0) {

                System.out.println("Номер элемента ряда Фибоначи '" + indexRecursion + "' равен числу Фибоначи: " + numberFibonacci);

            }

        } else {

            int numberFibonacci = (int) ((Math.pow((-1), (-1) * indexRecursion + 1)) * formulaFibonacci((-1) * indexRecursion));


            if (numberFibonacci > 0) {
                numberFibonacci *= (-1);

            }
            if (numberFibonacci > numberUser) {
                System.out.println("Номер элемента ряда Фибоначи '" + indexRecursion + "' равен числу Фибоначи: " + numberFibonacci);
            }

        }

        if (indexRecursion > 0) {
            numberFibonacciRecursion(numberUser, indexRecursion - 1);
        } else if (indexRecursion < 0) {
            numberFibonacciRecursion(numberUser, indexRecursion + 1);
        }

    }

}

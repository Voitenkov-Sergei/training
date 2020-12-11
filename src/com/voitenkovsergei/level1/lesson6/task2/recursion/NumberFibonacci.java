package com.voitenkovsergei.level1.lesson6.task2.recursion;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Написать программу, вычисляющую и отображающую все числа Фибоначчи меньше введённого пользователем целого числа.
 * Решить двумя способами: с помощью цикла и с помощью рекурсии.
 */
public class NumberFibonacci {
    public static void main(String[] args) {
        int numberUser = entryConsole();
        int serialNumber = 0;
        int indexArray = 0;
        int[] arrayNumberFibonacci = new int[getSizeArray(numberUser)];
        arrayNumberFibonacci = listNumbersFibonacci(numberUser, serialNumber, arrayNumberFibonacci, indexArray);

        System.out.println(Arrays.toString(arrayNumberFibonacci));
    }

    public static int entryConsole() {
        @SuppressWarnings("resource")
        Scanner scanner = new Scanner(System.in);

        while (!scanner.hasNextInt()) {
            scanner.nextLine();
        }

        return scanner.nextInt();
    }

    public static int getFibonacciValue(int serialNumber) {
        double a = Math.pow((1 + Math.sqrt(5)) / 2, serialNumber);
        double b = Math.pow((1 - Math.sqrt(5)) / 2, serialNumber);

        return (int) Math.round((a - b) / Math.sqrt(5));
    }

    public static int getSizeArray(int numberUser) {
        int index = 0;
        int sizeArray = 0;
        boolean flag = true;

        if (numberUser >= 0) {
            while (flag) {
                int Fibonacci = getFibonacciValue(index);
                index++;

                if (Fibonacci < numberUser) {
                    sizeArray++;
                } else {
                    flag = false;
                }
            }
        } else {
            while (flag) {
                int Fibonacci = (int) Math.pow((-1), index + 1) * getFibonacciValue(index);
                index++;

                if (Fibonacci > numberUser) {
                    if (Fibonacci <= 0) {
                        sizeArray++;
                    }
                } else {
                    flag = false;
                }
            }
        }

        return sizeArray;
    }

    public static int[] listNumbersFibonacci(int numberUser, int serialNumber, int[] arrayNumberFibonacci, int indexArray) {

        if (numberUser >= 0) {
            int numberFibonacci = getFibonacciValue(serialNumber);

            if (numberFibonacci < numberUser) {
                arrayNumberFibonacci[indexArray] = numberFibonacci;
                return listNumbersFibonacci(numberUser, serialNumber + 1, arrayNumberFibonacci, indexArray + 1);
            }

        } else {

            int numberFibonacci = (int) Math.pow((-1), serialNumber + 1) * getFibonacciValue(serialNumber);

            if (numberFibonacci > numberUser) {
                if (numberFibonacci <= 0) {
                    arrayNumberFibonacci[indexArray] = numberFibonacci;
                    indexArray = indexArray + 1;
                }
                listNumbersFibonacci(numberUser, serialNumber + 1, arrayNumberFibonacci, indexArray);
            }
        }

        return arrayNumberFibonacci;
    }
}



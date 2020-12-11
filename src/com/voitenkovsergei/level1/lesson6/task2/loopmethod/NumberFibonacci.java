package com.voitenkovsergei.level1.lesson6.task2.loopmethod;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Написать программу, вычисляющую и отображающую все числа Фибоначчи меньше введённого пользователем целого числа.
 * Решить двумя способами: с помощью цикла и с помощью рекурсии.
 */
public class NumberFibonacci {
    public static void main(String[] args) {
        int numberUser = entryConsole();
        int[] arrayNumberFibonacci = listNumbersFibonacci(numberUser);

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

    public static int getFibonacciNumber(int index) {
        double a = Math.pow((1 + Math.sqrt(5)) / 2, index);
        double b = Math.pow((1 - Math.sqrt(5)) / 2, index);

        return (int) Math.round((a - b) / Math.sqrt(5));
    }

    public static int getSizeArray(int numberUser) {
        int index = 0;
        int sizeArray = 0;
        boolean flag = true;

        if (numberUser >= 0) {
            while (flag) {
                int Fibonacci = getFibonacciNumber(index);
                index++;

                if (Fibonacci < numberUser) {
                    sizeArray++;
                } else {
                    flag = false;
                }
            }
        } else {
            while (flag) {
                int Fibonacci = (int) Math.pow((-1), index + 1) * getFibonacciNumber(index);
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

    public static int[] listNumbersFibonacci(int numberUser) {
        int index = 0;
        int indexArray = 0;
        boolean flag = true;
        int[] array = new int[getSizeArray(numberUser)];

        if (numberUser >= 0) {
            while (flag) {
                int Fibonacci = getFibonacciNumber(index);
                index++;

                if (Fibonacci < numberUser) {
                    array[indexArray] = Fibonacci;
                    indexArray++;
                } else {
                    flag = false;
                }
            }
        } else {
            while (flag) {
                int Fibonacci = (int) Math.pow((-1), index + 1) * getFibonacciNumber(index);
                index++;

                if (Fibonacci > numberUser) {
                    if (Fibonacci <= 0) {
                        array[indexArray] = Fibonacci;
                        indexArray++;
                    }
                } else {
                    flag = false;
                }
            }
        }

        return array;
    }
}
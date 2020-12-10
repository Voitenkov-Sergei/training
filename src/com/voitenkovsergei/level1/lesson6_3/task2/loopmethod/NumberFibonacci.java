package com.voitenkovsergei.level1.lesson6_3.task2.loopmethod;

import java.util.Scanner;

/**
 * Написать программу, вычисляющую и отображающую все числа Фибоначчи меньше введённого пользователем целого числа.
 * Решить двумя способами: с помощью цикла и с помощью рекурсии.
 */

public class NumberFibonacci {

    public static void main(String[] args) {

        int numberUser = entryConsole("Введите челое число: ");
        numberFibonacciLoopMethod(numberUser);
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

    public static void numberFibonacciLoopMethod(int numberUser) {

        int index = 0;
        int F0 = 0;
        int F1 = 1;
        int Fn = 0;

        if (numberUser > 0) {

            while (Fn < numberUser) {

                if (index == 0) {
                    System.out.println("Номер элемента ряда Фибоначи '" + index + "' равен числу Фибоначи: " + F0);
                    index++;
                } else if (index == 1 && numberUser != 1) {
                    System.out.println("Номер элемента ряда Фибоначи '" + index + "' равен числу Фибоначи: " + F1);
                    index++;
                } else if (index >= 2) {

                    if (F0 + F1 < numberUser) {
                        Fn = F0 + F1;
                        F0 = F1;
                        F1 = Fn;
                        System.out.println("Номер элемента ряда Фибоначи '" + index + "' равен числу Фибоначи: " + Fn);
                        index++;
                    } else {
                        break;
                    }

                }

            }

        } else {

            while (Fn > numberUser) {

                if (index == 0) {
                    System.out.println("Номер элемента ряда Фибоначи '" + index + "' равен числу Фибоначи: " + F0);
                    index--;
                } else if (index == -1 && numberUser != -1) {
                    System.out.println("Номер элемента ряда Фибоначи '" + index + "' равен числу Фибоначи: " + F0);
                    index--;
                } else if (index <= -2) {

                    if ((-1) * F1 + F0 > numberUser) {
                        Fn = (-1) * F1 + F0;
                        F0 = F1;
                        F1 = Fn;
                        System.out.println("Номер элемента ряда Фибоначи '" + index + "' равен числу Фибоначи: " + Fn);
                        index--;
                    } else {
                        break;
                    }

                }

            }

        }

    }



}

package com.voitenkovsergei.level1.lesson6.task1;

import java.util.Scanner;

/**
 * Написать программу, вычисляющую сумму цифр введённого пользователем целого числа.
 */
public class SumDigits {
    public static void main(String[] args) {
        int numberUser = 123;
        int sumDigits = calculateSumNumbers(numberUser);
    }

    public static int calculateSumNumbers(int numberUser) {
        int sumDigits = 0;

        while (numberUser != 0) {
            sumDigits += numberUser % 10;
            numberUser /= 10;
        }

        return sumDigits;
    }
}
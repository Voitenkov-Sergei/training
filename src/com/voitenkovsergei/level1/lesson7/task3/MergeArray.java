package com.voitenkovsergei.level1.lesson7.task3;

import java.util.Arrays;

/**
 * Заданы 2 массива целых чисел произвольной длины.
 * Написать программу, создающую третий массив, представляющий собой слияние 2-х заданных.
 * <p>
 * Пример:
 * <p>
 * 1-й массив: {1, 2, 3, 4, 5}
 * 2-й массив: {5, 6, 7}
 * <p>
 * Результат: {1, 5, 2, 6, 3, 7, 4, 5}
 */
public class MergeArray {
    public static void main(String[] args) {
        int[] array1 = new int[]{1, 3, 5, 7, 9};
        int[] array2 = new int[]{2, 4, 6};
        int[] arrayResult = (concatenateArrays(array1, array2));

        System.out.println(Arrays.toString(array1));
        System.out.println(Arrays.toString(array2));
        System.out.println(Arrays.toString(arrayResult));
    }

    public static int[] concatenateArrays(int[] arrayOne, int[] arrayTwo) {
        int[] arrayThree = new int[arrayOne.length + arrayTwo.length];
        int countOne = 0;
        int countTwo = 0;

        for (int i = 0; i < arrayThree.length; i++) {

            if ((countOne == countTwo && countOne != arrayOne.length) || countTwo == arrayTwo.length) {
                arrayThree[i] = arrayOne[countOne];
                countOne++;
            } else {
                arrayThree[i] = arrayTwo[countTwo];
                countTwo++;
            }
        }

        return arrayThree;
    }
}

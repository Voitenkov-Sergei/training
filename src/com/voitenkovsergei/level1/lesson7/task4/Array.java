package com.voitenkovsergei.level1.lesson7.task4;

import java.util.Arrays;

/**
 * Написать функцию linearize, которая принимает в качестве параметра двумерный массив и
 * возвращает одномерный массив со всеми элементами двумерного.
 */
public class Array {
    public static void main(String[] args) {
        int[][] array = {{1, 3, 5, 7, 9}, {2, 4, 6, 8}};
        int[] arrayResult = linearize(array);

        System.out.println(Arrays.deepToString(array));
        System.out.println(Arrays.toString(arrayResult));
    }

    public static int[] linearize(int[][] array) {
        int[] arrayResult = new int[counter(array)];

        for (int index = 0; index < arrayResult.length; index++) {

            for (int i = 0; i < array.length; i++) {

                for (int j = 0; j < array[i].length; j++) {
                    arrayResult[index] = array[i][j];
                    index++;
                }
            }
        }

        return arrayResult;
    }

    public static int counter(int[][] array) {
        int count = 0;

        for (int i = 0; i < array.length; i++) {

            for (int j = 0; j < array[i].length; j++) {
                count++;
            }
        }

        return count;
    }
}

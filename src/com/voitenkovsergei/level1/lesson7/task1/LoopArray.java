package com.voitenkovsergei.level1.lesson7.task1;

import java.util.Arrays;

/**
 * Напишите программу, которая циклически сдвигает элементы массива вправо на одну позицию, и печатает результат.
 * Цикличность означает, что последний элемент массива становится самым первым его элементом.
 */
public class LoopArray {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};
        int shiftsNumbers = 5;
        System.out.println(Arrays.toString(cyclically(array, shiftsNumbers)));
    }

    public static int[] cyclically(int[] array, int shiftsNumbers) {

        while (shiftsNumbers != 0) {
            int temp = array[array.length - 1];

            for (int i = array.length - 1; i > 0; i--) {
                array[i] = array[i - 1];
            }

            shiftsNumbers--;
            array[0] = temp;
        }
        return array;
    }
}

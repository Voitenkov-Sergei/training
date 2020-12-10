package com.voitenkovsergei.level1.lesson7_3.task1;

import java.util.Arrays;

/**
 * Напишите программу, которая циклически сдвигает элементы массива вправо на одну позицию, и печатает результат.
 * Цикличность означает, что последний элемент массива становится самым первым его элементом.
 */

public class LoopArray {

    public static void main(String[] args) {

        cyclically();
    }

    public static void cyclically() {

        int count = 10;

        int[] array = new int[] {1,2,3,4,5};

        while (count != 0){

            int temp = array[array.length-1];

            System.arraycopy(array, 0, array, 1, array.length - 1);

            array[0] = temp;
            System.out.println(Arrays.toString(array));
            count--;
        }

    }

}

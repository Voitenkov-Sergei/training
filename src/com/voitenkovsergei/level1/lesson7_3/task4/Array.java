package com.voitenkovsergei.level1.lesson7_3.task4;

import java.util.Arrays;

/**
 * Написать функцию linearize, которая принимает в качестве параметра двумерный массив и
 * возвращает одномерный массив со всеми элементами двумерного.
 */
public class Array {

    public static void main(String[] args) {

        int[] arrayOne = new int[] {1,3,5,7,9};
        int[] arrayTwo = new int[] {2,4,6,8};
        int[] array = linearize(arrayOne, arrayTwo);
        System.out.println(Arrays.toString(arrayOne));
        System.out.println(Arrays.toString(arrayTwo));
        System.out.println(Arrays.toString(array));

    }

    public static int[] linearize(int[] arrayOne, int[] arrayTwo){

        int[] array = new int[arrayOne.length + arrayTwo.length];

        System.arraycopy(arrayOne,0,array,0, arrayOne.length);
        System.arraycopy(arrayTwo, 0, array, arrayOne.length, arrayTwo.length);

        return array;
    }

}

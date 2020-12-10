package com.voitenkovsergei.level1.lesson7_3.task2;

import java.util.Arrays;

/**
 * Написать программу, удаляющую все повторяющиеся целые числа из массива и печатающую результат.
 * Массив должен использоваться тот же самый. На место удаленных элементов ставить цифру 0.
 */
public class UniqueArray {
    public static void main(String[] args) {

        int[] array = new int[] {1,1,2,3,4,4,4,8,6,7,7,2,1};

        System.out.println(Arrays.toString(array) + " - изначальный массив.");
        removeDuplicateNumbers(array);
    }

    public static void removeDuplicateNumbers(int[] array){

        for(int i = 0; i < array.length; i++) {

            for(int j = i + 1; j < array.length; j++){

                if (array[j] == array[i]){
                    array[j] = 0;
                }

            }

        }

        System.out.println( Arrays.toString(array) + " - массив отредактированный.");
    }
}

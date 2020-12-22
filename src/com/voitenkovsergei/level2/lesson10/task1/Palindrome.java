package com.voitenkovsergei.level2.lesson10.task1;

/**
 * Проверить, является ли введённая строка палиндромом, т.е. читается одинаково в обоих направлениях.
 */
public class Palindrome {

    public static void main(String[] args) {
        String text = "aa5s5aa";
        System.out.println(isPalindrome(text));
    }

    public static boolean isPalindrome(String text) {
        StringBuffer stringBuffer = new StringBuffer(text).reverse();

        return stringBuffer.toString().equals(text);
    }
}

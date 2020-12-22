package com.voitenkovsergei.level2.lesson10.task2;

/**
 * Написать программу, преобразующую строку, содержащую число в римском формате, в число в арабском формате.
 * Границы чисел: от 1 до 3999. Предусмотреть случай, когда меньший символ идёт перед большим:
 * Например CM == 900.
 * <p>
 * Соответствие:
 * M 1000
 * D 500
 * C 100
 * L 50
 * X 10
 * V 5
 * I 1
 */
public class ArabicFormat {

    public static void main(String[] args) {
        String romanNumber = "XVIII";
        int arabicNumber = getArabicNumber(romanNumber);
        System.out.println(arabicNumber);
    }

    public static int getArabicNumber(String text) {
        int number = 0;

        for (int i = 0; i < text.length(); i++) {
            int symbol1;
            int symbol2 = 0;
            int symbol3 = 0;

            if (text.length() - i == 1) {
                symbol1 = getNumber(text.charAt(i));
            } else if (text.length() - i == 2) {
                symbol1 = getNumber(text.charAt(i));
                symbol2 = getNumber(text.charAt(i + 1));
            } else {
                symbol1 = getNumber(text.charAt(i));
                symbol2 = getNumber(text.charAt(i + 1));
                symbol3 = getNumber(text.charAt(i + 2));
            }

            if (symbol1 == symbol2 && symbol2 == symbol3) {
                number += symbol1 + symbol2 + symbol3;
                i += 2;
            } else if (symbol1 == symbol2) {
                number += symbol1 + symbol2;
                i++;
            } else if (symbol1 < symbol2) {
                number += symbol2 - symbol1;
                i++;
            } else if (symbol2 == symbol3) {
                number += symbol1;
            } else {
                number += symbol1 + symbol2;
                i++;
            }
        }

        return number;
    }

    public static int getNumber(char letter) {
        return switch (letter) {
            case 'I' -> 1;
            case 'V' -> 5;
            case 'X' -> 10;
            case 'L' -> 50;
            case 'C' -> 100;
            case 'D' -> 500;
            case 'M' -> 1000;
            default -> 0;
        };
    }
}
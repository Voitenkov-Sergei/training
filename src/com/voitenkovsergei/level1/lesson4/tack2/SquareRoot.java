package com.voitenkovsergei.level1.lesson4.tack2;

import java.util.Scanner;

/**
 * Написать программу, вычисляющую корни квадратного уравнения вида ax ² + bx + c = 0, где a, b и c - вводимые
 * пользователем из консоли данные.
 * Учитывать только реальные корни (в случае отрицательного дискриминанта выводить сообщение пользователю).
 * При решении создать и использовать следующие вынесенные функции:
 * - функция isPositive, определяющая, является ли число положительным
 * - функция isZero, определяющая, является ли число нулём
 * - функция discriminant, вычисляющая дискриминант
 */
public class SquareRoot {
    public static void main(String[] args) {
        int discriminant = discriminant();
        boolean isPositive = isPositive(discriminant);
        boolean isZero = isZero(discriminant);
    }

    public static int discriminant() {
        int discriminant;
        int a = consoleInput();
        int b = consoleInput();
        int c = consoleInput();

        discriminant = (int) Math.pow(b, 2) - 4 * a * c;
        if (discriminant < 0) {
            System.out.println("Дискрименант отрицательный. Решений нет.");
        }

        return discriminant;
    }

    public static int consoleInput() {
        @SuppressWarnings("resource")
        Scanner scanner = new Scanner(System.in);

        while (!scanner.hasNextInt()) {
            scanner.nextLine();
        }

        return scanner.nextInt();
    }

    public static boolean isPositive(int discriminant) {
        return discriminant > 0;
    }

    public static boolean isZero(int discriminant) {
        return discriminant == 0;
    }
}
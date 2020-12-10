package com.voitenkovsergei.level1.lesson4_3.tack2;

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

        int numberA = consoleInput("numberA");
        int numberB = consoleInput("numberB");
        int numberC = consoleInput("numberC");

        discriminant(numberA, numberB, numberC);

    }

    public static int consoleInput(String text){

        System.out.print("Введите число " + text + ": ");

        @SuppressWarnings("resource")
        Scanner scanner = new Scanner(System.in);

        while(!scanner.hasNextInt()){
            scanner.nextLine();
            System.out.print("Введите число " + text + ": ");

        }

        return scanner.nextInt();
    }

    public static void isPositive(int number){

            System.out.println("Дискриминант = " + number + ". Имеет два положительных корня.");

    }

    public static void isZero(int number){

            System.out.println("Дискриминант = " + number + ". Имеет два равных корня.");

    }

    public static void discriminant(int numberA, int numberB, int numberC){

        int resultDiscriminant = (int) Math.pow(numberB, 2) - 4 * numberA * numberC;

        if (resultDiscriminant > 0){
            isPositive(resultDiscriminant);

        } else if (resultDiscriminant == 0 ){
            isZero(resultDiscriminant);

        } else {
            System.out.println("Дискриминант = " + resultDiscriminant + ". Имеет два комплексно сопряженных корня");
        }

    }

}

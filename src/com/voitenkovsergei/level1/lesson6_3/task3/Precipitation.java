package com.voitenkovsergei.level1.lesson6_3.task3;

import java.util.Scanner;

/**
 * Написать программу, отображающую статистику по осадкам за N дней. N вводится пользователем.
 * Пользователь также должен ввести N целых чисел, обозначающих величину осадков в день.
 * Программа должна выводить:
 * a. Количество дней
 * b. Сумму осадков за этот период
 * c. Среднее количество осадков за этот период
 * d. Максимальное количество дневных осадков за этот период
 * Не использовать массивы!
 */
public class Precipitation {
    public static void main(String[] args) {

        int amountDays = entryConsole("Введите количество дней: ");
        outputAmountDays(amountDays);

    }

    public static int entryConsole(String text) {

        System.out.print(text);

        @SuppressWarnings("resource")
        Scanner scanner = new Scanner(System.in);

        while (!scanner.hasNextInt()) {
            scanner.nextLine();
        }

        return scanner.nextInt();

    }


    public static void outputAmountDays(int amountDays) {

        int precipitationAmount = 0;
        int maximumPrecipitation = 0;

        for (int i = 0; i < amountDays; i++) {

            int rainfallPerDay = entryConsole("Введите количество осадков в " + (i + 1) + " день. ");
            precipitationAmount += rainfallPerDay;

            if (maximumPrecipitation < rainfallPerDay) {
                maximumPrecipitation = rainfallPerDay;
            }

        }
        System.out.println();
        System.out.println("Количество дней = " + amountDays);
        System.out.println("Всего выпало " + precipitationAmount + " осадков.");
        averageRainfall(amountDays, precipitationAmount);
        maximumPrecipitation(maximumPrecipitation);

    }

    public static void averageRainfall(int amountDays, int precipitationAmount) {

        int averageRainfall = precipitationAmount / amountDays;
        System.out.println("Среднее количество выпавших осадков за " + amountDays + " дней(я) = " + averageRainfall);

    }

    public static void maximumPrecipitation(int maximumPrecipitation) {

        System.out.println("Максимальное количество осадков = " + maximumPrecipitation);

    }


}

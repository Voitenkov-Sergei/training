package com.voitenkovsergei.level1.lesson6.task3;

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

        int amountDays = entryConsole();
        int sumPrecipitation = outputAmountDays(amountDays);
        double averageRainfall = averageRainfall(sumPrecipitation, amountDays);

        System.out.println("Количество дней = " + amountDays + '\n'
                + "Сумму осадков за этот период = " + sumPrecipitation + '\n'
                + "Среднее количество осадков за этот период = " + averageRainfall);
    }

    public static int entryConsole() {
        @SuppressWarnings("resource")
        Scanner scanner = new Scanner(System.in);

        while (!scanner.hasNextInt()) {
            scanner.nextLine();
        }

        return scanner.nextInt();
    }

    public static int outputAmountDays(int amountDays) {
        int sumPrecipitation = 0;
        int maximumPrecipitation = 0;

        for (int i = 0; i < amountDays; i++) {
            int rainfallPerDay = entryConsole();
            sumPrecipitation += rainfallPerDay;

            if (rainfallPerDay > maximumPrecipitation) {
                maximumPrecipitation = rainfallPerDay;
            }
        }

        maximumPrecipitation(maximumPrecipitation);

        return sumPrecipitation;
    }

    public static double averageRainfall(int precipitationAmount, int amountDays) {
        return (double) precipitationAmount / amountDays;
    }

    public static void maximumPrecipitation(int maximumPrecipitation) {
        System.out.println("Максимальное количество осадков = " + maximumPrecipitation);
    }
}
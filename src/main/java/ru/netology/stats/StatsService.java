package ru.netology.stats;

import java.util.Arrays;

public class StatsService {

    public long calculateSum(long[] purchases) {
        long sum = 0;
        for (long purchase : purchases) {
            // аналог sum = sum + purchase;
            sum += purchase;
        }
        return sum;
    }

    public long calculateAverageSum(long[] purchases) {
        int sum = 0;
        for (long purchase : purchases) {
            sum += purchase;
        }
        long averageSum = sum / 12;

        return averageSum;
    }

    public long  monthWithMaxSales(long[] purchases) {
        int month = 0;
        int number = 1;
        long maxValue = purchases[0];
        for (long purchase : purchases) {
            month = month + 1;
            if (purchase >= maxValue) {
                maxValue = purchase;
                number = month;
                }
        }
        return number;
    }

    public long  monthWithMinSales(long[] purchases) {
        int month = 0;
        int number = 1;
        long minValue = purchases[0];
        for (long purchase : purchases) {
            month = month + 1;
            if (purchase <= minValue) {
                minValue = purchase;
                number = month;
            }
        }
        return number;
    }

    public long  amountMonthsBelowAverageSales(long[] purchases) {
        long averageSales = calculateAverageSum(purchases);
        long amountMonths = 0;
        for (long purchase : purchases) {
            if (purchase < averageSales) {
                amountMonths = amountMonths + 1;
            }
        }
        return amountMonths;
    }
    public long  amountMonthsAboveAverageSales(long[] purchases) {
        long averageSales = calculateAverageSum(purchases);
        long amountMonths = 0;
        for (long purchase : purchases) {
            if (purchase > averageSales) {
                amountMonths = amountMonths + 1;
            }
        }
        return amountMonths;
    }



    }








package ru.netology.stats;

public class StatsService {
    public int calculateTotalSales(long[] sales) {
        int totalSales = 0;

        for (long sale : sales) {
            totalSales += sale;
        }

        return totalSales;
    }

    public double calculateAverageSales(long[] sales) {
        double averageSales = calculateTotalSales(sales) / (double) sales.length;

        return averageSales;
    }

    public int findMaxSalesMonth(long[] sales) {
        int maxMonth = 0;

        for (int i = 1; i < sales.length; i++) {
            if (sales[i] >= sales[maxMonth]) {
                maxMonth = i;
            }
        }

        return maxMonth + 1;
    }

    public int findMinSalesMonth(long[] sales) {
        int minMonth = 0;

        for (int i = 1; i < sales.length; i++) {
            if (sales[i] <= sales[minMonth]) {
                minMonth = i;
            }
        }

        for (int i = sales.length - 1; i >= 0; i--) {
            if (sales[i] == sales[minMonth]) {
                minMonth = i;
            }
        }

        return minMonth + 1;
    }

    public int calculateBelowAverageMonths(long[] sales) {
        double averageSales = calculateAverageSales(sales);
        int belowAverageMonths = 0;

        for (long sale : sales) {
            if (sale < averageSales) {
                belowAverageMonths++;
            }
        }

        return belowAverageMonths;
    }

    public int calculateAboveAverageMonths(long[] sales) {
        double averageSales = calculateAverageSales(sales);
        int aboveAverageMonths = 0;

        for (long sale : sales) {
            if (sale >= averageSales) {
                aboveAverageMonths++;
            }
        }

        return aboveAverageMonths;
    }
}
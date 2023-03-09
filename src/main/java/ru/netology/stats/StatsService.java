package ru.netology.stats;

public class StatsService {

    public double getSalesAmount(double[] sales) {

        double salesAmount = 0;

        for (double monthlySales : sales) {
            salesAmount = monthlySales + salesAmount;
        }
        return salesAmount;
    }

    public double getAverageSales(double[] sales) {

        return getSalesAmount(sales) / sales.length;
    }

    public int maxSales(double[] sales) {

        int maxMonth = 0;

        for (int month = 0; month < sales.length; month++) {
            if (sales[month] >= sales[maxMonth]) {
                maxMonth = month;
            }
        }

        return maxMonth + 1;
    }

    public int minSales(double[] sales) {

        int minMonth = 0;

        for (int month = 0; month < sales.length; month++) {
            if (sales[month] <= sales[minMonth]) {
                minMonth = month;
            }
        }

        return minMonth + 1;
    }

    public int salesBelowAverage(double[] sales) {

        int countMonth = 0;

        for (double count : sales) {
            if (count < getAverageSales(sales)) {
                countMonth++;
            }
        }

        return countMonth;
    }

    public int salesAboveAverage(double[] sales) {

        int countMonth = 0;

        for (double count : sales) {
            if (count >= getAverageSales(sales)) {
                countMonth++;
            }
        }

        return countMonth;
    }
}

package ru.netology.stats;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StatsServiceTest {

    @Test

    public void shouldShowSalesAmount() {
        StatsService service = new StatsService();

        double[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        double expected = 180;
        double actual = service.getSalesAmount(sales);

        Assertions.assertEquals(expected, actual);
    }

    @Test

    public void shouldShowAverageSales() {
        StatsService service = new StatsService();

        double[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        double expected = 15;
        double actual = service.getAverageSales(sales);

        Assertions.assertEquals(expected, actual);
    }

    @Test

    public void shouldFindMonthWithMaxSales() {
        StatsService service = new StatsService();

        double[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 8;
        int actual = service.maxSales(sales);

        Assertions.assertEquals(expected, actual);
    }

    @Test

    public void shouldFindMonthWithMinSales() {
        StatsService service = new StatsService();

        double[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 9;
        int actual = service.minSales(sales);

        Assertions.assertEquals(expected, actual);
    }

    @Test

    public void shouldFindMonthsWhereSalesBelowAverage() {
        StatsService service = new StatsService();

        double[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 5;
        int actual = service.salesBelowAverage(sales);

        Assertions.assertEquals(expected, actual);
    }

    @Test

    public void shouldFindMonthsWhereSalesAboveAverage() {
        StatsService service = new StatsService();

        double[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 7;
        int actual = service.salesAboveAverage(sales);

        Assertions.assertEquals(expected, actual);
    }
}

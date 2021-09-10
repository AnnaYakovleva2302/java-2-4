package ru.netology.stats;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class StatsServiceTest {
    @Test
    void shouldCalculateSumOfSales() {
        StatsService service = new StatsService();
        long[] sales = { 8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18 };
        long actual = service.sumOfSales(sales);
        long expected = 180;
        assertEquals(expected, actual);
    }

    @Test
    void shouldCalculateAverageSale() {
        StatsService service = new StatsService();
        long[] sales = { 8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18 };
        long actual = service.averageSale(sales);
        long expected = 15;
        assertEquals(expected, actual);
    }

    @Test
    void shouldCalculateMaxSalesMonth() {
        StatsService service = new StatsService();
        long[] sales = { 8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18 };
        long actual = service.maxSalesMonth(sales);
        long expected = 8;
        assertEquals(expected, actual);
    }

    @Test
    void shouldCalculateMinSalesMonth() {
        StatsService service = new StatsService();
        long[] sales = { 8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18 };
        long actual = service.minSalesMonth(sales);
        long expected = 9;
        assertEquals(expected, actual);
    }

    @Test
    void shouldCalculateMonthsLowerAverageSale() {
        StatsService service = new StatsService();
        long[] sales = { 8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18 };
        long actual = service.monthsLowerAverageSale(sales);
        long expected = 5;
        assertEquals(expected, actual);
    }

    @Test
    void shouldCalculateMonthsHigherAverageSale() {
        StatsService service = new StatsService();
        long[] sales = { 8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18 };
        long actual = service.monthsHigherAverageSale(sales);
        long expected = 5;
        assertEquals(expected, actual);
    }
}

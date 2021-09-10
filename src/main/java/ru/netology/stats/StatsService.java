package ru.netology.stats;

public class StatsService {
    public long sumOfSales(long[] sales) {
        long sum = 0;
        for (long sale : sales) {
            sum = sum + sale;
        }
        return sum;
    }

    public long averageSale(long[] sales) {
        return this.sumOfSales(sales) / sales.length;
    }

    public int maxSalesMonth(long[] sales) {
        int maxMonth = 0;
        int month = 0;
        for (long sale : sales) {
            if (sale >= sales[maxMonth]) {
                maxMonth = month;
            }
            month = month + 1;
        }
        return maxMonth + 1;
    }

    public int minSalesMonth(long[] sales) {
        int minMonth = 0;
        int month = 0;
        for (long sale : sales) {
            if (sale <= sales[minMonth]) {
                minMonth = month;
            }
            month = month + 1;
        }
        return minMonth + 1;
    }

    public int monthsLowerAverageSale(long[] sales) {
        int count = 0;
        long average = this.averageSale(sales);
        for (long sale : sales) {
            if (sale < average) {
                count = count + 1;
            }
        }
        return count;
    }

    public int monthsHigherAverageSale(long[] sales) {
        int count = 0;
        long average = this.averageSale(sales);
        for (long sale : sales) {
            if (sale > average) {
                count = count + 1;
            }
        }
        return count;
    }
}

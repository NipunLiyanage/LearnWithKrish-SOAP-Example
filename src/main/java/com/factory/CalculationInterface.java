package com.factory;

public interface CalculationInterface {
    int calc(int year, int month, int day);

    default boolean leapYear(int year) {

        boolean leap = false;

        if (year % 4 == 0) {

            // if the year is century
            if (year % 100 == 0) {

                // if year is divided by 400
                // then it is a leap year
                if (year % 400 == 0)
                    leap = true;
                else
                    leap = false;
            }

            // if the year is not century
            else
                leap = true;
        } else
            leap = false;

        return leap;
    }

    default int date(int month, int day) {

        switch (month) {
            case 1:
                return day;

            case 2:
                return 31 + day;

            case 3:
                return 31 + 28 + day;

            case 4:
                return 31 + 28 + 31 + day;

            case 5:
                return 31 + 28 + 31 + 30 + day;

            case 6:
                return 31 + 28 + 31 + 30 + 31 + day;
            case 7:
                return 31 + 28 + 31 + 30 + 31 + 30 + day;
            case 8:
                return 31 + 28 + 31 + 30 + 31 + 30 + 31 + day;
            case 9:
                return 31 + 28 + 31 + 30 + 31 + 30 + 31 + 31 + day;
            case 10:
                return 31 + 28 + 31 + 30 + 31 + 30 + 31 + 31 + 30 + day;
            case 11:
                return 31 + 28 + 31 + 30 + 31 + 30 + 31 + 31 + 30 + 31 + day;
            case 12:
                return 31 + 28 + 31 + 30 + 31 + 30 + 31 + 31 + 30 + 31 + 30 + day;

        }

        return 0;
    }

    default int leapdate(int month, int day) {

        switch (month) {
            case 1:
                return day;

            case 2:
                return 31 + day;

            case 3:
                return 31 + 29 + day;

            case 4:
                return 31 + 29 + 31 + day;

            case 5:
                return 31 + 29 + 31 + 30 + day;

            case 6:
                return 31 + 29 + 31 + 30 + 31 + day;
            case 7:
                return 31 + 29 + 31 + 30 + 31 + 30 + day;
            case 8:
                return 31 + 29 + 31 + 30 + 31 + 30 + 31 + day;
            case 9:
                return 31 + 29 + 31 + 30 + 31 + 30 + 31 + 31 + day;
            case 10:
                return 31 + 29 + 31 + 30 + 31 + 30 + 31 + 31 + 30 + day;
            case 11:
                return 31 + 29 + 31 + 30 + 31 + 30 + 31 + 31 + 30 + 31 + day;
            case 12:
                return 31 + 29 + 31 + 30 + 31 + 30 + 31 + 31 + 30 + 31 + 30 + day;

        }

        return 0;
    }
}

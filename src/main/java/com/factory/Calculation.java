package com.factory;

public class Calculation implements CalculationInterface {


    @Override
    public int calc(int year, int month, int day) {


        boolean isleap = leapYear(year);

        int date;

        if (isleap == true) {
            date = leapdate(month, day);
        } else {
            date = date(month, day);
        }

        return date;

    }


}




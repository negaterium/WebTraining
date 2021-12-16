package com.company;

import java.util.List;

public class Calculator {

    public float divisionTwoNumbers(int a, int b) {
        if (a != 0 & b != 0)
            return (a / b);
        else {
            System.out.println("Check division by zero!");
            return 0;
        }
    }

    public int sumTwoNumbers(int a, int b) {
        return (a + b);
    }

    public int substractTwoNumbers(int a, int b) {
        return (a - b);
    }

    public int multiplyTwoNumbers(int a, int b) {
        return (a * b);
    }

    public float aritmedThreeNumbers(int a, int b, int c) {
        return (((a + b + c) / 3));
    }

    public int moduloNumber(int a, int b) {
        return (a % b);
    }

    public float convertFahrenheit(int temp) {
        return Math.round((5 / 9f) * (temp - 32));
    }

    public double convertInchToMeters(double inch) {
        return ((inch * 2.5) / 100);
    }

    public void convertMetersTime(int meters, int timehour, int timeminute, int timesecond) {
        int km, miles;
        float calchours, speedkm, speedmiles;
        km = meters / 1000;
        miles = meters / 1609;
        calchours = timehour + timeminute / 60 + timesecond / 3600;
        System.out.println("Final hours:" + calchours);
        speedkm = km / calchours;
        speedmiles = miles / calchours;
        System.out.println("Speed in KM/h: " + speedkm);
        System.out.println("Speed in Miles/h: " + speedmiles);
    }

    public float averageNumbers(int min, int max) {
        float sum = 0, med = 0;
        for (int i = min; i <= max; i++)
            sum += i;
        med = sum / (max - min + 1);
        return med;
    }

    public int computeSumList() {
        ReadFromKeyboard rFK = new ReadFromKeyboard();
        int sum = 0;
        List<Integer> myList = rFK.getList();
        for (int i : myList)
             sum = sumTwoNumbers(sum,i);

        return sum;
    }


}

package com.company;

public class Calculator {

    public void divisionTwoNumbers(int a, int b)
    {
        if (a!=0 & b!=0)
            System.out.println(a/b);
        else
            System.out.println("Check division by zero!");
    }

    public void sumTwoNumbers(int a, int b)
    {
        System.out.println(a+b);
    }

    public void substractTwoNumbers(int a, int b)
    {
        System.out.println(a-b);
    }

    public void multiplyTwoNumbers(int a, int b)
    {
        System.out.println(a*b);
    }
}

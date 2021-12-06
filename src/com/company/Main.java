package com.company;

public class Main {

    public static void main(String[] args) {

        Misc miscMethod = new Misc();
        Calculator calculatorMethod = new Calculator();
        OperatiiLogice operatiiLogice = new OperatiiLogice();
        // Homework - Introducere to Java
        // H1.P1
        System.out.println("H1.P1");
        System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
        miscMethod.simplePrint();
        System.out.println("------------------------------");
        System.out.println();

        // H1.P2
        System.out.println("H1.P2");
        System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
        System.out.print("Suma a 2 numere este: ");
        calculatorMethod.sumTwoNumbers(10, 3);
        System.out.println("------------------------------");
        System.out.println();

        // H1.P3
        System.out.println("H1.P3");
        System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
        System.out.print("Impartirea a 2 numere este: ");
        calculatorMethod.divisionTwoNumbers(10, 3);
        System.out.println("------------------------------");
        System.out.println();

        // H1.P4
        System.out.println("H1.P4");
        System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
        System.out.println("Operatii multiple: ");
        calculatorMethod.sumTwoNumbers(-5, 8*6);
        System.out.println("Modulo: (55+9) % 9");
        System.out.println((55+9)%9);
        System.out.println("Suma: 20 + -3*5/8 = ");
        System.out.print(20+ (-3*5/8f));
        System.out.print("Another op: ");
        System.out.println(5+15f/(3*2)-8%3);
        System.out.println("------------------------------");
        System.out.println();
    }
}

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
        System.out.println(calculatorMethod.sumTwoNumbers(10, 3));
        System.out.println("------------------------------");
        System.out.println();

        // H1.P3
        System.out.println("H1.P3");
        System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
        System.out.print("Impartirea a 2 numere este: ");
        System.out.println(calculatorMethod.divisionTwoNumbers(10, 3));
        System.out.println("------------------------------");
        System.out.println();

        // H1.P4
        System.out.println("H1.P4");
        System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
        System.out.println("Operatii multiple: ");
        System.out.println(calculatorMethod.sumTwoNumbers(-5, 8*6));
        System.out.println("Modulo: (55+9) % 9");
        System.out.println((55+9)%9);
        System.out.println("Suma: 20 + -3*5/8 = ");
        System.out.print(20+ (-3*5/8f));
        System.out.print("Another op: ");
        System.out.println(5+15f/(3*2)-8%3);
        System.out.println("------------------------------");
        System.out.println();

        // H2.P4
        System.out.println("H2.P4");
        System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
        System.out.print("Media aritmetica a 3 numere este: ");
        System.out.println(calculatorMethod.aritmedThreeNumbers(10, 3, 7));
        System.out.println("------------------------------");
        System.out.println();

        // H2.P6
        System.out.println("H2.P6");
        System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
        System.out.print("Restul impartiri a doua numere este: ");
        System.out.println(calculatorMethod.moduloNumber(10, 3));
        System.out.println("------------------------------");
        System.out.println();

        // H2.P7
        System.out.println("H2.P7");
        System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
        System.out.print("Conversie C to F: ");
        System.out.println(calculatorMethod.convertFahrenheit(100));
        System.out.println("------------------------------");
        System.out.println();

        // H2.P8
        System.out.println("H2.P8");
        System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
        System.out.print("Conversie inch to meters: ");
        System.out.println(calculatorMethod.convertInchToMeters(100));
        System.out.println("------------------------------");
        System.out.println();

        // H2.P9
        System.out.println("H2.P9");
        System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
        System.out.println("Speed calculation");
        calculatorMethod.convertMetersTime(60000, 1, 0, 0);
        System.out.println("------------------------------");
        System.out.println();

        // H3.P4
        System.out.println("H3.P4");
        System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
        System.out.println("String comparison");
        operatiiLogice.compareString("Test");
        System.out.println("------------------------------");
        System.out.println();

        // H3.P5
        System.out.println("H3.P5");
        System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
        System.out.println("String and number comparison");
        System.out.println(operatiiLogice.compareStringInt("Evozon", 2));
        System.out.println("------------------------------");
        System.out.println();

        // H3.P9
        System.out.println("H3.P9");
        System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
        System.out.println("Is number even");
        System.out.println(operatiiLogice.isEven(2));
        System.out.println("------------------------------");
        System.out.println();

        // H3.P10
        System.out.println("H3.P10");
        System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
        System.out.println("Has the right to vote?");
        System.out.println(operatiiLogice.rightToVote(22));
        System.out.println("------------------------------");
        System.out.println();

        // H3.P11
        System.out.println("H3.P11");
        System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
        System.out.println("Bigger number");
        System.out.println(operatiiLogice.biggerOfThree(22, 23, 1));
        System.out.println("------------------------------");
        System.out.println();

    }
}

package com.company;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        Misc miscMethod = new Misc();
        Calculator calculatorMethod = new Calculator();
        OperatiiLogice operatiiLogice = new OperatiiLogice();
        ArrayListsOps arrOp = new ArrayListsOps();
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
        System.out.println(calculatorMethod.sumTwoNumbers(-5, 8 * 6));
        System.out.println("Modulo: (55+9) % 9");
        System.out.println((55 + 9) % 9);
        System.out.println("Suma: 20 + -3*5/8 = ");
        System.out.print(20 + (-3 * 5 / 8f));
        System.out.print("Another op: ");
        System.out.println(5 + 15f / (3 * 2) - 8 % 3);
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

        // H3.P8
        System.out.println("H3.P8");
        System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
        System.out.println("Switch check");
        operatiiLogice.printSwitchCase(2);
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

//        -----------------------------

        miscMethod.countDown(10, 1);
        System.out.println(calculatorMethod.averageNumbers(1, 100));
        miscMethod.printPattern1(10);
        System.out.println(miscMethod.averageWhile(1, 100));
        miscMethod.fibo(22);

        int[] myNewArray = {1, 2, 3, 4};
        System.out.println(miscMethod.averageArray(myNewArray));
        String[] myStringArray = {"test", "bau", "miau"};

        List<Integer> myList = new ArrayList<>();
        myList.add(1);
        myList.add(2);
        myList.add(3);
        myList.add(10);
        miscMethod.dispListFromNumber(myList, 2);
        System.out.println("Max din lista este: " + miscMethod.returnMaxInList(myList));
        System.out.println("Lista cu numere pare este: " + miscMethod.returnEvenList(myList));


        // H4.P9
        System.out.println("H4.P8");
        System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
        System.out.println("Creati o metoda care sa primeasca un array, si sa returneze al doilea cel mai mic numar din array. Apelati metoda in main() pentru a verifica daca functioneaza.");
        int[] myIntArray = {10, 3, 4, 11, 7, 2};
        System.out.println(miscMethod.returnSecondLowestInArray(myIntArray));
        System.out.println("------------------------------");
        System.out.println();

        // H4.P8
        System.out.println("H4.P8");
        System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
        System.out.println("Creati o metoda care sa primeasca un parametru de tip array de numere, populat cu valori, si un parametru de tip numar. Metoda sa verifice daca numarul exista in array, si daca da, sa returneze array-ul primit, fara acel numar. Apelati metoda in main() pentru a verifica daca functioneaza.");
        int[] tIntArray = {1, 2, 3, 4, 5};
        arrOp.printArray(arrOp.removeNumberInArray(tIntArray,3));
        System.out.println("------------------------------");
        System.out.println();

//        LISTS
        /*


        Scrieti o metoda Java, care sa primeasca trei parametrii: unul de tip Lista de String-uri, unul de tip intreg, si unul de tip String.
            Metoda sa adauge parametrul de tip String in lista primita, iar parametrul de tip intreg reprezinta pozitia la care sa fie pus acel String.
        Scrieti o metoda Java, care sa primeasca doi parametrii. Primul dintre ei va fi o Lista, iar metoda sa ia al doilea parametru si sa il adauge pe prima pozitie din lista.
        Scrieti o metoda Java care sa primeasca parametru o Lista, si sa afiseze ce valori are lista, si ce pe ce pozitie. (Ex: “Pe pozitia 1 valoare este 4”).
        Scrieti o metoda Java care sa primeasca o Lista si sa returneze cel mai mare numar din ea.
*/

//      Scrieti o metoda Java, care sa primeasca parametru o Lista, si sa afiseze, pe rand, toate valorile din lista, fiecare pe rand nou.
        // H5.P1
        System.out.println("H5.P1");
        System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
        System.out.println("Print a list");
        arrOp.printIntList(myList);
        System.out.println("------------------------------");
        System.out.println();

//      Scrieti o metoda Java, care sa primeasca doi parametrii: un parametru sa fie o lista de numere, si celalalt un numar (real sau intreg).
//              Metoda sa adauge numarul primit ca si parametru la final de lista.
        // H5.P2
        System.out.println("H5.P2");
        System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
        System.out.println("Print a list with an added number");
        arrOp.printIntList(arrOp.addNumberToList(myList, 111));
        System.out.println("------------------------------");
        System.out.println();

//        Scrieti o metoda Java, care sa primeasca doi parametrii: un parametru de tip Lista, iar celalalt un numar intreg.
//        Sa se parcurga lista si sa afiseze, pe rand, toate valorile din lista, fiecare pe rand nou, pornind de la numarul intreg primit ca si parametru.

        // H5.P3
        System.out.println("H5.P3");
        System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
        System.out.println("Print a list starting from the added number");
        arrOp.printListFromANumber(myList, 3);
        System.out.println("------------------------------");
        System.out.println();

//        Scrieti o metoda Java, care sa primeasca parametru o Lista, si sa afiseze, pe rand, toate valorile din lista, dar invers(de la capat la inceput).
        // H5.P4
        System.out.println("H5.P4");
        System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
        System.out.println("Print a list backwards");
        arrOp.printIntList(arrOp.returnListBackwards(myList));
        System.out.println("------------------------------");
        System.out.println();

    }
}

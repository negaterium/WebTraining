package com.company;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class ReadFromKeyboard {

    public int getInt() {
        Scanner scanner = new Scanner(System.in);
        boolean cond = false;
        int x = 0;
        do {
            try {
                x = scanner.nextInt();
                cond = true;
            } catch (InputMismatchException e) {
                System.out.println("Val " + scanner.nextLine() + " is not correct!");
                System.err.println("Incorrect value ->" + e);
            }
        } while (!cond);
        return x;
    }

    public int[] getIntArray() {
        System.out.print("Length of the array: ");
        int len = getInt();
        int[] myArray = new int[getInt()];
        System.out.println();
        for(int i = 0; i< myArray.length;i++)
        {
            myArray[i] = getInt();
        }
        return myArray;
    }

    public List<Integer> getList()
    {
        List<Integer> myList = new ArrayList<>();
        Scanner scan = new Scanner(System.in);

        do{
            try{
                int value = scan.nextInt();
                myList.add(value);
            }catch (InputMismatchException e){
                System.err.println("Incorrect value ->" + e);
            }


        }while(true);

    }

}

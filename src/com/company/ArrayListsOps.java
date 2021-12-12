package com.company;

import java.util.ArrayList;
import java.util.List;

public class ArrayListsOps {
    public int[] removeNumberInArray(int[] myIntArray, int numberCheck)
    {
        int counter=0;
        int[] tempArray = new int[myIntArray.length-1];
        for(int i:myIntArray) {
            if (i != numberCheck) {
                tempArray[counter] = i;
                counter++;
            }
        }

        return tempArray;

    }

    public void printArray(int[] myArray)
    {
        for(int i:myArray)
            System.out.print(i + " ");
        System.out.println();
    }

    public void printIntList(List<Integer> myList)
    {
        for (int i:myList)
        {
            System.out.print(" " + i);
        }
        System.out.println();
    }

    public List<Integer> addNumberToList(List<Integer> myList, int myNumber )
    {
        myList.add(myNumber);
        return myList;
    }

    public void printListFromANumber(List<Integer> myList, int myNumber )
    {
        boolean ind=false;
        for(int i:myList)
        {
            if(i == myNumber)
                ind = true;
            if(ind)
                System.out.println(i);
        }
    }

    public List<Integer> returnListBackwards(List<Integer> myList)
    {
        List<Integer> tempList= new ArrayList<>();
        for(int i:myList)
            tempList.add(0,i);
        return tempList;
    }
}

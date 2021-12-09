package com.company;

import java.util.ArrayList;
import java.util.List;

public class Misc {

    public void simplePrint()
    {
        System.out.println("Hello");
        System.out.println("Lucian");
    }

    public void countDown(int max, int min)
    {
        if(max<min) return;
        for(int i=max;i>=min;i--)
        {
            System.out.println(i);
        }
    }

    public void printPattern1(int stars)
    {
        for(int i=stars;i>0;i--) {
            for (int j = i; j >0; j--) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public float averageWhile(int min, int max)
    {
        int i=min,sum=0;
        while(i<=max)
        {
            sum+=i;
            i++;
        }
        return (float) sum/(max-min+1);
    }

    public void fibo(double howMany)
    {
        double n1=0, n2=1, k=1, num=0, newline=1;

        while(k<=howMany)
        {

            while (newline<=11) {
                num = n1 + n2;
                System.out.print(num + " ");
                n1 = n2;
                n2 = num;
                k = k + 1;
                newline++;
            }
            System.out.println();
            newline=1;
        }

    }

    public void CLW(int howMany)
    {
        int i=1, j=1;
        while(i<=110)
        {
            while (j<=11)
            {
                if ((i % 3) ==0 )
                    System.out.print(" Coza ");
                else if ((i % 5) ==0 )
                    System.out.print(" Loza ");
                else if ((i % 7) ==0 )
                    System.out.print(" Woza ");
                else if ((i % 3 ==0) & (i % 5 ==0))
                    System.out.print(" CozaLoza ");
                else if ((i % 3 ==0) & (i % 7 ==0))
                    System.out.print(" CozaWoza ");
                else if ((i % 5 ==0) & (i % 7 ==0))
                    System.out.print(" WozaWoza ");
                else if ((i % 3 ==0) & (i % 7 ==0) & (i % 5 ==0))
                    System.out.print(" CozaLozaWoza ");
                else
                    System.out.print(i + " ");

                i++;
                j++;
            }
            System.out.println();
            j=1;
        }

    }

    public float averageArray(int[] myArray)
    {
        float sum=0, average;
        for(int i:myArray)
        {
            sum+=i;
        }
        return (sum/myArray.length);
    }

    public boolean checkStringinArray(String[] myStringArray, String myString)
    {
        for(String i:myStringArray)
        {
            if (i.contains(myString))
                return true;
        }
        return false;
    }

    public int returnSecondLowestInArray(int[] myIntArray)
    {
        int aux;
        for (int i=0;i<myIntArray.length;i++)
            for (int j=0;j<myIntArray.length-1;j++)
                if (myIntArray[j]>myIntArray[j+1])
                {
                    aux = myIntArray[j];
                    myIntArray[j] = myIntArray[j+1];
                    myIntArray[j+1] = aux;
                }
        return myIntArray[1];
    }

    public void dispListFromNumber(List<Integer> myList, int myNumber)
    {
        int ind=0;
        System.out.println("----------");
        for(int i:myList)
        {
            if (i==myNumber)
                ind = 1;
            if (ind ==1)
                System.out.println(i);
        }
    }

    public int returnMaxInList(List<Integer> myList)
    {
        int max=myList.get(0);
        for(int i:myList)
        {
            if (i>max)
                max = i;
        }
        return max;
    }

    public List<Integer> returnEvenList(List<Integer> myList)
    {
        List<Integer> newList = new ArrayList<>();
        for(int i:myList)
        {
            if (i % 2 == 0)
                newList.add(i);
        }
        return newList;
    }


}

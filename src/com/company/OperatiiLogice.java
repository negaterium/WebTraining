package com.company;

public class OperatiiLogice {

    public void compareString(String myString)
    {
        if (myString.equals("Test"))
            System.out.println("We have a test!");
        else
            System.out.println("Try again...");
    }

    public String compareStringInt(String myString, int myNumber)
    {
        if(myString.equals("Evozon") & myNumber<=3)
            return (myString+myNumber);
        else if(!myString.equals("Evozon") & myNumber>=4)
                return (myNumber+myString);
        else return ("Huh?");
    }

    public boolean isEven(int myNumber)
    {
        if( (myNumber % 1) == 1)
            return false;
        else
            return true;
    }

    public boolean rightToVote(int age)
    {
        return age > 18;
    }

    public int biggerOfThree(int a, int b, int c)
    {
        if (a>b & a>c)
            return a;
        else if (b>a & b>c)
            return b;
        else return c;
    }

}

package com.company;

import java.util.InputMismatchException;

public class Sleep {
    public static void waitFor(int seconds)
    {
        try {
            Thread.sleep(seconds*1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        } ;
    }

}

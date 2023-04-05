package com.company;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SumAndAverage {

    public static void main(String[] args) {
        int sumTotal = 0;
        int sumMean = 0;
        int meanIterator = 0;

       Scanner keyboard = new Scanner(System.in);
       System.out.println("Please enter a series of 5 numbers with spaces in between them.");
       String myNum = keyboard.nextLine();
       String[] numbers = myNum.split(" ");

       for(String yoyoyo : numbers){
           System.out.println(yoyoyo);
           sumTotal = sumTotal + Integer.parseInt(yoyoyo);
           meanIterator = numbers.length;

       }
       System.out.println("Total sum of the numbers entered: " + sumTotal);
       System.out.println("Average of the numbers entered: " + sumTotal/meanIterator);
    }
}

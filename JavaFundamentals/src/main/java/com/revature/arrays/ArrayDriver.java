package com.revature.arrays;

import java.lang.reflect.Array;
//this line imports the information about the Arrays class
import java.util.Arrays;

public class ArrayDriver {

    public static void main(String[] args) {
        int[] intArray = new int[10];

        intArray[0] = 1;

        System.out.println(Arrays.toString(intArray));

        int[] myArray = {1,2,3,4,5};

        System.out.println(Arrays.toString(myArray));


        //How would I add up all the numbers in the array?

        double balance = 0;

        double[] transactions = {1000, -119.99, 40 , -35.43, -150.65};

        //How do I find the current value of my account?
        for (int i = 0; i < transactions.length; i++){
            balance += transactions[i];
        }
        System.out.println("Balance: " + balance);

        for (int i = 0; i < transactions.length; i++){
            System.out.println(transactions[i]);
        }

        char[] shirtSize = {'s', 'l', 'm', 'x', 'l', 's'};

        int[] sizesAsNumbers = {2,3,4,2,4,5,1};

        Arrays.sort(sizesAsNumbers);

        System.out.println(Arrays.toString(sizesAsNumbers));





    }
}

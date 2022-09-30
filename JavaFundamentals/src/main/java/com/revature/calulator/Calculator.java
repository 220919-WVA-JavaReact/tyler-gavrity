package com.revature.calulator;

public class Calculator {

        //What is the goal?

        //The goal is to be able to select an operation and then collect input from the user
        //AKA two numbers that they would like to use that operation with

    //What's the game plan?
    //Use a switch case in the main method and create 4 methods, add, subtract, multiply and divide
    //Use those methods in the main to make the code more readable and easy to follow
    public static void main(String[] args) {
        //Switch case with options is going to be here
        String operation = 1;
        switch (operation) {
            case 1:
                System.out.println("Addition");
                break;
            case 2:
                System.out.println("Subtraction");
                break;
            case 3:
                System.out.println("Multiplication");
                break;
            case 4:
                System.out.println("Division");
                break;
        }


    }

    //Four methods with be here

    public static int additon(int a, int b){

    }

    public static int subtraction(int a, int b){

    }

    public static int multiplication(int a, int b){

    }

    public static int division(int a, int b){

    }
}

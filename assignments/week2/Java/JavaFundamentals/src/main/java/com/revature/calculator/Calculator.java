package com.revature.calculator;

import java.util.Scanner;

public class Calculator {

        //What is the goal?

        //The goal is to be able to select an operation and then collect input from the user
        //AKA two numbers that they would like to use that operation with

    //What's the game plan?
    //Use a switch case in the main method and create 4 methods, add, subtract, multiply and divide
    //Use those methods in the main to make the code more readable and easy to follow




    public static void main(String[] args) {

        //This enables you to use the scanner function and save the users input to a variable
        Scanner input = new Scanner(System.in);



        System.out.println("Welcome to the Calculation Station");
        System.out.println("+------------------------------------------------------+");
        System.out.println("Here at the Calculation Station you have four options");
        System.out.println("Please choose one");
        System.out.println("Addition, Subtraction, Multiplication, or Division");
        //the next set of code assigns there answer to a variable and saves it
        String operation = input.nextLine();
        System.out.println("Thank you for choosing " + operation);
        System.out.println("+------------------------------------------------------+");
        System.out.println("Please enter your first number ");
        int a = input.nextInt();
        System.out.println("Please enter your second number ");
        int b = input.nextInt();
        System.out.println("+------------------------------------------------------+");
//        System.out.println("So we are using operation " + operation + " with " + a + " and " + b + " is that correct? y/n");
//        String answer = input.nextLine();
//        if ( answer.equals("y")){
            //Switch case with options is going to be here
//        int operation = 1;
//            System.out.println("Hello");
            switch (operation) {
                case "Addition":
                    System.out.println("The answer for adding these two numbers together is " + addition(a,b));
                    break;
                case "Subtraction":
                    System.out.println("The answer for subtraction these two numbers together is " + subtraction(a,b));
                    break;
                case "Multiplication":
                    System.out.println("The answer for multiplying these two numbers together is " + multiplication(a,b));
                    break;
                case "Division":
                    System.out.println("The answer for dividing by these two numbers together is " + division(a,b));
                    break;
            }
        System.out.println("+------------------------------------------------------+");
//        } else {
//            System.out.println("Please try again");
//        }










        //Switch case with options is going to be here
//        int operation = 1;
//        switch (operation) {
//            case "Addition":
//                System.out.println("Addition");
//                break;
//            case "Subtraction":
//                System.out.println("Subtraction");
//                break;
//            case "Multiplication":
//                System.out.println("Multiplication");
//                break;
//            case "Division":
//                System.out.println("Division");
//                break;
//        }


    }

    //Four methods with be here

    public static int addition(int a, int b){
        int d = a + b;
        return d;
    }

    public static int subtraction(int a, int b){
        int d = a - b;
        return d;
    }

    public static int multiplication(int a, int b){
        int d = a * b;
        return d;
    }

    public static int division(int a, int b){
            int d = a/b;
            return d;
    }
}

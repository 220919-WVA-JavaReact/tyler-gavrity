package com.revature.strings;

import java.util.Arrays;

public class StringDriver {
    public static void main(String[] args) {
        /*
        We saw yesterday some of the various methods associated with strings: string.length()
        Today we'll talk abit more about strings, how they are stored and some of the methods
        associated with them
         */

        String text = "This is a string";

        //We mentioned that strings were objects but when created our person object
        //we had to do some funky stuff by saying "new Person(args)"

        //Strings can also be created like so

        String text2 = new String("This is also a string");

        //Let's start adding strings together and see what happens!

        String helloWorld = "Hello";

        //Let's add onto this original string

        helloWorld += " world";

        System.out.println(helloWorld);

        //Java is pass by value not pass by reference so if I tried something liek
        //Below won't work because it needs to be assigned a to the value
        //helloWorld + " I'm a person";

        addOn(helloWorld);

        System.out.println(helloWorld);

        //If I wanted the value to be updated I would have to store it in the variable itself

        helloWorld = addOn(helloWorld);

        System.out.println(helloWorld);


        String s1 = "apple";
        String s2 = "mango";
        String s3 = "apple";

        //If i want to test the equality of these i'll use the == from yesterday AKA checkin conditions

        System.out.println(s1 == s2);
        System.out.println(s1 == s3);


        //Now what happens if I create a string object with the new keyword and test the equality

        String s4 = new String("mango");

        System.out.println(s2 == s4);

        //When working with objects we see that the == operator actually checks the objects and
        //sees if they are the same object in memory, not just the explicit value but the
        //"address" of the data

        //So how can we check for equality of values?
        //What we need to call instead is the .equals() method, it comes from the object class which all classes
        //inherit from but it essentially allows us the ability to check the equality of different objects based
        //off of their value. Provides that we override

        System.out.println(s2.equals(s4));

        //This idea of using the .equals for objects is very important and we'll discuss it again later
        //when using inheritance and polymorphism

        //Lets look at some useful methods that belong to the string class before we run to lunch

        //Lets say I wanted to find a strings length

        String newString = " This is a string";
        System.out.println(newString.length());

        System.out.println(isEven(newString));

        //What happens if we want to repeat a string so many times?

        newString.repeat(2);

        System.out.println(newString.repeat(2));

        //Going to call count repeat method

        System.out.println(repeatSpace(newString, 5));

        String[] nameArray;

        nameArray = new String[4];

        nameArray[0] = "Tyler G";
        nameArray[1] = "Zach Estes";
        nameArray[2] = "Ellen Hang";
        nameArray[3] = "Victoria Konkiel";

        int[] intArray = {
                1, 2, 3, 4, 5
        };


        System.out.println(nameArray[0]);
        System.out.println(nameArray[1]);
        System.out.println(nameArray[2]);
        System.out.println(nameArray[3]);

        System.out.println(Arrays.toString(intArray));


            for (int i = 0; i < nameArray.length; i++){
                System.out.println(nameArray[i]);
            }
        for (int i = 0; i < intArray.length; i++){
            System.out.println(intArray[i]);
        }






    }

    public static String addOn(String text){
        return text + " Adding onto the end";
    }
    //Lets make a quick method to check and see if the length of a string is even
    public static boolean isEven(String text){
        //Steps here are to find the length of the string
        //Then we check if it is even

        int len = text.length();

        //Now how to check if a number is even
        //There's a couple ways we can do this but it's easiest is with the modulus operator
        if ( len % 2 == 0 ){
            return true;
        } else {
            return false;
        }
    }

    //Lets create a quick method for repeating strings with a space in the middle
    public static String repeatSpace(String text, int count){
        //I can't just return the string.repeat(count)

        //The space makes things more complicated, I could use a for loop or I could try and use repeat

        //For loop
        //First lets create a blank string object to store our info
        String newText = "";
        for(int i = 0; i < count; i++){
            newText += text;
            newText += " ";
        }
        //This isn't exactly correct since it has a space at the end but we'll see how it works
        return newText;
    }





}

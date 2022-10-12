package collections.exercises;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class ExampleArrayList {

    /*
    Below is a list of exercises to help you get familiar with working with the ExampleArrayList Collection
     */
    public static void main(String[] args) {

        // 1. Write a Java program to create a new array list, add some colors (string) and print out the collection.

        ArrayList<String> colors = new ArrayList<String>();

        colors.add("Blue");
        colors.add("Red");
        colors.add("Purple");
        colors.add("Yellow");



        // 2. Write a Java program to iterate through all elements in an array list

        for(String color : colors){
            System.out.println(color);
        }

        // 3. Write a Java program to insert an element into the array list at the first position
        colors.set(0, "Burgundy");
        colors.set(1, "Blue");
        //System.out.println(colors.get());
        //How does get work?
        colors.get(0);
        System.out.println(colors);
        System.out.println(colors.get(0));


        // 4. Write a Java program to retrieve an element (at a specified index) from a given array list
        System.out.println(colors.get(3));


        // 5. Write a Java program to remove the third element from an array list.
        colors.remove(3);
        System.out.println(colors);


        // 6. Write a Java program to search an element in an array list.
        for(String Burgundy : colors){
            if(Burgundy.equals("Burgundy")){
                System.out.println("True");
                break;
            } else {
                System.out.println("False");
                break;
            }
        }


        // 7. Write a Java program to sort a given array list.
        ArrayList<Integer> nums = new ArrayList<Integer>();
        nums.add(2);
        nums.add(1);
        nums.add(7);
        nums.add(3);
        nums.add(5);
        nums.add(4);
        nums.add(6);
        System.out.println(nums);

        Collections.sort(nums);
        System.out.println(nums);



    }
}
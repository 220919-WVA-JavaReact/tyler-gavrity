package com.revature.classes_objects;

//The first uncommented line of these java files should be the package name
//Packages provide useful namespaces for us to declare similar classes with the correct name


public class Person {
    /*
    This is a multiline comment

    We talked about classes and objects yesterday and said classes are blueprints for objects, what does that mean?


    We can create classes as blueprints with all the necessary information we expect every subject from that to get

    Firs thing I'll create are fields which are similar to properties of the object, We create these just like
       regular variables from yesterday only we don't necessarily have to give them a value.

       Fields we might want for a person class
       Name ---> String
       Height ---> double
       Weight ---> double
       Age ---> Integer


       We'll declare these fields or properties at the class level outside of any method
       */


        String name;
        double height;
        double weight;
        int age;

        /*
        So now everytime I create a person object they should have all of these properties associated with
        them and depending on how the variable is accessible I should be able to call the value by saying
        something like personObject.field

         */


        //I'm going to create a constructor for this class
        //Constructors are basically special methods with the same name as the class itself and provides
        //a simple way to set the state of the object upon creation (instantiation)


        public Person(String name, double height, double weight, int age){
            this.name = name;
            this.height = height;
            this.weight = weight;
            this.age = age;
        }

        /*
        Before we go too far I'm going to add onto our constructor notes from before by creating additional
        constructors with varying amounts of arguments. Before we created an all args constructor but what
        if I just wanted like an average person or only wanted to set some of the values
         */

        //No-arg constuctor
    public Person(){
        this.name = "James";
        this.height = 67;
        this.weight = 100;
        this.age = 34;
    }

    //1 Arg constructor
    public Person(String name){
        this.name = "kyle";
        this.height = 67;
        this.weight = 100;
        this.age = 34;
    }

        /*
        Let's add in some methods

        If we remember, methods are like a reuable chunk of code and they generally represent what an
        object can DO

        Like what are things people can do?
        Walk
        Talk
         */


        public void walk(int distance){
            System.out.println(this.name + "walked a distance of " + distance + " feet");
        }

        //Well create a method for talking so someone can introduce themselves

    public String talk(){
        return "Hi, my name is " + this.name;
    }



}

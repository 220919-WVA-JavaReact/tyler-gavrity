package com.revature.classes_objects;

public class PersonDriver {

    /*
    I'm going to use the main method in this PersonDriver class to call upon my person class and create person
    objects.
     */
    public static void main(String[] args) {
    //Any logic you write here will be the logic cdone when we run the progress

        //Declare a primitive value
        int num = 9;

        //Declaring an object is slightly different
        Person bryan = new Person("Bryan", 71.75, 250.5, 25);
        //objects need to be called with the variable
        //you can call regular variables, no specifics needed
        System.out.println(bryan.height);

        System.out.println(bryan.name);

        Person caitlin = new Person("Caitlin", 68.5, 135, 24);

        System.out.println(caitlin.name);
        System.out.println(caitlin.weight);

        //References walk method in person
        bryan.walk(5);

        caitlin.talk();
        System.out.println(caitlin.talk());

        Person jimmy = new Person();
        System.out.println(jimmy.weight);
        Person kyle = new Person("Kyle");
        System.out.println(kyle.weight);
        System.out.println(jimmy.name);
        System.out.println(kyle.name);


        //We can assign the variables given in this case
        jimmy.name = "Jimmy";

        System.out.println(jimmy.name);



    }
}

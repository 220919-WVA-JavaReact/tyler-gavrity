package com.revature;

import com.revature.courses.models.Teacher;
import com.revature.courses.service.CourseService;
import com.revature.courses.service.TeacherService;

import java.util.Scanner;

public class App {

    // Inside my App class is all the information and logic to start and run the application
    // Menu logic should be here and this should call upon the SERVICE layer to do any logic for us

    // Very similarly to our service layer, when we want logic done we will need an instance of our service layer so
    // create it here

    public static TeacherService ts = new TeacherService();

    public static CourseService cs = new CourseService();

    public static void main(String[] args) {
        // In this app this will be the ONLY main method I have

        // So let's create a teacher object and print it

//        Teacher teach = new Teacher(1, "Bryan", "Serfozo", "bserf", "password");
//
//        Teacher teach1 = new Teacher(1, "Bryan", "Serfozo", "bserf", "password");
//
//        String teacher = teach.toString();
//
//        System.out.println(teacher);
//
//        System.out.println(teach == teach1);
//
//        System.out.println(teach.equals(teach1));



        /*
        Coming down here we can actually start the application with some sort of menu and loop
         */

        // We'll want to prompt the user to either login or to register

        System.out.println("Press 1 to Login. Press 2 to register");

        Scanner sc = new Scanner(System.in);

        String choice = sc.nextLine();

        // We need a variable to store out teacher
        Teacher loggedInTeacher = null;

        // Now we use some control flow to map option to their choices

        if (choice.equals("1")){
            // This is where we get login credentials

            // We need to get the username and password
//            System.out.println("Please enter your username");
//            String username = sc.nextLine();
//            System.out.println("Please enter your password");
//            String password = sc.nextLine();
//
//            // Just for testing let's print it out
//            //System.out.println("Username: " + username + ", Password: " + password);
//
//            // AT THIS POINT we would call out TeacherService Class to handle the logic for signing in!
//
//            ts.login(username, password);

            // I'm going to commit out everything above this and just handle it in my service class
            loggedInTeacher = ts.login();

        } else if (choice.equals("2")){
            // This is where we get registration information
//            System.out.println("Please enter your First Name");
//            String first = sc.nextLine();
//            System.out.println("Please enter your Last Name");
//            String last = sc.nextLine();
//            System.out.println("Please enter your username");
//            String username = sc.nextLine();
//            System.out.println("Please enter your password");
//            String password = sc.nextLine();


            // Now that we have all the information we need we can start talking to our TeacherService class to handle this info

            // Commenting out everything above and moving it to TeacherService Class
            loggedInTeacher = ts.register();
        }


        // Since I'm storing this info maybe I will check that a user is logged in before the see the course menu

        if (loggedInTeacher != null){

            System.out.println("Press 1 to create a course, 2 to enroll to teach a course, 3 to view all courses, or 4 to view your courses");

            String subchoice = sc.nextLine();

            switch (subchoice){
                case "1":
                    cs.createCourse();
                    break;
                case "2":
                    cs.assignCourse(loggedInTeacher.getTeacherId());
                    break;

                default:
                    System.out.println("invalid input");
            }
        }
    }
}
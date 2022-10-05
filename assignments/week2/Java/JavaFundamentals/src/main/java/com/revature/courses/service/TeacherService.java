package com.revature.courses.service;

import com.revature.courses.dao.TeacherDAO;
import com.revature.courses.dao.TeacherDAOImpl;
import com.revature.courses.models.Teacher;

import java.util.Scanner;

public class TeacherService {

    // So the role of this class is to provide the logic for options and eventually call upon the DAO to persist the
    // information we request

    // We have logic for logging in and registering so we should have methods to handle that

    // Whenever we want to make a call to the database we need to provide a TeacherDao implemementation so I'll create
    // one at the class level
    TeacherDAO td = new TeacherDAOImpl(); // <--- Can change the implementation whenever I want

    // Need to add in a Scanner to update the method
    Scanner sc = new Scanner(System.in);

    // This method is being updated to add in the menu logic in here as well
    public Teacher login(){
        // The object of this method is to call upon the DAO to get the account associated with our username, then
        // We'll verify the password and "log" the user in

        // Step 0. Take in user info
        System.out.println("Please enter your username");
        String username = sc.nextLine();
        System.out.println("Please enter your password");
        String password = sc.nextLine();

        //Step 1.
        // Call the database and find info based off the submitted username
        Teacher teach = td.getByUsername(username);

        // Step 2. Check the returned password of the username and verify it matches the entered password
        if(teach.getPassword().equals(password)){
            System.out.println("Congratulations after everything you have been logged in!");
            System.out.println(teach);

            // We need to refactor and be able to store the user in the main class
            return teach;
        } else{
            System.out.println("Invalid Login");
            return null;
        }
    }

    public Teacher register(){
        System.out.println("Please enter your First Name");
        String first = sc.nextLine();
        System.out.println("Please enter your Last Name");
        String last = sc.nextLine();
        System.out.println("Please enter your username");
        String username = sc.nextLine();
        System.out.println("Please enter your password");
        String password = sc.nextLine();


        // Now we've taken in the information regarding the actual user we're trying to create and now we need to send
        // that info to the DAO

        // Now that we created the DAO method we just need to call it with the info provided
        Teacher teacher = td.createTeacher(first,last,username,password);

        return teacher;

    }
}
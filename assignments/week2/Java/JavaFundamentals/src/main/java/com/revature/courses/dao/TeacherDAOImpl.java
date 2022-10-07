package com.revature.courses.dao;

import com.revature.courses.models.Teacher;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.List;

public class TeacherDAOImpl implements TeacherDAO{


    @Override
    public Teacher getByUsername(String username) {

        // In this method is where we do the actual talking to the database, so in our case we're going to talk to a CSV
        // file, later though, we'll create another class to do the same thing but talks to a SQL database

        // Create a buffered reader to talk to our database

        // We need a try-catch block to make sure we don't runinto a FileNotFoundException

        String line = "";
        String splitBy = ",";
        try{
            BufferedReader br = new BufferedReader(new FileReader("src/main/resources/teachers.csv"));

            // This is allowing us to read through the entire file till the end
            while ((line = br.readLine()) != null)   //returns a Boolean value
            {
                // This is where we'll do our logic
                // What is the logic we need to do?
                // We need to check each line to see if the username matches our entered username and then we should be able
                // to send the user back to the front

                // I'm going to use the .split method to break the line
                String[] info = line.split(splitBy);

                if (info[3].equals(username)){

                    // We'll parse info[0] into an integer
                    // We'll cover wrapper classes another time but they basically give object abilities to primitive values
                    // int id = Integer.parseInt(info[0]);

                    return new Teacher(info[1], info[2], info[3], info[4]);
                }

            }
        } catch (FileNotFoundException e){
            e.printStackTrace();
        } catch (IOException e){
            e.printStackTrace();
        }

        return null;
    }

    @Override
    public Teacher createTeacher(String first, String last, String username, String password) {
        return null;
    }

    @Override
    public List<Teacher> getAllTeachers() {
        return null;
    }
}
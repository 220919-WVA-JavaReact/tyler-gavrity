package com.revature.courses.dao;

import com.revature.courses.models.Teacher;
import com.revature.courses.util.ConnectionUtil;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class TeacherDAOImplProstgres implements TeacherDAO{
    //This is where you'll put your logic to get the user from database
    @Override
    public Teacher getByUsername(String username) {
        //To get by username we are going to use a prepared statement to help us prevent against sql injection

        //Let's first create a teacher object to store the information I pull back
        Teacher teach = new Teacher();

        //I am going to use a try-with-resources block to make sure I close my connection once done

        try(Connection conn = ConnectionUtil.getConnection()){
            //Let's write the SQL statement that we want to use to get out Teacher back

            String sql = "Select * from teachers where username = ?";
            //Put a question mark anywhere you want to enter information

            //Now lets prepare the statement
            PreparedStatement stmt = conn.prepareStatement(sql);
            //Set the individual values for the question marks
            stmt.setString(1, username);
            //Things are going to be slightly different when trying to take in a whole set of values
            ResultSet rs;

            //Since I'm only expecting one result I'll handle it differently
            if  ((rs = stmt.executeQuery()) != null){
                //if the result set is not blank then we found our value

                //Move the cursor forward
                rs.next();

                //Now we can pull the information out and store it in the teacher object
                int id = rs.getInt("teacher_id");
                String first = rs.getString("first");
                String last = rs.getString("last");
                String receivedUsername = rs.getString("username");
                String password = rs.getString("password");

                //Now that I have my fields we create a teacher object

                teach = new Teacher(id, first, last, username, password);

            }
        } catch(SQLException e) {
            e.printStackTrace();
        }

        return teach;
    }

    @Override
    public Teacher createTeacher(String first, String last, String username, String password) {

        //We're going to try to create some method to add a teacher to the database

        //First thing is to create a blank teacher object
        Teacher teacher = new Teacher();

        try(Connection conn = ConnectionUtil.getConnection()){
            String sql = "Insert into teachers (\"first\", \"last\", username, \"password\") Values (?,?,?,?) returning *";

            PreparedStatement stmt = conn.prepareStatement(sql);

            stmt.setString(1,first);
            stmt.setString(2,last);
            stmt.setString(3,username);
            stmt.setString(4,password);

            ResultSet rs;

            if ((rs = stmt.executeQuery()) != null ){
                //Being in here means that it exists

                //Move cursor forward
                rs.next();
                int id = rs.getInt("teacher_id");
                String receivedFirst = rs.getString("first");
                String receivedLast = rs.getString("last");
                String receivedUsername = rs.getString("username");
                String receivedPassword = rs.getString("password");


                teacher = new Teacher(id, receivedFirst, receivedLast, receivedUsername, receivedLast);
            }

        } catch (SQLException e){
            e.printStackTrace();
            System.out.println("Couldn't register user");
        }

        return null;
    }

    @Override
    public List<Teacher> getAllTeachers() {
        //We'll start will this method to do a simple query to get all the teachers
        //SQL statement Select * from Teachers;

        //Create connection
        Connection conn = ConnectionUtil.getConnection();

        List<Teacher> teachers = new ArrayList<>();

        //Let's create a statement

        try {
            Statement stmt = conn.createStatement();
            //Logic goes inside
            String sql = "Select * from employee";

            ResultSet rs = stmt.executeQuery(sql);

            //To store all of our teachers, I plan to create an empty list of employees and I will store the info inside it



            while(rs.next()){

                int id = rs.getInt("teacher_id");
                String first = rs.getString("first");
                String last = rs.getString("last");
                String username = rs.getString("username");
                String password = rs.getString("password");

                //Create a teacher object to loop
                Teacher teach = new Teacher(id, first, last, username, password);
                System.out.println(teach);

                //Add the resulting item to the list of teachers
                teachers.add(teach);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return teachers;
    }
}

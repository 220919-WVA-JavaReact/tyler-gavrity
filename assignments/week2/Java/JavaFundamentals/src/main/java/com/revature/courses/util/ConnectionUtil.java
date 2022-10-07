package com.revature.courses.util;


import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

//We are going to make a singleton connection instance
public class ConnectionUtil {
    //To make this singleton we'll follow this

    //private static instance of a connection
    private static Connection conn =null;

    //private constructor
    //No one can create a connection unless they are in this class
    private ConnectionUtil(){

    }

    public static Connection getConnection(){
        //We'll check to see if there's a connection instance already
        //if so return it
        try {
            if (conn != null && !conn.isClosed()) {
                System.out.println("Use a previously made connection");
                return conn;
            }
        } catch (SQLException e){
                //print stack trace
                e.printStackTrace();
                return null;
            }

//        String url = "jdbc:postgresql://database-2.c8f5lnlgqqne.us-west-1.rds.amazonaws.com:5432/postgres";
//        String username = "postgres";
//        String password = "elephant";


        //Now that we've labeled our credentials lets use them to create our connection

//        try {
//            conn = DriverManager.getConnection(url,username, password);
//            System.out.println("Establish connection to new database");
//        } catch (SQLException e) {
//            System.out.println("Connection failed");
//            e.printStackTrace();
//        }

    /*
    String url = "";
    String username = "";
    String password = "";

    //Now we need to store our data in an application.properties file

        Properties prop = new Properties();

        //We need to load the properties file
        try {
            prop.load(new FileReader("src/main/resources/application.properties"));
            //Now we have loaded it, lets extract the information

            url = prop.getProperty("url");

            username = prop.getProperty("username");

            password = prop.getProperty("password");

            conn = DriverManager.getConnection(url,username, password);
//            System.out.println("Establish connection to new database");


        } catch (IOException e) {
            System.out.println("Could not find properties file");
            e.printStackTrace();
        } catch (SQLException e) {
            System.out.println("Could not establish connection");
            e.printStackTrace();
        }

     */


        //We need to pull those enviroment variables to get the information

        String url = System.getenv("url");
        String username = System.getenv("username");
        String password = System.getenv("password");

        try {
            conn = DriverManager.getConnection(url,username, password);
            System.out.println("Establish connection to new database");
        } catch (SQLException e) {
            System.out.println("Connection failed");
            e.printStackTrace();
        }


        return conn;

        }


        //If there isn't a create a new one
    }



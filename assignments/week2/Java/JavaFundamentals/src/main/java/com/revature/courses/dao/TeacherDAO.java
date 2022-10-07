package com.revature.courses.dao;

import com.revature.courses.models.Teacher;

import java.util.List;

public interface TeacherDAO {

    // Inside here we are providing the basic requirements we want our DAO to have
    // This will essentially be a list of methods that will be implemented for a specific kind of database

    // We could have these implemented for working with files or a SQL databse or whatever

    Teacher getByUsername(String username);

    Teacher createTeacher(String first, String last, String username, String password);

    //I'm going to add one more method to speed up the process of showing off some of this material

    List<Teacher> getAllTeachers();
}













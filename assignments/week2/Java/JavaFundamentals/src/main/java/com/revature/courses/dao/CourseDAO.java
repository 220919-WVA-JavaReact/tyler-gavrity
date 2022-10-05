package com.revature.courses.dao;

import com.revature.courses.models.Course;

import java.util.List;

public interface CourseDAO {

    // This is where I define the methods I want the DAO to use to interact with some database

    // Create a Course Method
    Course createCourse(String courseNum, String title, int teacherId);

    // Read all course Methods
    // To read all the information, we don't necessarily need to take in any arguments to perform this action
    List<Course> getAllCourse();

    // Let's add an extra method just in case we want it, which will be a get courses by teacher
    List<Course> getCoursesByTeacherId(int id);

    // Update some course
    // So we probably want to send in a course object, and have it update based of the values
    boolean updateCourse(Course course);
}

package com.revature.courses.dao;

import com.revature.courses.models.Course;

import java.util.List;

public class CourseDAOImpl implements CourseDAO{

    // This will be updated once we have JDBC to connect to our Database

    @Override
    public Course createCourse(String courseNum, String title, int teacherId) {
        System.out.println("Called the create course method!");
        return null;
    }

    @Override
    public List<Course> getAllCourse() {
        System.out.println("Called the get all courses method!");
        return null;
    }

    @Override
    public List<Course> getCoursesByTeacherId(int id) {
        System.out.println("Called the get courses by Teacher Method");
        return null;
    }

    @Override
    public boolean updateCourse(Course course) {
        System.out.println("Called the update course method");
        return false;
    }
}

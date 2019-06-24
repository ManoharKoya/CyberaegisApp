package com.example.cyberaegisapp;

public class Course_row_parts {

    private String course, course_description;
    private int image;

    public Course_row_parts(String course, String course_description, int image) {
        this.course = course;
        this.course_description = course_description;
        this.image = image;
    }

    public String getCourse() {
        return course;
    }

    public String getCourse_description() {
        return course_description;
    }

    public int getImage() {
        return image;
    }
}

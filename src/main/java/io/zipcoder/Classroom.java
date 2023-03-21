package io.zipcoder;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class Classroom {
    private Student[] students;
    private int size;

    public Classroom (int maxSize){

        this.students = new Student[maxSize];
    }
    public Classroom(Student[] students) {
        this.students = students;
        this.size = students.length;
    }
    public Classroom(){

        this(30);
    }
    public Student[] getStudents(){

        return this.students;
    }
    public Double getAverageExamScores(){
        double score = 0.0;
        for(Student student : students) {
            score += student.getAverageExamScore();
        }
        return score/students.length;
    }

    public void addStudent(Student student){
        if(students.length == size) {
            this.students = Arrays.copyOf(students, size + 1);
        }
        students[size] = student;
        size++;
    }

    public void removeStudent(String firstName, String lastName){

    }

    public void getStudentByScore(){

    }

    public void getGradeBook(){

    }

}

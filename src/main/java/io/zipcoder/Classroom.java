package io.zipcoder;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class Classroom {
    private Student[] students;
    private int size; //current number of students in class

    public Classroom (int maxSize){

        this.students = new Student[maxSize];
    }
    public Classroom(Student[] students) {
        this.students = students;
        this.size = students.length;
    }
    public Classroom(){
//         "this" is referencing to previous constructors and
//        the value of into the size of the students array (30).
//          This constructor is initializing an array of students with size 30.
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
//      if equal, the array is full; needs to be resized to accommodate the new student
            this.students = Arrays.copyOf(students, size + 1);
            // add 1 to size since adding student
        }
        students[size] = student;
        size++;
    }

    public void removeStudent(String firstName, String lastName){
        for(int i = 0; i < students.length; i++) {
            Student student = students[i];
            if (student.getFirstName().equals(firstName)
                    && student.getLastName().equals(lastName)) {
                shiftStudentToTheRight(i);
                students[size-1] = null;
                break;
            }
        }
        size--;
    }

    private void shiftStudentToTheRight(int startIndex) {
        for(int i = startIndex; i < students.length - 1; i++) {
            students[i] = students[i + 1];
        }
    }

    public void getStudentByScore(){


    }

    public void getGradeBook(){

    }

}

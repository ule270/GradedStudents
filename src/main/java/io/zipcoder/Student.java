package io.zipcoder;

import java.util.ArrayList;

public class Student {
    String firstName;
    String lastname;
    ArrayList<Double> examScores;

    public Student(String firstName, String lastName, Double[] examScores) {
        this.firstName = firstName;
        this.lastname = lastName;
        this.examScores = null;
    }
    public static String getFirstName(String firstname){
        return firstname;
    }

    public static String getLastName(String lastname){
        return lastname;
    }

    public static Integer getNumberOfExamsTaken(Integer numberOfExams) {
        return numberOfExams;
    }
    public static Double[] getExamScores(Double[] examScores){

        return examScores;
    }

    public Double addExamScore(double examScore){
        return null;

    }
    public Integer setExamScore(int examNumber, double newScore){
        return null;
    }

    // should return the sum of the examScore list divided by its size
    public Double getAverageExamScore(){
        return null;
    }
    // return a clean String representation of person
    public String Student(){
        return null;
    }

}

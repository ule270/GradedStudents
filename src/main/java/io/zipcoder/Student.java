package io.zipcoder;

import java.util.ArrayList;

public class Student {
    String firstName;
    String lastname;
    ArrayList<Double> examScores;

    public Student(String firstName, String lastName, Double[] testScores) {
        this.firstName = firstName;
        this.lastname = lastName;

    }
    public String getFirstName(){
        return null;
    }

    public static String getLastName(String lastname){
        return lastname;
    }

    public Integer getNumberOfExamsTaken() {
        return null;
    }
    public String getExamScores(){
        return null;
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

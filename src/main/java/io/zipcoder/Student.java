package io.zipcoder;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Student {
    private static String firstName;
    private static String lastName;
    static Double[] examScores;

    public Student(String firstName, String lastName, Double[] examScores) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.examScores = null;
    }
    public static String getFirstName(String firstName){

        return firstName;
    }

    public static String getLastName(String lastName){

        return lastName;
    }

    public static Integer getNumberOfExamsTaken(Integer numberOfExams) {

        return numberOfExams;
    }
    public static Double[] getExamScores(Double[] examScores){

        return examScores;
    }

    public static String getExamScoresString(Student student){
//        String allExamsTaken = (Student.getFirstName(firstName) + Student.getLastName(lastName) + Student.getExamScores(examScores).toString());
//        return allExamsTaken;
        return null;
    }

    public static Double[] addExamScore(double examScore){
        ArrayList<Double> arrayList= new ArrayList<Double>(Arrays.asList(examScore));
        arrayList.add(examScore);
        return (Double[]) arrayList.toArray();
    }
    public static Integer setExamScore(int examNumber, double newScore){

        return null;
    }

    // should return the sum of the examScore list divided by its size
    public static Double getAverageExamScore(){
        return null;
    }
    // return a clean String representation of person
    public static String Student(){
        return null;
    }
}

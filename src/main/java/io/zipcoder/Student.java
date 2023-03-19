package io.zipcoder;

import java.util.ArrayList;
import java.util.Arrays;

public class Student {
    private static String firstName;
    private static String lastName;
    private static ArrayList<Double> examScores;

    public double avgScore;

    public Student(String firstName, String lastName, Double[] examScore) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.examScores = new ArrayList<>();
        this.examScores.addAll(Arrays.asList(examScore));
    }
    public static String getFirstName(String firstName){

        return firstName;
    }

    public static String getLastName(String lastName){

        return lastName;
    }


    public void addExamScore(double examScore){
            examScores.add(examScore);
    }

    public static Integer getNumberOfExamsTaken() {
        return examScores.size();

    }
    public String getExamScores() {
        String result = "";
        int examNumber = 1;
        for(Double i : examScores) {
            result += "Exam " + examNumber++ + " -> " + i + "\n";
        }
        return result;
    }

    public void setExamScore(int examNumber, double newScore){
        examScores.set(examNumber, newScore);
    }

    public double getAverageExamScore(){
        double totalScore = 0.0;
//        // checks if examScores is null or empty --> so no nullPointerException
        if (examScores != null && !examScores.isEmpty()) {
            for (Double i : examScores){
                totalScore += i;
            }
            avgScore = totalScore/examScores.size();
        } else {
            avgScore = 0.0;
        }
        return avgScore;
    }
}

package io.zipcoder;

import org.junit.Assert;
import org.junit.Test;

public class StudentTest {
    @Test
    public void TestConstructor(){
        //Given
        String expectedFirstName = "Nhi";
        String expectedLastName = "Nguyen";
        Double[] expectedExamScores = {50.0, 60.0, 80.0, 90.0,};
        Student student = new Student(expectedFirstName, expectedLastName, expectedExamScores);
        //When
        String actualFirstName = student.getFirstName(expectedFirstName);
        String actualLastName = student.getLastName(expectedLastName);
        Double[] actualExamScores = student.getExamScores(expectedExamScores);

        //Then
        Assert.assertEquals(expectedFirstName, actualFirstName);
        Assert.assertEquals(expectedLastName, actualLastName);
        Assert.assertEquals(expectedExamScores, actualExamScores);
    }

    @Test
    public void testGetFirstName() {
        String firstname = "Keanu";
        String expected = Student.getFirstName(firstname);

        String actual = Student.getFirstName(firstname);

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testGetLastName() {
        String lastname = "Le";
        String expected = Student.getLastName(lastname);

        String actual = Student.getLastName(lastname);
        
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testNumberOfExamsTaken() {

        Integer numberOfExams = 0;

        Integer expected = Student.getNumberOfExamsTaken(numberOfExams);

        Integer actual = Student.getNumberOfExamsTaken(numberOfExams);

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testGetExamScores(){
        Double[] examScores = {};

        Double[] expected = Student.getExamScores(examScores);

        Double[] actual = Student.getExamScores(examScores);

        Assert.assertEquals(expected, actual);
    }

//    @Test
//    public void testGetExamScoresString() {
////        given
//        String firstName = "Leon";
//        String lastName = "Hunter";
//        Double[] examScores = {};
//        Student student = new Student(firstName, lastName, examScores);
//
//        // When
//        String expected = Student.getExamScoresString(student);
//        String actual = Student.getExamScoresString(student);
//
//        // Then
//        Assert.assertEquals(expected, actual);
//
//    }

    @Test
    public void testAddExamScore () {
// : Given
        String firstName = "Leon";
        String lastName = "Hunter";
        Double[] examScores = {};
        Double scoreToAdd = (double) 1;
        Student student = new Student(firstName, lastName, examScores);

        // When
        Double[] actual = Student.addExamScore(scoreToAdd);
        Double[] expected = student.addExamScore(scoreToAdd);

   // Then
        Assert.assertEquals(expected, actual);
    }


}
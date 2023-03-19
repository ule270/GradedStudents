package io.zipcoder;

import org.junit.Assert;
import org.junit.Test;

public class StudentTest {
    Student student = new Student("Uyen", "Le", new Double[]{50.0, 60.0, 80.0, 90.0});
    @Test
    public void TestConstructor(){
        //Given
        String expectedFirstName = "Uyen";
        String expectedLastName = "Le";
        Double[] expectedExamScores = {50.0, 60.0, 80.0, 90.0,};
        Integer expectedNumberOfExamsTaken = 4;
        Student student = new Student(expectedFirstName, expectedLastName, expectedExamScores);
        //When
        String actualFirstName = student.getFirstName(expectedFirstName);
        String actualLastName = student.getLastName(expectedLastName);
        Integer actualNumberOfExamsTaken = student.getNumberOfExamsTaken();

        //Then
        Assert.assertEquals(expectedFirstName, actualFirstName);
        Assert.assertEquals(expectedLastName, actualLastName);
        Assert.assertEquals(expectedNumberOfExamsTaken, actualNumberOfExamsTaken);
    }

    @Test
    public void testGetFirstName() {
        String expected = "Keanu";

        String actual = Student.getFirstName(expected);

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testGetLastName() {
        String expected = "Le";

        String actual = Student.getLastName(expected);
        
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testGetNumberOfExamsTaken() {
        Integer expected = 4 ;
        Integer actual= student.getNumberOfExamsTaken();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testAddExamScore () {
        String expectedScores = "Exam 1 -> 50.0\nExam 2 -> 60.0\nExam 3 -> 80.0\nExam 4 -> 90.0\nExam 5 -> 80.0\n";

        student.addExamScore(80.0);

        Assert.assertEquals(expectedScores, student.getExamScores());
    }
    @Test
    public void testGetExamScores() {
        Student student = new Student("Uyen", "Le", new Double[]{50.0, 60.0, 80.0, 90.0});
        String expectedScores = "Exam 1 -> 50.0\nExam 2 -> 60.0\nExam 3 -> 80.0\nExam 4 -> 90.0\n";

        String actualScores = student.getExamScores();

        Assert.assertEquals(expectedScores, actualScores);
    }
    @Test
    public void testSetExamScore() {
        String expectedScores = "Exam 1 -> 50.0\nExam 2 -> 60.0\nExam 3 -> 90.0\nExam 4 -> 90.0\n";

        student.setExamScore(2, 90.0);
        String actualScores = student.getExamScores();

        Assert.assertEquals(expectedScores,actualScores);
    }

    @Test
    public void testGetAverageExamScore() {
        Student student = new Student("Uyen", "Le", new Double[]{50.0, 60.0, 80.0, 90.0});
        double expected = (50.0 + 60.0 + 80.0 +90.0) / 4;

        Assert.assertEquals(expected, student.getAverageExamScore(), 0.001);
        //delta value allows for margin of error
        }


}
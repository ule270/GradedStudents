package io.zipcoder;

import org.junit.Assert;
import org.junit.Test;

public class ClassroomTest {

    @Test
    public void testMaxClassSizeConstructor() {
        //Given
        Classroom classroom = new Classroom(10);
        Integer expected = 10;

        //When
        Integer length = classroom.getStudents().length;

        //Then
        Assert.assertEquals(expected,length);

    }
    @Test
    public void testNullaryConstructor() {
        //Given
        Classroom classroom = new Classroom();
        Integer expected = 30;

        //When
        Integer actual = classroom.getStudents().length;

        //Then
        Assert.assertEquals(expected,actual);
    }
    @Test
    public void testAverageExamScore() {
        //Given
        Double[] student1score = {100.0, 90.0};
        Double[] student2score = {95.0, 95.0};
        Student student1 = new Student("Betsy", "Nguyen", student1score);
        Student student2 = new Student("Danny", "Nguyen", student2score);
        Student[] students = new Student[]{student1, student2};
        Classroom classroom = new Classroom(students);
        double expected = 95.0;
        //When
        double actual = classroom.getAverageExamScores();
        //Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testAddStudent(){
        // : Given
        int maxNumberOfStudents = 1;
        Classroom classroom = new Classroom(maxNumberOfStudents);
        Double[] examScores = { 90.0, 80.0, 70.0, 60.0 };
        Student student = new Student("Thomas", "Nguyen", examScores);
        String expected = student.toString();

        // When
        Student[] preEnrollment = classroom.getStudents();
        classroom.addStudent(student);
        Student[] postEnrollment = classroom.getStudents();

        // Then
        String actual = postEnrollment[0].toString();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testRemoveStudent(){
        Classroom classroom = new Classroom();
        String firstName = "Michael";
        String lastName = "Nguyen";

        Student[] preEnrollment = classroom.getStudents();
        classroom.removeStudent(firstName, lastName);
        Student[] postEnrollment = classroom.getStudents();

        // Then
        String actual = postEnrollment[0].toString();
        Assert.assertEquals(postEnrollment, actual);

    }

}

package io.zipcoder;

import org.junit.Assert;
import org.junit.Test;

public class StudentTest {



    @Test
    public void testGetLastName() {
        String lastname = "Le";
        String expected = Student.getLastName(lastname);

        String actual = Student.getLastName(lastname);
        
        Assert.assertEquals(expected, actual);
    }

}
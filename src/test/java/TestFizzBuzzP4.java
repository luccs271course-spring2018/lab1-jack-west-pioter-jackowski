import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TestFizzBuzzP4 {
    private FizzBuzzP4 fixture;

    @Before
    public void setUp() throws Exception {
        fixture = new FizzBuzzP4();
    }

    @After
    public void tearDown() throws Exception {
        fixture = null;
    }

    @Test
    public void dummy1() {
        //Because these all return invalid number, I included them all in the same method comparing to the same list
        assertNotNull(fixture);
        List<Object> blank = Arrays.asList("Invalid number");
        assertEquals(blank, fixture.FizzBuzz(-10));
        assertEquals(blank, fixture.FizzBuzz(-1));
        assertEquals(blank, fixture.FizzBuzz(-0));

    }
    @Test
    public void dummy2() {
        assertNotNull(fixture);
        //The reference list with the highest possible values
        List<Object> Tester = Arrays.asList(1,2,"Fizz",4,"Buzz","Fizz",7,8,"Fizz","Buzz",11,"Fizz",13,14,"Fizz-Buzz",16,17);
        List<Object> fizzbuzzTemp = fixture.FizzBuzz(1);
        List<Object> fizzbuzzTemp2 = fixture.FizzBuzz(10);
        List<Object> fizzbuzzTemp3 = fixture.FizzBuzz(17);
        assertEquals(Tester,fizzbuzzTemp3);
        //These for loops are here to test the values which will be less than seventeen.
        //Being that their length will not be the same as our hard coded reference list
        //These are ment to check if the values are the same up to the test value that is input
        for(int i = 0; i < fizzbuzzTemp.size();i++)
        {
            assertEquals(Tester.get(i),fizzbuzzTemp.get(i));
        }
        for(int i = 0; i < fizzbuzzTemp2.size();i++)
        {
            assertEquals(Tester.get(i),fizzbuzzTemp2.get(i));
        }

    }
}

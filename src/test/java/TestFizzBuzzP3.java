import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class TestFizzBuzzP3 {
    private FizzBuzzP3 fixture;

    @Before
    public void setUp() throws Exception {
        fixture = new FizzBuzzP3();
    }

    @After
    public void tearDown() throws Exception {
        fixture = null;
    }

    @Test
    public void dummy1() {
        assertNotNull(fixture);
        Object blank[] = {"Invalid number"};
        assertEquals(blank, fixture.FizzBuzz(-10));
    }

    @Test
    public void dummy2() {
        assertNotNull(fixture);
        Object blank[] = {"Invalid number"};
        assertEquals(blank, fixture.FizzBuzz(-1));
    }

    @Test
    public void dummy3() {
        assertNotNull(fixture);
        Object blank[] = {"Invalid number"};
        assertEquals(blank, fixture.FizzBuzz(0));
    }

    @Test
    public void dummy4() {
        assertNotNull(fixture);
        Object blank[] = {1,2,"Fizz",4,"Buzz","Fizz",7,8,"Fizz","Buzz",11,"Fizz",13,14,"Fizz-Buzz",16,17};
        assertEquals(blank, fixture.FizzBuzz(17));
    }
}

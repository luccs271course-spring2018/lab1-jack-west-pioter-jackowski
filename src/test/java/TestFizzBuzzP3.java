import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class TestFizzBuzzP3 {
    private FizzBuzzP3 fixture;

    @Before
    public void setUp() throws Exception{
        fixture = new FizzBuzzP3();
    }

    @After
    public void tearDown() throws Exception {
        fixture = null;
    }

    @Test
    public void dummy() {
        assertNotNull(fixture);
        fixture.FizzBuzz(-17);
        assertArrayEquals(Object[] blank = );
}

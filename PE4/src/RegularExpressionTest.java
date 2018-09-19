import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class RegularExpressionTest {
    RegularExpression object;
    @Before
    public void setUp() throws Exception {
        object = new RegularExpression();
    }

    @After
    public void tearDown() throws Exception {
        object = null;
    }

    @Test
    public void basicCheck() {
        assertEquals("fails", true, object.findString("Harry Potter"));
        assertEquals("fails", false, object.findString("miss granger"));
        assertEquals("fails", false, object.findString("harry Potter"));
        assertEquals("fails", false, object.findString("HarryHarry Potter"));
    }

    @Test
    public void failureCheck() {
        assertNotNull("fails",  object.findString("Potter"));
        assertEquals("fails", false, object.findString(""));
    }
}
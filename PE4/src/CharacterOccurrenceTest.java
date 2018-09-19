import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class CharacterOccurrenceTest {
    CharacterOccurrence object;
    @Before
    public void setUp() throws Exception {
        object = new CharacterOccurrence();
    }

    @After
    public void tearDown() throws Exception {
        object = null;
    }

    @Test
    public void basicCheck() {
        assertEquals("fails", 10, object.countChar('a',"Java is java again java again"));
        assertEquals("fails", 6, object.countChar('m',"mmischief mismanagedmm"));
    }

    @Test
    public void failureCheck() {
        assertNotNull("fails",object.countChar('a',"sd"));
        assertEquals("fails",0,object.countChar('p',""));
    }
}
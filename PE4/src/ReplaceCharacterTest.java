import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ReplaceCharacterTest {

    ReplaceCharacter object;
    @Before
    public void setUp() throws Exception {
        object = new ReplaceCharacter();
    }

    @After
    public void tearDown() throws Exception {
        object = null;
    }

    @Test
    public void basicCheck() {
        assertEquals("fails", "faity fry", object.replaceChar("daily dry"));
        assertEquals("fails", "miss", object.replaceChar("miss"));
    }
}
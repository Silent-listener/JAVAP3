import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class StudentMarksTest {

    StudentMarks p;
    @Before
    public void setUp() throws Exception {
        p = new StudentMarks();
    }

    @After
    public void tearDown() throws Exception {
        p = null;
    }

    @Test
    public void inputCorrect() {
        assertEquals("failed","Valid Grades",StudentMarks.input(3,new int[]{20,40,90}));
        assertEquals("failed","Valid Grades",StudentMarks.input(1,new int[]{50}));
        assertEquals("failed","error",StudentMarks.input(4,new int[]{20,109,40,90}));
    }
    @Test
    public void inputFailure() {
        assertNotNull("failed",StudentMarks.input(2,new int[]{40,90}));
        assertNotNull("failed",StudentMarks.input(0,new int[]{}));
    }
}
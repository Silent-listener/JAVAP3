import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class MultipleOccurrenceTest {
    MultipleOccurrence object;
    @Before
    public void setUp() throws Exception {
        object = new MultipleOccurrence();
    }

    @After
    public void tearDown() throws Exception {
        object = null;
    }

    @Test
    public void basicCheck() {
        List<String> ans = new ArrayList<String>();
        ans.add("Found at: 4-6");
        ans.add("Found at: 10-12");
        ans.add("Found at: 27-29");
        assertEquals("fails",ans, object.checkMultipleOccurrence("She sells seashells by the seashore","se"));
    }

    @Test
    public void noOccurrenceTest() {
        List<String> ans = new ArrayList<String>();
        assertEquals("fails",ans, object.checkMultipleOccurrence("She sells seashells by the seashore","ku"));
    }
}
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.*;

public class Map2KeysTest {
    Map2Keys object;
    @Before
    public void setUp() throws Exception {
    object = new Map2Keys();
    }

    @After
    public void tearDown() throws Exception {
    object = null;
    }

    @Test
    public void basicCheck() {
        Map<String, String> input= new HashMap <>();
        input.put("val1", "java");
        input.put("val2", "c++");
        Map<String, String> expected= new HashMap <>();
        expected.put("val1", " ");
        expected.put("val2", "java");
        assertEquals("fail",expected,object.modifyKeysOfMap(input));
    }
    @Test
    public void nullCheck() {
        Map<String, String> input= new HashMap <>();
        input.put("val", "java");
        input.put("val2", "c++");

        assertEquals("fail",null,object.modifyKeysOfMap(input));
    }
}
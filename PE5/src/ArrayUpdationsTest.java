import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

import static org.junit.Assert.*;

public class ArrayUpdationsTest {
    ArrayUpdations object;
    @Before
    public void setUp() throws Exception {
        object = new ArrayUpdations();
    }

    @After
    public void tearDown() throws Exception {
        object = null;
    }

    @Test
    public void basicCheck(){
        List<String> originalList = new LinkedList<>(Arrays.asList("Apple","Grape","Melon","Berry"));
        assertEquals("fails", Arrays.asList("Kiwi","Grape","Melon","Berry"),object.updatingIndex(originalList,0,"Kiwi")
        );
        assertEquals("fails",0,object.emptyList(originalList)
        );
    }

}
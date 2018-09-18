import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class VowelRemovalTest {
    VowelRemoval p;

    @Before
    public void setUp() throws Exception {
        p = new VowelRemoval();
    }

    @After
    public void tearDown() throws Exception {
        p = null;
    }

    @Test
    public void removeVowalsSuccess() {
        assertEquals("fail",new String[]{"Ind","Untd Stts","Grmny","Egypt","czchslvk"},VowelRemoval.removeVowels(new String[]{"India","United States","Germany","Egypt","czechoslovakia"}));
    }

    @Test
    public void removeVowalsfails() {
        assertNotNull("fail", VowelRemoval.removeVowels(new String[]{"aeiou"}));
        assertEquals("fail", new String[] {""}, VowelRemoval.removeVowels(new String[]{""} ));
    }
}
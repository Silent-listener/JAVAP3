import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class MatrixAddTest {
    MatrixAdd p;
    @Before
    public void setUp() throws Exception {
        p = new MatrixAdd();
    }

    @After
    public void tearDown() throws Exception {
        p = null;
    }

    @Test
    public void success() {
        int[][] matrix1 = {{1,2},{3,4},{5,6}};
        int[][] matrix2 = {{9,8},{7,6},{5,4}};
        int[][] result = {{10,10},{10,10},{10,10}};
        assertEquals(result , p.sumFunction(matrix1, matrix2));
    }

    @Test
    public void failure() {
        int[][] matrix1 = {{1,2},{3,4},{5,6},{4,8}};
        int[][] matrix2 = {{9,8},{7,6},{5,4}};
        assertEquals(null, p.sumFunction(matrix1, matrix2));
    }
}
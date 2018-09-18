class MatrixDimensionsNotEqualException extends Exception{
    public MatrixDimensionsNotEqualException(String error){
        super(error);
    }
}
public class MatrixAdd {
        public int[][] sumFunction ( int[][] matrix1, int[][] matrix2)  {

            try {
                int row1 = matrix1.length;
                int row2 = matrix2.length;
                if (row1 != row2) {
                    throw new MatrixDimensionsNotEqualException("Different number of rows");
                } else {
                    for (int i = 0; i < matrix1.length; i++) {
                        if (matrix1[i].length != matrix2[i].length)
                            throw new MatrixDimensionsNotEqualException("Columns don't match");
                        for (int j = 0; j < matrix1[i].length; j++) {
                            matrix1[i][j] = matrix1[i][j] + matrix2[i][j];
                        }
                    }
                }
            } catch (MatrixDimensionsNotEqualException e) {
                System.out.println(e);
                return null;
            }
            return matrix1;
        }
}

public class RowColumnSum {
    public static void main(String[] args) {
        int[][] mat = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        int rows = mat.length;
        int cols = mat[0].length;

        for (int i = 0; i < rows; i++) {
            int rowSum = 0;
            for (int j = 0; j < cols; j++) rowSum += mat[i][j];
            System.out.println("Sum of Row " + (i + 1) + " = " + rowSum);
        }

        for (int j = 0; j < cols; j++) {
            int colSum = 0;
            for (int i = 0; i < rows; i++) colSum += mat[i][j];
            System.out.println("Sum of Column " + (j + 1) + " = " + colSum);
        }
    }
}
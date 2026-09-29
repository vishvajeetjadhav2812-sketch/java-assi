public class MatrixMultiplication {
    public static void main(String[] args) {
        int[][] a = {{1, 2}, {3, 4}};
        int[][] b = {{2, 0}, {1, 2}};
        int[][] prod = new int[2][2];

        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                prod[i][j] = 0;
                for (int k = 0; k < 2; k++) {
                    prod[i][j] += a[i][k] * b[k][j];
                }
                System.out.print(prod[i][j] + " ");
            }
            System.out.println();
        }
    }
}
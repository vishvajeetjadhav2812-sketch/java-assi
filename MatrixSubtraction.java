public class MatrixSubtraction {
    public static void main(String[] args) {
        int[][] a = {{5, 6}, {7, 8}};
        int[][] b = {{1, 2}, {3, 4}};
        int[][] diff = new int[2][2];

        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                diff[i][j] = a[i][j] - b[i][j];
                System.out.print(diff[i][j] + " ");
            }
            System.out.println();
        }
    }
}
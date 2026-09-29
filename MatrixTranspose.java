public class MatrixTranspose {
    public static void main(String[] args) {
        int[][] mat = {{1, 2, 3}, {4, 5, 6}}; // 2x3
        int[][] trans = new int[3][2];

        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++) {
                trans[j][i] = mat[i][j];
            }
        }

        System.out.println("Transpose:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print(trans[i][j] + " ");
            }
            System.out.println();
        }
    }
}
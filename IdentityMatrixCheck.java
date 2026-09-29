public class IdentityMatrixCheck {
    public static void main(String[] args) {
        int[][] mat = {
            {1, 0, 0},
            {0, 1, 0},
            {0, 0, 1}
        };

        boolean isIdentity = true;
        int rows = mat.length;
        int cols = mat[0].length;

        if (rows != cols) {
            isIdentity = false;
        } else {
            for (int i = 0; i < rows; i++) {
                for (int j = 0; j < cols; j++) {
                    if (i == j && mat[i][j] != 1) isIdentity = false;
                    if (i != j && mat[i][j] != 0) isIdentity = false;
                }
            }
        }

        System.out.println(isIdentity ? "It is an Identity Matrix." : "Not an Identity Matrix.");
    }
}
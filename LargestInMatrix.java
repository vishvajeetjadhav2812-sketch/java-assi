public class LargestInMatrix {
    public static void main(String[] args) {
        int[][] mat = {
            {10, 22, 3},
            {4, 95, 6},
            {7, 8, 19}
        };
        int max = mat[0][0];

        for (int[] row : mat) {
            for (int val : row) {
                if (val > max) max = val;
            }
        }

        System.out.println("Largest Element = " + max);
    }
}
public class CountPositiveNegativeZero {
    public static void main(String[] args) {
        int[] arr = {-5, 0, 12, -3, 0, 8, 19};
        int pos = 0, neg = 0, zero = 0;

        for (int val : arr) {
            if (val > 0) pos++;
            else if (val < 0) neg++;
            else zero++;
        }

        System.out.println("Positive: " + pos + ", Negative: " + neg + ", Zeroes: " + zero);
    }
}
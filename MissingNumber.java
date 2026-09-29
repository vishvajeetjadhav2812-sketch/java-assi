public class MissingNumber {
    public static void main(String[] args) {
        int[] arr = {1, 2, 4, 5, 6}; // 1 to n (n=6), missing 3
        int n = 6;
        int expectedSum = n * (n + 1) / 2;
        int actualSum = 0;

        for (int val : arr) actualSum += val;

        System.out.println("Missing Number: " + (expectedSum - actualSum));
    }
}
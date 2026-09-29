public class CountEvenOdd {
    public static void main(String[] args) {
        int[] arr = {12, 17, 24, 33, 40, 55};
        int even = 0, odd = 0;
        for (int val : arr) {
            if (val % 2 == 0) even++;
            else odd++;
        }
        System.out.println("Even count: " + even + ", Odd count: " + odd);
    }
}
public class SumArray {
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50};
        int sum = 0;
        for (int val : arr) sum += val;
        System.out.println("Sum = " + sum);
    }
}
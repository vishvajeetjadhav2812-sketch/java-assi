public class SeparateEvenOdd {
    public static void main(String[] args) {
        int[] arr = {12, 34, 45, 9, 8, 90, 3};

        System.out.print("Even elements: ");
        for (int val : arr) if (val % 2 == 0) System.out.print(val + " ");

        System.out.print("\nOdd elements: ");
        for (int val : arr) if (val % 2 != 0) System.out.print(val + " ");
    }
}
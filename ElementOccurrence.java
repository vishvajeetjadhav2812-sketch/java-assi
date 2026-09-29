import java.util.Scanner;

public class ElementOccurrence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = {10, 20, 10, 30, 10, 40, 50};
        System.out.print("Enter element: ");
        int target = sc.nextInt();
        int count = 0;

        for (int val : arr) {
            if (val == target) count++;
        }
        System.out.println("Occurrences: " + count);
    }
}
import java.util.Scanner;

public class SearchElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = {10, 25, 30, 45, 50};
        System.out.print("Enter number to search: ");
        int target = sc.nextInt();
        boolean found = false;

        for (int val : arr) {
            if (val == target) {
                found = true;
                break;
            }
        }
        System.out.println(found ? "Element exists in array." : "Element not found.");
    }
}
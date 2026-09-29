import java.util.Scanner;

public class BinarySearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = {10, 20, 30, 40, 50, 60}; // Must be sorted
        System.out.print("Enter key to search: ");
        int key = sc.nextInt();

        int low = 0, high = arr.length - 1;
        int foundIndex = -1;

        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (arr[mid] == key) {
                foundIndex = mid;
                break;
            } else if (arr[mid] < key) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        if (foundIndex != -1) System.out.println("Found at index " + foundIndex);
        else System.out.println("Not found.");
    }
}
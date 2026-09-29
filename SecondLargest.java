public class SecondLargest {
    public static void main(String[] args) {
        int[] arr = {12, 35, 1, 10, 34, 1};
        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        for (int val : arr) {
            if (val > largest) {
                secondLargest = largest;
                largest = val;
            } else if (val > secondLargest && val != largest) {
                secondLargest = val;
            }
        }

        System.out.println("Second Largest: " + secondLargest);
    }
}
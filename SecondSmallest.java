public class SecondSmallest {
    public static void main(String[] args) {
        int[] arr = {12, 35, 1, 10, 34, 1};
        int smallest = Integer.MAX_VALUE;
        int secondSmallest = Integer.MAX_VALUE;

        for (int val : arr) {
            if (val < smallest) {
                secondSmallest = smallest;
                smallest = val;
            } else if (val < secondSmallest && val != smallest) {
                secondSmallest = val;
            }
        }

        System.out.println("Second Smallest: " + secondSmallest);
    }
}
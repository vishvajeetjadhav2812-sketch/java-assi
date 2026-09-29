public class CopyArray {
    public static void main(String[] args) {
        int[] source = {1, 2, 3, 4, 5};
        int[] dest = new int[source.length];

        for (int i = 0; i < source.length; i++) dest[i] = source[i];

        System.out.print("Copied Array: ");
        for (int val : dest) System.out.print(val + " ");
    }
}
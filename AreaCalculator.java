import java.util.Scanner;

public class AreaCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Menu:\n1. Circle\n2. Rectangle\n3. Triangle\n4. Square");
        System.out.print("Choose shape: ");
        int choice = sc.nextInt();

        switch (choice) {
            case 1:
                System.out.print("Enter radius: ");
                double r = sc.nextDouble();
                System.out.println("Area = " + (Math.PI * r * r));
                break;
            case 2:
                System.out.print("Enter length and width: ");
                double l = sc.nextDouble();
                double w = sc.nextDouble();
                System.out.println("Area = " + (l * w));
                break;
            case 3:
                System.out.print("Enter base and height: ");
                double b = sc.nextDouble();
                double h = sc.nextDouble();
                System.out.println("Area = " + (0.5 * b * h));
                break;
            case 4:
                System.out.print("Enter side length: ");
                double s = sc.nextDouble();
                System.out.println("Area = " + (s * s));
                break;
            default:
                System.out.println("Invalid choice!");
        }
    }
}
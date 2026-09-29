import java.util.Scanner;

public class MenuDrivenArithmetic {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("1. Add\n2. Subtract\n3. Multiply\n4. Divide");
        System.out.print("Enter your choice: ");
        int choice = sc.nextInt();

        System.out.print("Enter two numbers: ");
        double a = sc.nextDouble();
        double b = sc.nextDouble();

        switch (choice) {
            case 1: System.out.println("Sum = " + (a + b)); break;
            case 2: System.out.println("Difference = " + (a - b)); break;
            case 3: System.out.println("Product = " + (a * b)); break;
            case 4: 
                if (b != 0) System.out.println("Quotient = " + (a / b));
                else System.out.println("Division by zero error.");
                break;
            default: System.out.println("Invalid Choice!");
        }
    }
}
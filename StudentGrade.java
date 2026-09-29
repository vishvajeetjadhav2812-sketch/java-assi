import java.util.Scanner;

public class StudentGrade {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter marks (0-100): ");
        int marks = scanner.nextInt();

        if (marks >= 90 && marks <= 100) {
            System.out.println("Grade: A");
        } else if (marks >= 75 && marks < 90) {
            System.out.println("Grade: B");
        } else if (marks >= 60 && marks < 75) {
            System.out.println("Grade: C");
        } else if (marks >= 40 && marks < 60) {
            System.out.println("Grade: D");
        } else if (marks >= 0 && marks < 40) {
            System.out.println("Grade: Fail");
        } else {
            System.out.println("Invalid marks entered.");
        }
        scanner.close();
    }
}
import java.util.Scanner;

public class StudentMarksChallenge {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of students: ");
        int n = sc.nextInt();
        int[] marks = new int[n];

        int total = 0;
        int passedCount = 0;
        int failedCount = 0;

        System.out.println("Enter marks for " + n + " students:");
        for (int i = 0; i < n; i++) {
            System.out.print("Student " + (i + 1) + ": ");
            marks[i] = sc.nextInt();
            total += marks[i];
        }

        int highest = marks[0];
        int lowest = marks[0];

        for (int mark : marks) {
            if (mark > highest) highest = mark;
            if (mark < lowest) lowest = mark;
            if (mark >= 40) passedCount++;
            else failedCount++;
        }

        double average = (double) total / n;

        System.out.println("\n================ Results ================");
        System.out.println("Total Marks         : " + total);
        System.out.println("Average Marks       : " + average);
        System.out.println("Highest Marks       : " + highest);
        System.out.println("Lowest Marks        : " + lowest);
        System.out.println("Students Passed     : " + passedCount);
        System.out.println("Students Failed     : " + failedCount);
        System.out.println("-----------------------------------------");

        System.out.println("Individual Grades:");
        for (int i = 0; i < n; i++) {
            int score = marks[i];
            String grade;

            if (score >= 90 && score <= 100) grade = "A";
            else if (score >= 75) grade = "B";
            else if (score >= 60) grade = "C";
            else if (score >= 40) grade = "D";
            else grade = "Fail";

            System.out.println("Student " + (i + 1) + " Marks: " + score + " -> Grade: " + grade);
        }
    }
}
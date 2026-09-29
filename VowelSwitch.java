import java.util.Scanner;

public class VowelSwitch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a character: ");
        char ch = sc.next().toLowerCase().charAt(0);

        switch (ch) {
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
                System.out.println(ch + " is a Vowel.");
                break;
            default:
                if (Character.isLetter(ch)) System.out.println(ch + " is a Consonant.");
                else System.out.println("Not an alphabetic character.");
        }
    }
}
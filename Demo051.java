import java.util.Scanner;

public class Demo051 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int originalNumber = scanner.nextInt();
        int number = originalNumber;
        int reversedNumber = 0;
        while (number != 0) {
            int digit = number % 10;
            reversedNumber = reversedNumber * 10 + digit;
            number /= 10;
        }
        if (originalNumber == reversedNumber) {
            System.out.println(originalNumber + " is a Palindrome number.");
        } else {
            System.out.println(originalNumber + " is not a Palindrome number.");
        }
        scanner.close();
    }
}

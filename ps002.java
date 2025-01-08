import java.util.Scanner;

public class ps002 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        int nextMultipleOfHundred = ((number / 100) + 1) * 100;
        System.out.println("The next multiple of 100 is: " + nextMultipleOfHundred);
        
        scanner.close();
    }
}
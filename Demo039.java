import java.util.Scanner;

public class Demo039 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a character: ");
        char inputChar = scanner.next().charAt(0); 
        
        if (Character.isLowerCase(inputChar)) {
            System.out.println(inputChar + " is a lowercase letter.");
        } else if (Character.isUpperCase(inputChar)) {
            System.out.println(inputChar + " is an uppercase letter.");
        } else if (Character.isDigit(inputChar)) {
            System.out.println(inputChar + " is a digit.");
        } else {
            System.out.println(inputChar + " is neither a letter nor a digit.");
        }
        
        scanner.close();
    }
}


import java.util.Scanner;

public class Demo042 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a lowercase character: ");
        char inputChar = scanner.next().charAt(0); 
        if (Character.isLowerCase(inputChar)) {
            char uppercaseChar = Character.toUpperCase(inputChar);
            System.out.println("The uppercase version of " + inputChar + " is: " + uppercaseChar);
        } else {
            System.out.println(inputChar + " is not a lowercase letter.");
        }
    
        scanner.close();
    }
}

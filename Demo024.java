
import java.util.Scanner;

public class Demo024 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            
            System.out.print("Enter input: ");
            String input = sc.nextLine();
            String reverse = new StringBuilder(input).reverse().toString();

            System.out.println(input);
            System.out.println(reverse);
        }

    }
}
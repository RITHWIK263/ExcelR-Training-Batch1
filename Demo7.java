import java.util.Scanner;

public class Demo7 {

    // Method to calculate the area of a triangle
    public static double calculateArea(double base, double height) {
        return 0.5 * base * height;  // Formula: Area = (1/2) * base * height
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input base and height
        System.out.print("Enter the base of the triangle: ");
        double base = scanner.nextDouble();

        System.out.print("Enter the height of the triangle: ");
        double height = scanner.nextDouble();

        // Calculate and display the area
        double area = calculateArea(base, height);
        System.out.println("The area of the triangle is: " + area);

        scanner.close();
    }
}


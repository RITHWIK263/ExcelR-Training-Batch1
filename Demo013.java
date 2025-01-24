//Java code to find Area of triangle
import java.util.*;
public class Demo013 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter base of triangle: ");
        double base = sc.nextDouble();
        System.out.println("Enter the height of a triangle: ");
        double height = sc.nextDouble();

        double area = 0.5 * base * height;

        System.out.println("Area of triangle is "+area);
    
    }
    
}

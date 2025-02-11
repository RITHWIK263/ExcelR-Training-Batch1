import java.util.Scanner;

public class Demo079 {
    public static void main(String[] args) {
        int[] array = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100};
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the element to search: ");
        int element = scanner.nextInt();
        boolean isFound = false;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == element) {
                isFound = true;
                break;
            }
        }
        if (isFound) {
            System.out.println("Element " + element + " is found in the array.");
        } else {
            System.out.println("Element " + element + " is not found in the array.");
        }
        
        scanner.close();
    }
}


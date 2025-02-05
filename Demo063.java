public class Demo063 {
    public static void main(String[] args) {
        int[] array = {10, 20, 30, 40, 50, 60, 70};
        if (array.length > 0) {
            int sum = array[0] + array[array.length - 1];
            System.out.println("Sum of 1st and last elements: " + sum);
        } else {
            System.out.println("Array is empty.");
        }
    }
}

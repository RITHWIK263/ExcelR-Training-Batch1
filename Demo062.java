public class Demo062 {
    public static void main(String[] args) {
        int[] array = {10, 20, 30, 40, 50, 60, 70};
        if (array.length >= 2) {
            System.out.println("1st element: " + array[0]);
            System.out.println("2nd element: " + array[1]);
            System.out.println("Last element: " + array[array.length - 1]);
        } else {
            System.out.println("Array does not have enough elements.");
        }
    }
}

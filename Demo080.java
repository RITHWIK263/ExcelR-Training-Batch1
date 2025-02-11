public class Demo080 {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 7};
        System.out.print("Original Array: ");
        printArray(array);
        shiftLeft(array);
        System.out.print("Array after left shift: ");
        printArray(array);
    }
    public static void shiftLeft(int[] array) {
        int firstElement = array[0];
        for (int i = 0; i < array.length - 1; i++) {
            array[i] = array[i + 1];
        }
        array[array.length - 1] = firstElement;
    }
    public static void printArray(int[] array) {
        for (int num : array) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}


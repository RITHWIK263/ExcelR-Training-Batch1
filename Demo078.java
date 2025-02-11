public class Demo078 {
    public static void main(String[] args) {
        int start = 1;
        int end = 20;
        System.out.print("Even numbers: ");
        for (int i = start; i <= end; i++) {
            if (i % 2 == 0) {
                System.out.print(i + " ");
            }
        }
        System.out.print("\nOdd numbers: ");
        for (int i = start; i <= end; i++) {
            if (i % 2 != 0) {
                System.out.print(i + " ");
            }
        }
    }
}

public class Demo067 {
    public static void main(String[] args) {
        int[] numbers = {10, 21, 30, 43, 50, 61, 72};
        System.out.println("Even elements in the array:");
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 2 == 0) {
                System.out.println(numbers[i]);
            }
        }
    }
}


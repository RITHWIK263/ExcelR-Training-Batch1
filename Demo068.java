public class Demo068 {
    public static void main(String[] args) {
        int[] numbers = {10, 21, 30, 43, 50, 61, 72};
        int evenCount = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 2 == 0) {
                evenCount++;
            }
        }
        System.out.println("Count of even numbers in the array: " + evenCount);
    }
}

public class Demo081 {
    public static void main(String[] args) {
        int[] array = {16, 17, 4, 3, 5, 2};
        System.out.print("Leader elements: ");
        printLeaders(array);
    }
    public static void printLeaders(int[] array) {
        int n = array.length;
        int maxFromRight = array[n - 1];
        System.out.print(maxFromRight + " ");
        for (int i = n - 2; i >= 0; i--) {
            if (array[i] > maxFromRight) {
                System.out.print(array[i] + " ");
                maxFromRight = array[i];
            }
        }
    }
}

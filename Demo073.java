import java.util.HashSet;

public class Demo073 {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 2, 3, 5, 6, 7, 8, 6};
        HashSet<Integer> uniqueElements = new HashSet<>();
        HashSet<Integer> duplicates = new HashSet<>();
        for (int i = 0; i < array.length; i++) {
            if (!uniqueElements.add(array[i])) {
                duplicates.add(array[i]);
            }
        }
        System.out.println("Duplicate elements in the array: " + duplicates);
    }
}

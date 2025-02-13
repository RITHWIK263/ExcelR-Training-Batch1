import java.util.ArrayList;
import java.util.List;

public class LTCode013 {

    public static int[] wordsContainingChar(String[] words, char x) {
        List<Integer> result = new ArrayList<>();
        for (int i = 0; i < words.length; i++) {
            if (words[i].indexOf(x) != -1) {
                result.add(i);
            }
        }
        int[] resultArray = new int[result.size()];
        for (int i = 0; i < result.size(); i++) {
            resultArray[i] = result.get(i);
        }

        return resultArray;
    }
    public static void main(String[] args) {
        String[] words1 = {"leet", "code"};
        char x1 = 'e';
        int[] result1 = wordsContainingChar(words1, x1);
        System.out.println("Output: " + java.util.Arrays.toString(result1));
        String[] words2 = {"abc", "bcd", "aaaa", "cbc"};
        char x2 = 'a';
        int[] result2 = wordsContainingChar(words2, x2);
        System.out.println("Output: " + java.util.Arrays.toString(result2));
        String[] words3 = {"abc", "bcd", "aaaa", "cbc"};
        char x3 = 'z';
        int[] result3 = wordsContainingChar(words3, x3);
        System.out.println("Output: " + java.util.Arrays.toString(result3));
    }
}


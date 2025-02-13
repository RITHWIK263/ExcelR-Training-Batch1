public class LTCode012 {
    public String longestCommonPrefix(String[] strs) {
        if (strs == null || strs.length == 0) {
            return "";
        }
        String prefix = strs[0];
        for (int i = 1; i < strs.length; i++) {
            while (!strs[i].startsWith(prefix)) {
                prefix = prefix.substring(0, prefix.length() - 1);
                if (prefix.isEmpty()) {
                    return "";
                }
            }
        }

        return prefix;
    }

    public static void main(String[] args) {
        LTCode012 solution = new LTCode012();
        String[] strs1 = {"flower", "flow", "flight"};
        System.out.println("Longest Common Prefix: " + solution.longestCommonPrefix(strs1));
        String[] strs2 = {"dog", "racecar", "car"};
        System.out.println("Longest Common Prefix: " + solution.longestCommonPrefix(strs2));
        String[] strs3 = {"interstellar", "internet", "intermediate"};
        System.out.println("Longest Common Prefix: " + solution.longestCommonPrefix(strs3)); 
        String[] strs4 = {""};
        System.out.println("Longest Common Prefix: " + solution.longestCommonPrefix(strs4));
        String[] strs5 = {"", "hello", "world"};
        System.out.println("Longest Common Prefix: " + solution.longestCommonPrefix(strs5));
    }
}

// Complexity: Time O(n log n), Space O(n)

import java.util.Arrays;

public class ValidAnagramBrute {

    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) return false;

        char[] sArr = s.toCharArray();
        char[] tArr = t.toCharArray();
        Arrays.sort(sArr);
        Arrays.sort(tArr);

        return Arrays.equals(sArr, tArr);
    }

    public static void main(String[] args) {
        ValidAnagramBrute solver = new ValidAnagramBrute();
        System.out.println(solver.isAnagram("anagram", "nagaram")); // true
        System.out.println(solver.isAnagram("rat", "car"));         // false
    }
}

// Complexity: Time O(n log n + m), Space O(1)
// sort the words, then compare startWord and endWord

import java.util.Arrays;

public class LongestCommonPrefixOptimal {

    public String longestCommonPrefix(String[] strs) {
        Arrays.sort(strs);
        String startWord = strs[0];
        String endWord = strs[strs.length - 1];
        int i = 0;

        while (i < startWord.length() && i < endWord.length() && startWord.charAt(i) == endWord.charAt(i)) {
            i++;
        }
        return startWord.substring(0, i);
    }

    public static void main(String[] args) {
        LongestCommonPrefixOptimal solver = new LongestCommonPrefixOptimal();
        System.out.println(solver.longestCommonPrefix(new String[]{"flower","flow","flight"})); // fl
        System.out.println(solver.longestCommonPrefix(new String[]{"dog","racecar","car"}));    // ""
    }
}

// Complexity: Time O(n+m), Space O(1)
// use two indexes and match characters in order

public class IsSubsequenceOptimal {

    public boolean isSubsequence(String s, String t) {
        int i = 0;
        int j = 0;

        while (i < s.length() && j < t.length()) {
            if (s.charAt(i) == t.charAt(j)) {
                i++;
            }
            j++;
        }
        return i == s.length();
    }

    public static void main(String[] args) {
        IsSubsequenceOptimal solver = new IsSubsequenceOptimal();
        System.out.println(solver.isSubsequence("ace", "abcde")); // true
        System.out.println(solver.isSubsequence("aec", "abcde")); // false
    }
}

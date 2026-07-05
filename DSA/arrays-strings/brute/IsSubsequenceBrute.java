// Complexity: Time O(n*m), Space O(1)

public class IsSubsequenceBrute {

    public boolean isSubsequence(String s, String t) {
        int sIndex = 0;

        for (int i = 0; i < t.length() && sIndex < s.length(); i++) {
            if (s.charAt(sIndex) == t.charAt(i)) {
                sIndex++;
            }
        }
        return sIndex == s.length();
    }

    public static void main(String[] args) {
        IsSubsequenceBrute solver = new IsSubsequenceBrute();
        System.out.println(solver.isSubsequence("ace", "abcde")); // true
        System.out.println(solver.isSubsequence("aec", "abcde")); // false
    }
}

// Complexity: Time O(n), Space O(1)
// count up for s, count down for t, all zeros means anagram

public class ValidAnagramOptimal {

    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) return false;

        int[] frequency = new int[26];

        for (int i = 0; i < s.length(); i++) {
            frequency[s.charAt(i) - 'a']++;
            frequency[t.charAt(i) - 'a']--;
        }

        for (int count : frequency) {
            if (count != 0) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        ValidAnagramOptimal solver = new ValidAnagramOptimal();
        System.out.println(solver.isAnagram("anagram", "nagaram")); // true
        System.out.println(solver.isAnagram("rat", "car"));         // false
    }
}

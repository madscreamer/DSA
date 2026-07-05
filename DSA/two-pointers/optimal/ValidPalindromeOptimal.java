// Complexity: Time O(n), Space O(1)
// compare letters from both sides and skip symbols

public class ValidPalindromeOptimal {

    public boolean isPalindrome(String s) {
        int low = 0;
        int high = s.length() - 1;

        while (low < high) {
            while (low < high && !Character.isLetterOrDigit(s.charAt(low))) low++;
            while (low < high && !Character.isLetterOrDigit(s.charAt(high))) high--;

            if (Character.toLowerCase(s.charAt(low)) != Character.toLowerCase(s.charAt(high))) {
                return false;
            }
            low++;
            high--;
        }
        return true;
    }

    public static void main(String[] args) {
        ValidPalindromeOptimal solver = new ValidPalindromeOptimal();
        System.out.println(solver.isPalindrome("A man, a plan, a canal: Panama")); // true
        System.out.println(solver.isPalindrome("race a car")); // false
    }
}

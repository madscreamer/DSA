// Complexity: Time O(n), Space O(n)

public class ValidPalindromeBrute {

    public boolean isPalindrome(String s) {
        StringBuilder cleaned = new StringBuilder();

        for (char c : s.toCharArray()) {
            if (Character.isLetterOrDigit(c)) {
                cleaned.append(Character.toLowerCase(c));
            }
        }

        String forward = cleaned.toString();
        String backward = cleaned.reverse().toString();
        return forward.equals(backward);
    }

    public static void main(String[] args) {
        ValidPalindromeBrute solver = new ValidPalindromeBrute();
        System.out.println(solver.isPalindrome("A man, a plan, a canal: Panama")); // true
        System.out.println(solver.isPalindrome("race a car")); // false
    }
}

// Complexity: Time O(n), Space O(n)

public class ReverseStringBrute {

    public void reverseString(char[] s) {
        char[] copy = s.clone();
        int n = s.length;

        for (int i = 0; i < n; i++) {
            s[i] = copy[n - 1 - i];
        }
    }

    public static void main(String[] args) {
        ReverseStringBrute solver = new ReverseStringBrute();
        char[] s = {'h', 'e', 'l', 'l', 'o'};
        solver.reverseString(s);
        System.out.println(new String(s)); // olleh
    }
}

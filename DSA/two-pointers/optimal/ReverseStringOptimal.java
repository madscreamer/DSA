// Complexity: Time O(n), Space O(1)
// swap characters from both sides

public class ReverseStringOptimal {

    public void reverseString(char[] s) {
        int low = 0;
        int high = s.length - 1;

        while (low < high) {
            char hold = s[low];
            s[low] = s[high];
            s[high] = hold;
            low++;
            high--;
        }
    }

    public static void main(String[] args) {
        ReverseStringOptimal solver = new ReverseStringOptimal();
        char[] s = {'h', 'e', 'l', 'l', 'o'};
        solver.reverseString(s);
        System.out.println(new String(s)); // olleh
    }
}

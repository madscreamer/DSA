// Complexity: Time O(n), Space O(1)
// use frequency array instead of individual variables

public class MaximumNumberOfBalloonsOptimal {

    public int maxNumberOfBalloons(String text) {
        int[] frequency = new int[26];

        for (char c : text.toCharArray()) {
            frequency[c - 'a']++;
        }

        int b = frequency['b' - 'a'];
        int a = frequency['a' - 'a'];
        int l = frequency['l' - 'a'] / 2;
        int o = frequency['o' - 'a'] / 2;
        int n = frequency['n' - 'a'];

        return Math.min(b, Math.min(a, Math.min(l, Math.min(o, n))));
    }

    public static void main(String[] args) {
        MaximumNumberOfBalloonsOptimal solver = new MaximumNumberOfBalloonsOptimal();
        System.out.println(solver.maxNumberOfBalloons("nlaebolko"));        // 1
        System.out.println(solver.maxNumberOfBalloons("loonbalxballpoon")); // 2
    }
}

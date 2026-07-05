// Complexity: Time O(n), Space O(1)

public class MaximumNumberOfBalloonsBrute {

    public int maxNumberOfBalloons(String text) {
        int b = 0, a = 0, l = 0, o = 0, n = 0;

        for (char c : text.toCharArray()) {
            if (c == 'b') b++;
            else if (c == 'a') a++;
            else if (c == 'l') l++;
            else if (c == 'o') o++;
            else if (c == 'n') n++;
        }

        // balloon needs 2 l's and 2 o's so divide those by 2
        return Math.min(b, Math.min(a, Math.min(l / 2, Math.min(o / 2, n))));
    }

    public static void main(String[] args) {
        MaximumNumberOfBalloonsBrute solver = new MaximumNumberOfBalloonsBrute();
        System.out.println(solver.maxNumberOfBalloons("nlaebolko"));        // 1
        System.out.println(solver.maxNumberOfBalloons("loonbalxballpoon")); // 2
    }
}

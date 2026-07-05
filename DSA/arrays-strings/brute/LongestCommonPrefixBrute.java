// Complexity: Time O(n*m), Space O(m)

public class LongestCommonPrefixBrute {

    public String longestCommonPrefix(String[] strs) {
        String common = strs[0];

        for (int i = 1; i < strs.length; i++) {
            // shrink common until it matches the rangeStart of current string
            while (!strs[i].startsWith(common)) {
                common = common.substring(0, common.length() - 1);
                if (common.isEmpty()) return "";
            }
        }
        return common;
    }

    public static void main(String[] args) {
        LongestCommonPrefixBrute solver = new LongestCommonPrefixBrute();
        System.out.println(solver.longestCommonPrefix(new String[]{"flower","flow","flight"})); // fl
        System.out.println(solver.longestCommonPrefix(new String[]{"dog","racecar","car"}));    // ""
    }
}

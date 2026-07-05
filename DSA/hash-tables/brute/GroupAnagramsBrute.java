// Complexity: Time O(n^2 * k), Space O(n*k)

import java.util.*;

public class GroupAnagramsBrute {

    private boolean isAnagram(String a, String b) {
        if (a.length() != b.length()) return false;
        int[] frequency = new int[26];
        for (char c : a.toCharArray()) frequency[c - 'a']++;
        for (char c : b.toCharArray()) frequency[c - 'a']--;
        for (int f : frequency) if (f != 0) return false;
        return true;
    }

    public List<List<String>> groupAnagrams(String[] strs) {
        boolean[] visited = new boolean[strs.length];
        List<List<String>> answer = new ArrayList<>();

        for (int i = 0; i < strs.length; i++) {
            if (visited[i]) continue;
            List<String> group = new ArrayList<>();
            group.add(strs[i]);
            visited[i] = true;

            for (int j = i + 1; j < strs.length; j++) {
                if (!visited[j] && isAnagram(strs[i], strs[j])) {
                    group.add(strs[j]);
                    visited[j] = true;
                }
            }
            answer.add(group);
        }
        return answer;
    }

    public static void main(String[] args) {
        GroupAnagramsBrute solver = new GroupAnagramsBrute();
        System.out.println(solver.groupAnagrams(new String[]{"eat","tea","tan","ate","nat","bat"}));
    }
}

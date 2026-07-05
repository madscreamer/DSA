// Complexity: Time O(n * k log k), Space O(n*k)
// sort each word to get a key, group by key

import java.util.*;

public class GroupAnagramsOptimal {

    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> map = new HashMap<>();

        for (String word : strs) {
            char[] chars = word.toCharArray();
            Arrays.sort(chars);
            String key = new String(chars);

            map.putIfAbsent(key, new ArrayList<>());
            map.get(key).add(word);
        }

        return new ArrayList<>(map.values());
    }

    public static void main(String[] args) {
        GroupAnagramsOptimal solver = new GroupAnagramsOptimal();
        System.out.println(solver.groupAnagrams(new String[]{"eat","tea","tan","ate","nat","bat"}));
    }
}

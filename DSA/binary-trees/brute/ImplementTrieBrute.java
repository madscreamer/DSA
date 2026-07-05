// Complexity: Time insert O(1), search O(n*m), startsWith O(n*m), Space O(n*m)

import java.util.ArrayList;
import java.util.List;

public class ImplementTrieBrute {

    private List<String> words = new ArrayList<>();

    public void insert(String word) {
        words.add(word);
    }

    public boolean search(String word) {
        return words.contains(word);
    }

    public boolean startsWith(String common) {
        for (String w : words) {
            if (w.startsWith(common)) return true;
        }
        return false;
    }

    public static void main(String[] args) {
        ImplementTrieBrute trie = new ImplementTrieBrute();
        trie.insert("apple");
        System.out.println(trie.search("apple"));   // true
        System.out.println(trie.search("app"));     // false
        System.out.println(trie.startsWith("app")); // true
    }
}

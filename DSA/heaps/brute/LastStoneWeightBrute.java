// Complexity: Time O(n^2 log n), Space O(n)

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class LastStoneWeightBrute {

    public int lastStoneWeight(int[] stones) {
        List<Integer> list = new ArrayList<>();
        for (int s : stones) list.add(s);

        while (list.size() > 1) {
            Collections.sort(list);
            int n = list.size();
            int y = list.get(n - 1);
            int x = list.get(n - 2);
            list.remove(n - 1);
            list.remove(n - 2);
            if (x != y) list.add(y - x);
        }

        return list.isEmpty() ? 0 : list.get(0);
    }

    public static void main(String[] args) {
        LastStoneWeightBrute solver = new LastStoneWeightBrute();
        System.out.println(solver.lastStoneWeight(new int[]{2, 7, 4, 1, 8, 1})); // 1
    }
}

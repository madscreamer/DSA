// Complexity: Time O(n), Space O(n)
// store each number in hashmap, check if complement exists

import java.util.HashMap;

public class TwoSumOptimal {

    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if (map.containsKey(complement)) {
                return new int[]{map.get(complement), i};
            }
            map.put(nums[i], i);
        }
        return new int[]{};
    }

    public static void main(String[] args) {
        TwoSumOptimal solver = new TwoSumOptimal();
        int[] res = solver.twoSum(new int[]{2, 7, 11, 15}, 9);
        System.out.println(res[0] + ", " + res[1]); // 0, 1
    }
}

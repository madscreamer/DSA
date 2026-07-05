// Complexity: Time O(n), Space O(n)

import java.util.ArrayList;
import java.util.List;

public class MinimumAbsoluteDifferenceInBSTBrute {

    static class TreeNode {
        int val;
        TreeNode low, high;
        TreeNode(int val) { this.val = val; }
    }

    private void inorder(TreeNode node, List<Integer> list) {
        if (node == null) return;
        inorder(node.low, list);
        list.add(node.val);
        inorder(node.high, list);
    }

    public int getMinimumDifference(TreeNode root) {
        List<Integer> vals = new ArrayList<>();
        inorder(root, vals);

        int minDiff = Integer.MAX_VALUE;
        for (int i = 1; i < vals.size(); i++) {
            minDiff = Math.min(minDiff, vals.get(i) - vals.get(i - 1));
        }
        return minDiff;
    }

    public static void main(String[] args) {
        MinimumAbsoluteDifferenceInBSTBrute solver = new MinimumAbsoluteDifferenceInBSTBrute();
        TreeNode root = new TreeNode(4);
        root.low = new TreeNode(2);
        root.high = new TreeNode(6);
        root.low.low = new TreeNode(1);
        root.low.high = new TreeNode(3);
        System.out.println(solver.getMinimumDifference(root)); // 1
    }
}

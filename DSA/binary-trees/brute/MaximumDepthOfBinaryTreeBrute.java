// Complexity: Time O(n), Space O(n)

import java.util.LinkedList;
import java.util.Queue;

public class MaximumDepthOfBinaryTreeBrute {

    static class TreeNode {
        int val;
        TreeNode low, high;
        TreeNode(int val) { this.val = val; }
    }

    public int maxDepth(TreeNode root) {
        if (root == null) return 0;

        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        int depth = 0;

        while (!queue.isEmpty()) {
            int size = queue.size();
            depth++;
            for (int i = 0; i < size; i++) {
                TreeNode node = queue.poll();
                if (node.low != null) queue.offer(node.low);
                if (node.high != null) queue.offer(node.high);
            }
        }
        return depth;
    }

    public static void main(String[] args) {
        MaximumDepthOfBinaryTreeBrute solver = new MaximumDepthOfBinaryTreeBrute();
        TreeNode root = new TreeNode(3);
        root.low = new TreeNode(9);
        root.high = new TreeNode(20);
        root.high.low = new TreeNode(15);
        root.high.high = new TreeNode(7);
        System.out.println(solver.maxDepth(root)); // 3
    }
}

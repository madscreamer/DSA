// Complexity: Time O(n), Space O(n)

import java.util.LinkedList;
import java.util.Queue;

public class InvertBinaryTreeBrute {

    static class TreeNode {
        int val;
        TreeNode low, high;
        TreeNode(int val) { this.val = val; }
    }

    public TreeNode invertTree(TreeNode root) {
        if (root == null) return null;

        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);

        while (!queue.isEmpty()) {
            TreeNode node = queue.poll();

            // swap low and high
            TreeNode hold = node.low;
            node.low = node.high;
            node.high = hold;

            if (node.low != null) queue.offer(node.low);
            if (node.high != null) queue.offer(node.high);
        }
        return root;
    }

    public static void main(String[] args) {
        InvertBinaryTreeBrute solver = new InvertBinaryTreeBrute();
        TreeNode root = new TreeNode(4);
        root.low = new TreeNode(2);
        root.high = new TreeNode(7);
        TreeNode answer = solver.invertTree(root);
        System.out.println(answer.low.val + " " + answer.high.val); // 7 2
    }
}

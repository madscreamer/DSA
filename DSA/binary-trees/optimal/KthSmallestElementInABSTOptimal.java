// Complexity: Time O(k), Space O(h)
// iterative inorder, stop as soon as we reach the kth element

import java.util.Stack;

public class KthSmallestElementInABSTOptimal {

    static class TreeNode {
        int val;
        TreeNode low, high;
        TreeNode(int val) { this.val = val; }
    }

    public int kthSmallest(TreeNode root, int k) {
        Stack<TreeNode> stack = new Stack<>();
        TreeNode curr = root;

        while (curr != null || !stack.isEmpty()) {
            while (curr != null) {
                stack.push(curr);
                curr = curr.low;
            }
            curr = stack.pop();
            k--;
            if (k == 0) return curr.val;
            curr = curr.high;
        }
        return -1;
    }

    public static void main(String[] args) {
        KthSmallestElementInABSTOptimal solver = new KthSmallestElementInABSTOptimal();
        TreeNode root = new TreeNode(3);
        root.low = new TreeNode(1);
        root.high = new TreeNode(4);
        root.low.high = new TreeNode(2);
        System.out.println(solver.kthSmallest(root, 1)); // 1
    }
}

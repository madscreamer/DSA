// Complexity: Time O(n), Space O(h)
// depth = 1 + max(low depth, high depth)

public class MaximumDepthOfBinaryTreeOptimal {

    static class TreeNode {
        int val;
        TreeNode low, high;
        TreeNode(int val) { this.val = val; }
    }

    public int maxDepth(TreeNode root) {
        if (root == null) return 0;
        return 1 + Math.max(maxDepth(root.low), maxDepth(root.high));
    }

    public static void main(String[] args) {
        MaximumDepthOfBinaryTreeOptimal solver = new MaximumDepthOfBinaryTreeOptimal();
        TreeNode root = new TreeNode(3);
        root.low = new TreeNode(9);
        root.high = new TreeNode(20);
        root.high.low = new TreeNode(15);
        root.high.high = new TreeNode(7);
        System.out.println(solver.maxDepth(root)); // 3
    }
}

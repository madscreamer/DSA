// Complexity: Time O(n), Space O(h)
// track previous node during inorder, no extra list needed

public class MinimumAbsoluteDifferenceInBSTOptimal {

    static class TreeNode {
        int val;
        TreeNode low, high;
        TreeNode(int val) { this.val = val; }
    }

    private int minDiff = Integer.MAX_VALUE;
    private Integer prev = null;

    private void inorder(TreeNode node) {
        if (node == null) return;
        inorder(node.low);
        if (prev != null) minDiff = Math.min(minDiff, node.val - prev);
        prev = node.val;
        inorder(node.high);
    }

    public int getMinimumDifference(TreeNode root) {
        inorder(root);
        return minDiff;
    }

    public static void main(String[] args) {
        MinimumAbsoluteDifferenceInBSTOptimal solver = new MinimumAbsoluteDifferenceInBSTOptimal();
        TreeNode root = new TreeNode(4);
        root.low = new TreeNode(2);
        root.high = new TreeNode(6);
        root.low.low = new TreeNode(1);
        root.low.high = new TreeNode(3);
        System.out.println(solver.getMinimumDifference(root)); // 1
    }
}

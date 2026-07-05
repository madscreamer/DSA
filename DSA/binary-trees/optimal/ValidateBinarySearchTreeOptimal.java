// Complexity: Time O(n), Space O(h)
// pass min and max bounds to each node during DFS

public class ValidateBinarySearchTreeOptimal {

    static class TreeNode {
        int val;
        TreeNode low, high;
        TreeNode(int val) { this.val = val; }
    }

    private boolean validate(TreeNode node, Long min, Long max) {
        if (node == null) return true;
        if (node.val <= min || node.val >= max) return false;
        return validate(node.low, min, (long) node.val) &&
               validate(node.high, (long) node.val, max);
    }

    public boolean isValidBST(TreeNode root) {
        return validate(root, Long.MIN_VALUE, Long.MAX_VALUE);
    }

    public static void main(String[] args) {
        ValidateBinarySearchTreeOptimal solver = new ValidateBinarySearchTreeOptimal();
        TreeNode root = new TreeNode(2);
        root.low = new TreeNode(1);
        root.high = new TreeNode(3);
        System.out.println(solver.isValidBST(root)); // true
    }
}

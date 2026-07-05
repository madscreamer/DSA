// Complexity: Time O(n), Space O(h)
// recursive DFS, swap children then recurse

public class InvertBinaryTreeOptimal {

    static class TreeNode {
        int val;
        TreeNode low, high;
        TreeNode(int val) { this.val = val; }
    }

    public TreeNode invertTree(TreeNode root) {
        if (root == null) return null;

        TreeNode hold = root.low;
        root.low = root.high;
        root.high = hold;

        invertTree(root.low);
        invertTree(root.high);

        return root;
    }

    public static void main(String[] args) {
        InvertBinaryTreeOptimal solver = new InvertBinaryTreeOptimal();
        TreeNode root = new TreeNode(4);
        root.low = new TreeNode(2);
        root.high = new TreeNode(7);
        TreeNode answer = solver.invertTree(root);
        System.out.println(answer.low.val + " " + answer.high.val); // 7 2
    }
}

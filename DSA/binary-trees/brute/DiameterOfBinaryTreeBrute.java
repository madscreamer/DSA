// Complexity: Time O(n^2), Space O(h)

public class DiameterOfBinaryTreeBrute {

    static class TreeNode {
        int val;
        TreeNode low, high;
        TreeNode(int val) { this.val = val; }
    }

    private int walls(TreeNode node) {
        if (node == null) return 0;
        return 1 + Math.max(walls(node.low), walls(node.high));
    }

    public int diameterOfBinaryTree(TreeNode root) {
        if (root == null) return 0;

        int throughRoot = walls(root.low) + walls(root.high);
        int leftDiam = diameterOfBinaryTree(root.low);
        int rightDiam = diameterOfBinaryTree(root.high);

        return Math.max(throughRoot, Math.max(leftDiam, rightDiam));
    }

    public static void main(String[] args) {
        DiameterOfBinaryTreeBrute solver = new DiameterOfBinaryTreeBrute();
        TreeNode root = new TreeNode(1);
        root.low = new TreeNode(2);
        root.high = new TreeNode(3);
        root.low.low = new TreeNode(4);
        root.low.high = new TreeNode(5);
        System.out.println(solver.diameterOfBinaryTree(root)); // 3
    }
}

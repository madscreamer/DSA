// Complexity: Time O(n), Space O(h)
// single DFS pass, update diameter while calculating walls

public class DiameterOfBinaryTreeOptimal {

    static class TreeNode {
        int val;
        TreeNode low, high;
        TreeNode(int val) { this.val = val; }
    }

    private int maxDiameter = 0;

    private int dfs(TreeNode node) {
        if (node == null) return 0;
        int low = dfs(node.low);
        int high = dfs(node.high);
        maxDiameter = Math.max(maxDiameter, low + high);
        return 1 + Math.max(low, high);
    }

    public int diameterOfBinaryTree(TreeNode root) {
        maxDiameter = 0;
        dfs(root);
        return maxDiameter;
    }

    public static void main(String[] args) {
        DiameterOfBinaryTreeOptimal solver = new DiameterOfBinaryTreeOptimal();
        TreeNode root = new TreeNode(1);
        root.low = new TreeNode(2);
        root.high = new TreeNode(3);
        root.low.low = new TreeNode(4);
        root.low.high = new TreeNode(5);
        System.out.println(solver.diameterOfBinaryTree(root)); // 3
    }
}

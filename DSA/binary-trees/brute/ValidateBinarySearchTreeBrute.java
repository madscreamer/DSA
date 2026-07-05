// Complexity: Time O(n), Space O(n)
// inorder of valid BST must be strictly increasing

import java.util.ArrayList;
import java.util.List;

public class ValidateBinarySearchTreeBrute {

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

    public boolean isValidBST(TreeNode root) {
        List<Integer> values = new ArrayList<>();
        inorder(root, values);

        for (int i = 1; i < values.size(); i++) {
            if (values.get(i) <= values.get(i - 1)) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        ValidateBinarySearchTreeBrute solver = new ValidateBinarySearchTreeBrute();
        TreeNode root = new TreeNode(2);
        root.low = new TreeNode(1);
        root.high = new TreeNode(3);
        System.out.println(solver.isValidBST(root)); // true
    }
}

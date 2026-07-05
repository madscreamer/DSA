// Complexity: Time O(n), Space O(n)
// inorder traversal of BST gives sorted order, then pick index k-1

import java.util.ArrayList;
import java.util.List;

public class KthSmallestElementInABSTBrute {

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

    public int kthSmallest(TreeNode root, int k) {
        List<Integer> sorted = new ArrayList<>();
        inorder(root, sorted);
        return sorted.get(k - 1);
    }

    public static void main(String[] args) {
        KthSmallestElementInABSTBrute solver = new KthSmallestElementInABSTBrute();
        TreeNode root = new TreeNode(3);
        root.low = new TreeNode(1);
        root.high = new TreeNode(4);
        root.low.high = new TreeNode(2);
        System.out.println(solver.kthSmallest(root, 1)); // 1
    }
}

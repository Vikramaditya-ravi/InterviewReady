/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
       public static int count;
    public int preOrder2(TreeNode root) {
        if (root == null) {
            return 0;
        }
        return (1 + preOrder2(root.left) + preOrder2(root.right));
    }

    public int preOrder(TreeNode root) {
        if (root == null) {
            return 0;
        }
        int sum = root.val + preOrder(root.left) + preOrder(root.right);
        int size = preOrder2(root);
        if (sum / size == root.val) {
            count++;
        }

        return sum;

    }

    public int averageOfSubtree(TreeNode root) {
        count = 0;
        preOrder(root);
        return count;

    }
}
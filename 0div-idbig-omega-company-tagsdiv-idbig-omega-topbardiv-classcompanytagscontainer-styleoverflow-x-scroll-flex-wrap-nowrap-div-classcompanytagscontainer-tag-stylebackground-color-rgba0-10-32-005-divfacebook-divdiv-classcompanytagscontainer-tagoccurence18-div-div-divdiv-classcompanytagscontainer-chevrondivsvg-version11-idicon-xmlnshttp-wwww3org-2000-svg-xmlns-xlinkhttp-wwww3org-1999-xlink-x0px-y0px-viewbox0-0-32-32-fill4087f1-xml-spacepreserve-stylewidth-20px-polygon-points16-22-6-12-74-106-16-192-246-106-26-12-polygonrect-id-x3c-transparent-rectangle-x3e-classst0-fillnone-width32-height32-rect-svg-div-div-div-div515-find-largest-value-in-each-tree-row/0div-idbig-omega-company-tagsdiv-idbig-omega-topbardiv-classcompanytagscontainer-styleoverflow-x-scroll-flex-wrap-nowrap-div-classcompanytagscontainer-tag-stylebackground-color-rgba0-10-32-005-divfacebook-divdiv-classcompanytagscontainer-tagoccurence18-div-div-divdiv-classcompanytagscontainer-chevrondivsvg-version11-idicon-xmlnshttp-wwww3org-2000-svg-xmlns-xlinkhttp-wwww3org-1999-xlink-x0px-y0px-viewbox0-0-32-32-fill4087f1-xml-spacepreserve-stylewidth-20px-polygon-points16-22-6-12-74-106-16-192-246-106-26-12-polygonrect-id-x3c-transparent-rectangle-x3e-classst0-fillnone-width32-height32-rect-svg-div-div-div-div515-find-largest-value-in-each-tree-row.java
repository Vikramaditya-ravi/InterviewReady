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
    public List<Integer> largestValues(TreeNode root) {
        List<Integer> res = new ArrayList<>();
        Queue<TreeNode> queue = new LinkedList<>();
        if (root != null) {
            queue.offer(root);
        }

        while (!queue.isEmpty()) {

            int max = Integer.MIN_VALUE;
            int n = queue.size();
            for (int i = 0; i < n; i++) {
                TreeNode temp = queue.poll();
                if (temp.left != null) {
                    queue.offer(temp.left);
                }
                if (temp.right != null) {
                    queue.offer(temp.right);
                }
                max = Math.max(max,temp.val);
            }
            res.add(max);
        }
        return res;
    }
}
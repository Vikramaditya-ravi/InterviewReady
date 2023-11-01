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
   public int[] findMode(TreeNode root) {
        HashMap<Integer, Integer> map = new HashMap<>();
        List<Integer> list = new ArrayList<>();
        preorder(root,map);
        int max = Integer.MIN_VALUE;
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue() > max) {
                list.clear();
                list.add(entry.getKey());
                max = entry.getValue();            }
           else if (entry.getValue() == max) {
                list.add(entry.getKey());
            }
        }
        int n = list.size();
        int[] res  = new int[n];
        for (int i = 0; i < n; i++) {
            res[i] = list.get(i);
        }
        return res;
    }

    public void preorder(TreeNode root, HashMap<Integer, Integer> map) {
        if (root == null) {
            return;
        }
        int temp = root.val;
        map.put(temp, map.getOrDefault(temp, 0) + 1);
        preorder(root.left, map);
        preorder(root.right, map);

    }
}
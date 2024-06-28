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
     public void preorderTraversal(TreeNode root,Set<Integer> set){
         if(root == null){
             return;
         }
         set.add(root.val);
         preorderTraversal(root.left,set);
         preorderTraversal(root.right,set);
         
     }
    public int findSecondMinimumValue(TreeNode root) {
        
        Set<Integer> set = new TreeSet<>();
        preorderTraversal(root, set);
        if(set.size() <= 0){
            return -1;
        }
        Iterator<Integer> iterator = set.iterator();
            int count = 0;
            while (iterator.hasNext()) {
                count++;
                int result = iterator.next();
                if (count == 2) {
                    return result;
                }
            }
            return -1;
        
        
    }
}
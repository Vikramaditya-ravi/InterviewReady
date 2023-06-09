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
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
       List<List<Integer>>result= new ArrayList<>();
         if(root == null){
             return result;
         }

         Queue<TreeNode> queue = new LinkedList<>();
         queue.offer(root);

         while (!queue.isEmpty()){
             List<Integer> temp = new ArrayList<>();
             int levelNum = queue.size();

             for (int i = 0; i < levelNum; i++) {
                 if(queue.peek().left != null){
                     queue.offer(queue.peek().left);
                 }
                 if(queue.peek().right != null){
                     queue.offer(queue.peek().right);
                 }
                 temp.add(queue.poll().val);
             }
             result.add(0,temp);
         }
         return result; 
    }
}
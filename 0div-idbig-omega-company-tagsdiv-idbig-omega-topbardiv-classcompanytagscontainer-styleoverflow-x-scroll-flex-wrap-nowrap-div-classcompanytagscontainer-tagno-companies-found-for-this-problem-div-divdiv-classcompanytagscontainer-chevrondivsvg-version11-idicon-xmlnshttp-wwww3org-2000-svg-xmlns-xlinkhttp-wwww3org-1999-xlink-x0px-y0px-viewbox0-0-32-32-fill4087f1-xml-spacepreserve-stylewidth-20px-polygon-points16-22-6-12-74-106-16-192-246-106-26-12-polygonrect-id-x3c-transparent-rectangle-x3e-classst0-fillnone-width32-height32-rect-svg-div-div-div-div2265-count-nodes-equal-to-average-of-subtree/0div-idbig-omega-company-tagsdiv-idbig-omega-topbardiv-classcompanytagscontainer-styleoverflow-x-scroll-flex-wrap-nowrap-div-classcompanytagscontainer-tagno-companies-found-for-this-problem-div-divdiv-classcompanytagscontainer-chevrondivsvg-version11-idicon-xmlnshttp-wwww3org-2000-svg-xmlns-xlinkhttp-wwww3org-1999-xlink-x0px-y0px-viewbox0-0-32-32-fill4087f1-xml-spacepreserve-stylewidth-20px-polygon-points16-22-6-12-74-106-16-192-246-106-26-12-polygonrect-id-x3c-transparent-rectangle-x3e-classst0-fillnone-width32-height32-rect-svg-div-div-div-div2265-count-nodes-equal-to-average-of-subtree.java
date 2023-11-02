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
       public int count;
    public int preOrder(TreeNode root, HashMap<TreeNode, int[]> map) {

        if (root.left == null && root.right == null) {
            map.put(root, new int[]{1, root.val});
        }
        if (root.left != null){            
                preOrder(root.left,map);            
        }
        if (root.right != null){
            preOrder(root.right,map);            
        }      
        
        if (map.containsKey(root.left) && map.containsKey(root.right)){
            map.put(root, new int[]{
                        1 + map.get(root.left)[0] + map.get(root.right)[0],
                        root.val + map.get(root.left)[1] + map.get(root.right)[1]
                });            
        }else           
        if (map.containsKey(root.left)){
            map.put(root, new int[]{1 + map.get(root.left)[0], map.get(root.left)[1] + root.val});
            
        }else 
        if (map.containsKey(root.right)){
            map.put(root, new int[]{1 + map.get(root.right)[0], map.get(root.right)[1] + root.val});
            
        }         
        if (map.get(root)[1] / map.get(root)[0] == root.val) {
            count++;
        }
        return count;       
       


        
//        root.val = root.val + preOrder(root.left) + preOrder(root.right);
//        int size = preOrder2(root);
//        if (sum / size == root.val) {
//            count++;
//        }
//        return sum;

    }

    public int averageOfSubtree(TreeNode root) {
        HashMap<TreeNode, int[]> map = new HashMap<>();
        count = 0;
        preOrder(root, map);
        return count;
    }
}
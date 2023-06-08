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
    public TreeNode buildTree(int[] inorder, int[] postorder) {
        if(inorder.length != postorder.length){
            return null;
        }
        HashMap<Integer,Integer> hashMap = new HashMap<>();
        for (int i = 0; i < inorder.length; i++) {
            hashMap.put(inorder[i],i);
        }

        return utility(inorder,0,inorder.length-1,
                postorder,0, postorder.length -1,hashMap);

    }

    public TreeNode utility(int[] inorder,int is,int ie,
                            int[] postorder,int ps,int pe,HashMap<Integer,Integer> hashMap){

        if(is > ie || ps > pe){
            return null;
        }
        TreeNode root= new TreeNode(postorder[pe]);
        int inRoot =  hashMap.get(postorder[pe]);

        int nusleft = inRoot - is;

        root.left = utility(inorder,is,inRoot-1,postorder,ps,ps+nusleft-1,hashMap);
        root.right = utility(inorder,inRoot+1,ie,postorder,ps+nusleft,pe -1,hashMap) ;

        return root;


    }
}
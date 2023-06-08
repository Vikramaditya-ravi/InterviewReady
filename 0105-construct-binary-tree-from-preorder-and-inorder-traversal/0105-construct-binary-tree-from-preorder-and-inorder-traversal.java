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
       public TreeNode buildTree(int[] preorder, int[] inorder) {
        HashMap<Integer, Integer> hashMap = new HashMap<>();

        for (int i = 0; i < inorder.length; i++) {
            hashMap.put(inorder[i], i);
        }

        TreeNode root = buildTreeUtility(preorder, 0, preorder.length - 1,
                inorder, 0, inorder.length - 1, hashMap);
        return root;


    }

    public TreeNode buildTreeUtility(int[] preorder, int preS, int preE,
                                     int[] inorder, int inS, int inE, HashMap<Integer, Integer> hashMap) {

        if (preS > preE || inS > inE) {
            return null;
        }
        TreeNode root = new TreeNode(preorder[preS]);
        int inRoot = hashMap.get(root.val);

        int numsleft = inRoot - inS;

        root.left =buildTreeUtility(preorder,preS+1,preS+numsleft,
                inorder,inS,inRoot-1,hashMap
                );
        root.right =buildTreeUtility(preorder,preS+numsleft+1,preE,inorder,inRoot+1,inE,hashMap);
        return root;


    }
}
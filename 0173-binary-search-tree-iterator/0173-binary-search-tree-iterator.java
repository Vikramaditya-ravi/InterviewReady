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
class BSTIterator {

    List<TreeNode> list = new ArrayList<>();
    int index = -1;

    public void InorderTraversal(TreeNode root) {
        if (root == null) {
            return;
        }
        InorderTraversal(root.left);
        list.add(root);
        InorderTraversal(root.right);
    }


    public BSTIterator(TreeNode root) {
        InorderTraversal(root);

    }

    public int next() {
        index++;
        return list.get(index).val;

    }

    public boolean hasNext() {
        if(index+1>= list.size()){
            return false;
        }
        else {
            return true;
        }

    }
}

/**
 * Your BSTIterator object will be instantiated and called as such:
 * BSTIterator obj = new BSTIterator(root);
 * int param_1 = obj.next();
 * boolean param_2 = obj.hasNext();
 */
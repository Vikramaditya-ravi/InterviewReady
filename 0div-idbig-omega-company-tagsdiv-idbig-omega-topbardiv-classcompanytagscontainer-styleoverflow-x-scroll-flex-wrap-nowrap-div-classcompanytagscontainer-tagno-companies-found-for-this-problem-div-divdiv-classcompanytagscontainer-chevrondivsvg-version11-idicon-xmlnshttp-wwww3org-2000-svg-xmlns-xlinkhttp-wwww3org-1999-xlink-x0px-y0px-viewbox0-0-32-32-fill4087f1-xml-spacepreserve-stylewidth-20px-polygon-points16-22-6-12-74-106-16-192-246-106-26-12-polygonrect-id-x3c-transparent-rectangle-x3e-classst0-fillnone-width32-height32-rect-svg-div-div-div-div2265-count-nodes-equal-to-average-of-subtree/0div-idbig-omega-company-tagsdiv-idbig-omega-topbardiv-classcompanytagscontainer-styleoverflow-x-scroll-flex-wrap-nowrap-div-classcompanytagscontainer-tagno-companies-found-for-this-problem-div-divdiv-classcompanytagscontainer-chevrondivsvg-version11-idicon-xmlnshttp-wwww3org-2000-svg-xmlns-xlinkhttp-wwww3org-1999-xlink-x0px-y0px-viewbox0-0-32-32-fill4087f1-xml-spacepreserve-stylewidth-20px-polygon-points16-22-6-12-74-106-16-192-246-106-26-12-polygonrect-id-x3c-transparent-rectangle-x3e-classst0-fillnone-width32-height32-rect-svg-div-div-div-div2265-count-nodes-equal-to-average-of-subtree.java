class Solution {
       public int count;
       public int[] preOrderArray(TreeNode root) {
          
    if (root == null) {
            return new int[]{0, 0};
        }
        
        int[] nums = new int[2];
        int[] left = preOrderArray(root.left);
        int[] right = preOrderArray(root.right);
        
        nums[0] = left[0] + right[0] + root.val;
        nums[1] = left[1] + right[1] + 1;

        if (nums[1] != 0 && nums[0] / nums[1] == root.val) {
            count++;
        }
        return nums;

    }

    public int averageOfSubtree(TreeNode root) {
        count = 0;
        preOrderArray(root);
        return count;
    }
}
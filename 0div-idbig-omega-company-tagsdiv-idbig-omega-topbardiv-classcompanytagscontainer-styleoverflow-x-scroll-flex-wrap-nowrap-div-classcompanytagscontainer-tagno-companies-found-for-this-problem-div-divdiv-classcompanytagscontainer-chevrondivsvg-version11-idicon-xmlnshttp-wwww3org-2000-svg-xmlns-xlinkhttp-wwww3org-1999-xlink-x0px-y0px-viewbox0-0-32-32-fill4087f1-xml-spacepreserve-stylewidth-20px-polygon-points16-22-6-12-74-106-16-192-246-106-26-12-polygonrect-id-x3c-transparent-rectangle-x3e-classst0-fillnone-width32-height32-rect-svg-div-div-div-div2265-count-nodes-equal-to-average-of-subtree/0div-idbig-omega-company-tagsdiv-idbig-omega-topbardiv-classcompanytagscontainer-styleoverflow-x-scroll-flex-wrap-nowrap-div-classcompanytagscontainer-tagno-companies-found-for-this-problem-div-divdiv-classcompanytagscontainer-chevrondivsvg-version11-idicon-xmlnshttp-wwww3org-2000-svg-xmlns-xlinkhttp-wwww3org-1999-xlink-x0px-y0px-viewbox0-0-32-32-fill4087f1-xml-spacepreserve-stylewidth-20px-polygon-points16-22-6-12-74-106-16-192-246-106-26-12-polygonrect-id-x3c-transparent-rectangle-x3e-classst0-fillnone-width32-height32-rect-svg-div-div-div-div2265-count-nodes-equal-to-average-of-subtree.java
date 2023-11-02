class Solution {
       public int count;
       public int[] preOrderArray(TreeNode root) {
        int[] nums = new int[2];
        if (root.left == null && root.right == null) {
            nums[0] = root.val;
            nums[1] = 1;
        }


        if (root.left != null && root.right != null) {
            int[] left = preOrderArray(root.left);
            int[] right = preOrderArray(root.right);
            nums[0] = left[0] + right[0] + root.val;
            nums[1] = left[1] + right[1] + 1;

        } else if (root.left != null) {
            int[] left = preOrderArray(root.left);
            nums[0] = left[0] + root.val;
            nums[1] = left[1] + 1;

        } else if (root.right != null) {
            int[] right = preOrderArray(root.right);
            nums[0] = right[0] + root.val;
            nums[1] = right[1] + 1;
        }
        if (nums[0] / nums[1] == root.val) {
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
public class MaximumInBinaryTree {
    public int findMax(TreeNode root) {
        if (root == null) {
            return Integer.MIN_VALUE;
        }
        int max = root.val;
        int leftMax = findMax(root.left);
        int rightMax = findMax(root.right);
        if (leftMax > max) {
            max = leftMax;
        }
        if (rightMax > max) {
            max = rightMax;
        }
        return max;
    }
}
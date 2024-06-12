public class MinimumTree {
    public Integer findMin(TreeNode root) {
        if (root == null) {
            return null;
        }
        int min = root.val;
        int leftMin = findMin(root.left);
        int rightMin = findMin(root.right);
        if (leftMin < min) {
            min = leftMin;
        }
        if (rightMin < min) {
            min = rightMin;
        }
        return min;
    }
}
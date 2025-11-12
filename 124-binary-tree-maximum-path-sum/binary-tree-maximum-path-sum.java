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
    int maxSum = Integer.MIN_VALUE;
    public int maxGain(TreeNode root) {
        if(root == null)return 0;
        int leftGain = maxGain(root.left);
        int rightGain = maxGain(root.right);
        int pathSum = leftGain + root.val + rightGain;
        maxSum = Math.max(maxSum, pathSum);
        int largestSum = root.val + Math.max(leftGain, rightGain);
        if(largestSum < 0)return 0;
        return largestSum;
    }
    public int maxPathSum(TreeNode root) {
        maxGain(root);
        return maxSum;
    }
}
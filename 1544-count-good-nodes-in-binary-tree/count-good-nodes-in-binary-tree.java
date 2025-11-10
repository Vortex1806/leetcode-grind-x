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
    int ans = 0;

    public void countNodes(TreeNode node, int maxVal) {
        if(node.val >= maxVal) ans++;
        maxVal = Math.max(maxVal, node.val);
        if(node.left != null) countNodes(node.left, maxVal);
        if(node.right != null) countNodes(node.right, maxVal);
    }

    public int goodNodes(TreeNode root) {
        if(root == null) return ans;
        countNodes(root, Integer.MIN_VALUE);
        return ans;
    }
}
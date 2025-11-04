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
    public int maxDepth(TreeNode root) {
        if(root == null)return 0;
        return maxDepthNode(root, 1, 1);
    }

    private int maxDepthNode(TreeNode node, int maxd, int curd) {
        if(node == null) return maxd;
        int maxDleft = maxDepthNode(node.left, Math.max(maxd, curd), curd+1);
        int maxDright = maxDepthNode(node.right, Math.max(maxd, curd), curd+1);
        return Math.max(maxDleft, maxDright);
    }
}
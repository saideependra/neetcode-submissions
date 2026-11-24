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
    public int maxSum;
    public int maxPathSum(TreeNode root) {
        maxSum = Integer.MIN_VALUE;
        gain(root);
        return maxSum;
    }

    public int gain(TreeNode node){
        if(node == null){
            return 0;
        }

        int left = Math.max(0,gain(node.left));
        int right = Math.max(0,gain(node.right));

        maxSum = Math.max(maxSum, node.val+left+right);

        return node.val + Math.max(left,right);
    }
}

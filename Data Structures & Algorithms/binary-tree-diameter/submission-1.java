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
    int dm = 0;
    public int diameterOfBinaryTree(TreeNode root) {
        height(root);
        return dm;
    }
    int height(TreeNode root){
        if(root == null) return 0;

        int ld = height(root.left);
        int rd = height(root.right);

        dm = Math.max(dm, ld+rd);

        return 1 + Math.max(ld, rd);
    }
}

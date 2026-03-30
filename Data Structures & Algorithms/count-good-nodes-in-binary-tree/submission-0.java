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
    public int goodNodes(TreeNode root) {
        return dfs(root, root.val);
    }

    int dfs(TreeNode root, int mxs){
        if(root == null) return 0;

        int c = 0;

        if(root.val >= mxs){
            c = 1;
            mxs = root.val;
        }

        c += dfs(root.left, mxs);
        c += dfs(root.right, mxs);
        return c;
    }
}

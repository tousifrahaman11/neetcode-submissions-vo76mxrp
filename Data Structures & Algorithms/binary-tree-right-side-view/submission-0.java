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
    public List<Integer> rightSideView(TreeNode root) {
       List<Integer> li = new ArrayList<>();
       Queue<TreeNode> q = new LinkedList<>();
       q.offer(root);

       while(!q.isEmpty()){
        TreeNode rs = null;
        int ql = q.size();

        for(int i = 0; i<ql; i++){
            TreeNode node = q.poll();
            if(node != null){
                rs = node;
                q.offer(node.left);
                q.offer(node.right);
            }
        }
        if(rs != null){
            li.add(rs.val);
        }
       }
       return li;
    }
}

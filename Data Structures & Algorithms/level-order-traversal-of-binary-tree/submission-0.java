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
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> li = new ArrayList<>();

        Queue<TreeNode> q1 = new LinkedList<>();
        q1.add(root);

        while(!q1.isEmpty()){
            List<Integer> l1 = new ArrayList<>();
            for(int i = q1.size(); i>0; i--){
                TreeNode node = q1.poll();
                if(node != null){
                    l1.add(node.val);
                    q1.add(node.left);
                    q1.add(node.right);
                }
            }
            if(l1.size()>0){
                li.add(l1);
            }
        }
        return li;
    }
}

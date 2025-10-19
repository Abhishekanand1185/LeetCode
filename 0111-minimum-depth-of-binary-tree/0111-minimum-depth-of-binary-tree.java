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
    public int minDepth(TreeNode root) {
        int depth = 1;
        if(root == null){
            return 0;
        }
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        while(!q.isEmpty()){
            int n = q.size();
            for(int i=0; i<n; i++){
                TreeNode rem = q.remove();
                if(rem.left == null && rem.right == null){
                    return depth;
                }
                if(rem.left != null){
                    q.add(rem.left);
                }
                if(rem.right != null){
                    q.add(rem.right);
                }
            }
        depth++;
        }
    return depth;
    }
}
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
        Queue<TreeNode> q = new LinkedList<>();
        List<Integer> ans = new ArrayList<>();
        q.add(root);
        while(q.size() > 0){
            int n = q.size();
            for(int i=1; i<=n; i++){
                TreeNode rem = q.remove();
                if(rem != null){
                    if(i==n){
                         ans.add(rem.val);
                    }
                    if(rem.left != null){
                        q.add(rem.left);
                    }
                    if(rem.right != null){
                        q.add(rem.right);
                    }
                }
            }
        }
    return ans;
    }
}
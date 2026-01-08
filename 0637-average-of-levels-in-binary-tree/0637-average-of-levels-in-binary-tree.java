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
    public List<Double> averageOfLevels(TreeNode root) {
        List<Double> ans = new ArrayList<>();
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        while(!q.isEmpty()){
            int n = q.size();
            List<Integer> temp = new ArrayList<>();
            for(int i = 0; i<n; i++){
                TreeNode rem = q.remove();
                temp.add(rem.val);
                if(rem != null && rem.left != null){
                    q.add(rem.left);
                }

                if(rem != null && rem.right != null){
                    q.add(rem.right);
                }

            }
            int d = temp.size();
            double sum = 0;
            for(int v : temp){
                sum += v;

            }    
            ans.add(sum / d);    
        }
    return ans;
    }
}
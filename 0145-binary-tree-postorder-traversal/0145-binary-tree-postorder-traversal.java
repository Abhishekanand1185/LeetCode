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
    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> ans = new ArrayList<>();
        postOrdTrav(root, ans);
        return ans;
    }
    void postOrdTrav(TreeNode root,List<Integer> res){
        if(root == null){
            return;
        }
        postOrdTrav(root.left, res);
        postOrdTrav(root.right, res);
        res.add(root.val);
    }
}
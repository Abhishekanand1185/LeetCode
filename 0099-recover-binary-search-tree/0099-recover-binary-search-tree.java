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
    TreeNode f, s, prev;
    public void recoverTree(TreeNode root) {
        f = s = prev = null;
        inOrder(root);
        int temp = f.val;
        f.val = s.val;
        s.val = temp;
    }
    public void inOrder(TreeNode curr){
          if(curr == null){
            return;
          }
          inOrder(curr.left);
          
          if(prev != null && curr.val < prev.val && f == null){
            f = prev;
            s = curr;
          }

          if(prev != null && curr.val < prev.val && f != null){
            s = curr;
          }
          prev = curr;
          inOrder(curr.right);
    }
}
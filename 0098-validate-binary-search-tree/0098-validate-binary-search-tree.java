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
    public boolean isValidBST(TreeNode root) {
        return helper(root, Long.MIN_VALUE, Long.MAX_VALUE);
    }
    public static boolean helper(TreeNode root, long min, long max){
        if(root == null){
            return true;
        }
        long rval = root.val;
        if(rval < min || rval > max){
            return false;
        }
        boolean left = helper(root.left, min, rval-1);
        boolean right = helper(root.right, rval+1, max);
        if(left == false || right == false){
            return false;
        }
    return true;
    }
}
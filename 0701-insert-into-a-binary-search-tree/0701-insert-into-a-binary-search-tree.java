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
    public TreeNode insertIntoBST(TreeNode root, int val) {
        TreeNode newNode = new TreeNode(val);
        TreeNode rootCopy = root;
        if(root == null){
            return newNode;
        }
        while(true){
            if(val > root.val){
                if(root.right == null){
                    root.right = newNode;
                    return rootCopy;
                }else{
                    root = root.right;
                }
            } else{
                if(root.left == null){
                    root.left = newNode;
                    return rootCopy;
                }
                else{
                    root = root.left;
                }
            }
        }
    }
}
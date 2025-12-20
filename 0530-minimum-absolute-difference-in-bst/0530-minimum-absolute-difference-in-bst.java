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
    public int getMinimumDifference(TreeNode root) {
        List<Integer> li = new ArrayList<>();
        inOrder(li, root);
    return li.get(1) - li.get(0);
    }
    public static void inOrder(List<Integer> li, TreeNode root){

    if(root == null){
        return;
    }

    inOrder(li, root.left);
    li.add(root.val);
    inOrder(li, root.right);
    }
}
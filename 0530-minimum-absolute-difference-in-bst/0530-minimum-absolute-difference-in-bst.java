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
        int min = Integer.MAX_VALUE;
        for(int i = 1; i<li.size(); i++){
            int temp = li.get(i) - li.get(i-1);
            if(temp < min){
                min = temp;
            }
        }
    return min;
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
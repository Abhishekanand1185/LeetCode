/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class Codec {

    // Encodes a tree to a single string.
    public String serialize(TreeNode root) {
        StringBuilder sb = new StringBuilder();
        serializeHelper(root, sb);
        return sb.toString();
    }

    // Decodes your encoded data to tree.
    int i;
    public TreeNode deserialize(String data) {
        String ch[] = data.split(" ");
        i = 0;
        TreeNode root = deserializeHelper(ch);
        return root;
    }
    public void serializeHelper(TreeNode root, StringBuilder sb){
        if(root == null){
            sb.append("# ");
            return;
        }

        sb.append(root.val).append(" ");
        serializeHelper(root.left, sb);
        serializeHelper(root.right, sb);
    }
    public TreeNode deserializeHelper(String ch[]){
        if(ch[i].equals("#")){
            i++;
            return null;
        }

        TreeNode root = new TreeNode(Integer.parseInt(ch[i]));
        i++;

        root.left = deserializeHelper(ch);
        root.right = deserializeHelper(ch);
        return root;
    }
}

// Your Codec object will be instantiated and called as such:
// Codec ser = new Codec();
// Codec deser = new Codec();
// TreeNode ans = deser.deserialize(ser.serialize(root));
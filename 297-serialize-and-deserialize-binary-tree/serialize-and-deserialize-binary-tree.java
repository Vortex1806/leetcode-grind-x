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
    public void recSerialize(TreeNode root, StringBuilder sb) {
        if (root == null) {
            sb.append("#,");
            return;
        }
        sb.append(root.val).append(",");
        recSerialize(root.left, sb);
        recSerialize(root.right, sb);
    }
    // Encodes a tree to a single string.
    public String serialize(TreeNode root) {
        StringBuilder sb = new StringBuilder("");
        recSerialize(root, sb);
        return sb.toString();
    }

    public TreeNode recDeserialize(List<String> str) {
        if(str.get(0).equals("#")) {
            str.remove(0);
            return null;
        }
        TreeNode root = new TreeNode(Integer.valueOf(str.get(0)));
        str.remove(0);
        root.left = recDeserialize(str);
        root.right = recDeserialize(str);
        return root;
    }

    // Decodes your encoded data to tree.
    public TreeNode deserialize(String data) {
        String[] arr = data.split(",");
        List<String> newArr = new ArrayList<String>(Arrays.asList(arr));
        return recDeserialize(newArr);
    }
}

// Your Codec object will be instantiated and called as such:
// Codec ser = new Codec();
// Codec deser = new Codec();
// TreeNode ans = deser.deserialize(ser.serialize(root));
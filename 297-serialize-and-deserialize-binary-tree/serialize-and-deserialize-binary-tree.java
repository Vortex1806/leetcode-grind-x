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
    public String recSerialize(TreeNode root, String str) {
        if(root == null) {
            str+="null,";
        } else {
            str += String.valueOf(root.val) + ",";
            str = recSerialize(root.left, str);
            str = recSerialize(root.right, str);
        }
        return str;
    }
    // Encodes a tree to a single string.
    public String serialize(TreeNode root) {
        String ans = recSerialize(root, "");
        return ans;
    }

    public TreeNode recDeserialize(List<String> str) {
        if(str.get(0).equals("null")) {
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
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
    HashMap<Integer, Integer> map;
    int postIdx;
    public TreeNode buildTree(int[] inorder, int[] postorder) {
        map = new HashMap<>();
        
        for(int i=0; i<inorder.length; i++){
            map.put(inorder[i], i);
        }

        postIdx = postorder.length-1;
        return dfs(0, inorder.length-1, postorder);
    }

    private TreeNode dfs(int left, int right, int[] postorder){
        if(left > right) return null;

        int rootVal = postorder[postIdx--];
        TreeNode root = new TreeNode(rootVal);

        int idx = map.get(rootVal);

        root.right = dfs(idx+1, right, postorder);
        root.left = dfs(left, idx-1, postorder);

        return root;
    }
}
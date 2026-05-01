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
    private void swap(TreeNode tree){
        TreeNode t = tree;
        if(t == null) return;
        TreeNode temp = t.left;
        t.left = t.right;
        t.right = temp;
        swap(t.left);
        swap(t.right);
    }
    public TreeNode invertTree(TreeNode root) {
        TreeNode tree = root;
        swap(tree);
        return tree;
    }
}

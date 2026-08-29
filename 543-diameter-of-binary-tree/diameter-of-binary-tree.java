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
    int res = 0;
    public int helper(TreeNode root){
        if(root==null) return 0;
        int lef = helper(root.left);
        int rig = helper(root.right);
        int sum = lef+rig;
        res=Math.max(sum,res);
        return 1+Math.max(lef,rig);
    }
    public int diameterOfBinaryTree(TreeNode root) {
        helper(root);
        return res;
    }
}
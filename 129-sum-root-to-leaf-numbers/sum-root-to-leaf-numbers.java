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
    int curr=0;
    public int helper(TreeNode root , int ans){
        if(root==null) return 0;
        ans= ans*10 + root.val;
        if(root.left==null&&root.right == null){
            curr+=ans;
        }
        helper(root.left,ans);
        helper(root.right,ans);
        return curr;

    }
    public int sumNumbers(TreeNode root) {
        return helper(root,0);
        
    }
}
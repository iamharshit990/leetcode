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
    int ans = -1;
    public void helper(TreeNode root,int count){
        if(root==null) return;
        count++;
        if(root.right==null&&root.left==null){
            ans=Math.max(ans,count);
            return ;
        }
        helper(root.left,count);
        helper(root.right,count);
    }
    public int maxDepth(TreeNode root) {
        if(root==null) return 0;
        helper(root,0);
        return ans;
        
    }
}
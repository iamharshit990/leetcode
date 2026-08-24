/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */

class Solution {
    TreeNode ans = null;
    public void helper(TreeNode root , TreeNode p, TreeNode q){
        if(root==p||root==q) {
            ans = root;
            return ;
        }
        if(root==null) return ;
        if(root.val<p.val&&root.val<q.val){
            helper(root.right,p,q);
        }
        if (root.val>q.val){
            helper(root.left,p,q);
        }
        if(root.val>p.val&&root.val<q.val){
            ans= root;
            return ;
        }
    } 
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if(p.val>q.val){
            helper(root,q,p);
        }
        else{
            helper(root,p,q);
        }
        return ans;
        
    }
}
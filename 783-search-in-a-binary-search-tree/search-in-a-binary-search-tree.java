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
    TreeNode ans = null;
    public void helper(TreeNode root , int val){
        if(root==null) return ;
        if(root.val==val) {
            ans = root;
            return ;
        }
        else if(root.val<val) helper(root.right,val);
        else helper(root.left,val);
        return;
    }
    public TreeNode searchBST(TreeNode root, int val) {
         helper(root,val);
         return ans;
    }
}
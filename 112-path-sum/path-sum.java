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
    boolean ans = false;
    public void helper(TreeNode root,int k,int sum)
    {
        if(root==null) return;
        sum+=root.val;
        if(root.left==null&&root.right==null){
            if(sum==k) {
                ans = true;
                return ;
            }
        }
        helper(root.left,k,sum);
        helper(root.right,k,sum);
        return ;

    }
    public boolean hasPathSum(TreeNode root, int targetSum) {
        helper(root,targetSum,0);
        return ans;
    }
}
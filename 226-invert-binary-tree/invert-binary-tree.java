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
    public void helper(TreeNode node){
        if(node==null ) return ;
        
        //if(node.)
        TreeNode temp = node.left;
        node.left = node.right;
        node.right = temp;

        helper(node.left);
        helper(node.right);


    }
    public TreeNode invertTree(TreeNode root) {
        TreeNode head = root;
        helper(root);
        return head;
        
    }
}
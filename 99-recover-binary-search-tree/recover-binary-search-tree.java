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
    private void swap(TreeNode first, TreeNode second) {
        if (first == null || second == null) {
            return;
        }
        int temp = first.val;
        first.val = second.val;
        second.val = temp;
    }
    int galat = 0;
    TreeNode prev = null;
    TreeNode g1First = null ;
    TreeNode g1Second = null;
    TreeNode g2First = null;
    TreeNode g2Second = null;
    void helper(TreeNode root){
        if(root==null) return ;
        helper(root.left);
        if(prev==null) prev=root;
        else{
            if(prev.val>=root.val){
                if(galat==0) {
                    g1First = prev;
                    g1Second = root;
                    galat++;
                }
                else{
                    g2First = prev;
                    g2Second = root;
                    galat++;
                }
            }
            prev=root;
        }
        helper(root.right);
    }
    public void recoverTree(TreeNode root) {

        helper(root);
        if(galat==1){
            swap(g1First,g1Second);
        }
        else {
            swap(g1First,g2Second);
        }
        
    }
}
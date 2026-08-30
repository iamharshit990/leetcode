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
    public TreeNode sortedArrayToBST(int[] nums) {
        return helper(nums,0,nums.length-1);
        
    }
    public TreeNode helper(int num[] , int low , int high){
        if(low>high) return null;
        int idx = low + (high-low)/2;
        TreeNode node = new TreeNode (num[idx]);
        node.left = helper(num,low,idx-1);
        node.right = helper(num,idx+1,high);
        return node;
    }
}
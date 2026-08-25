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
    public void helper(TreeNode root , List<Integer> temp){
        if(root==null) return ;
        helper(root.left,temp);
        temp.add(root.val);
        helper(root.right,temp);
        return ;
    }
    public boolean findTarget(TreeNode root, int k) {
        List<Integer> temp  = new ArrayList<>();
        helper(root,temp);
        int i=0;
        int j = temp.size()-1;
        while(i<j){
            int sum = temp.get(i) + temp.get(j);
            if(sum>k) j--;
            else if(sum<k) i++;
            else return true;
        }
        return false;
    }
}
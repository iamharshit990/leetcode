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
class Solution{
    public void helper(TreeNode root,List<Integer> temp){
        if(root==null) return ;
        helper(root.left,temp);
        temp.add(root.val);
        helper(root.right,temp);
    }
    public boolean isValidBST(TreeNode root) {
        if(root==null) return true;
        List<Integer> temp = new ArrayList<>();
        helper(root,temp);
        if(temp.size()<=1) return true;
        for(int i = 1;i<temp.size();i++){
            if(temp.get(i)<=temp.get(i-1)) return false;
        }
        return true;

        
    }
}
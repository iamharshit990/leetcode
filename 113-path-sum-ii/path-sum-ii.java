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
    List<List<Integer>> ans = new ArrayList<>();
    public void helper(TreeNode root,int k,int sum,List<Integer> temp){
        if(root==null) return ;
        sum+=root.val;
        temp.add(root.val);
        if(root.left==null&&root.right==null){
            if(sum==k) {
                ans.add(new ArrayList<>(temp));
                temp.remove(temp.size()-1);
                return ;
            }
        }
        helper(root.left,k,sum,temp);
        helper(root.right,k,sum,temp);
        temp.remove(temp.size()-1);
        return ;

    }
    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        List<Integer> temp = new ArrayList<>();
        helper(root,targetSum,0,temp);
        return ans;
        
    }
}
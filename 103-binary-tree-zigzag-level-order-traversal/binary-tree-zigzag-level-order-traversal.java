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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        if(root==null) return new ArrayList<>();
        List<List<Integer>> ans = new ArrayList<>();
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        boolean ltor= true;
        while(!q.isEmpty()){
            int size = q.size();
            List<Integer> temp = new ArrayList<>();
            while(size-->0){
                TreeNode t = q.poll();
                temp.add(t.val);
                if(t.left!=null) q.add(t.left) ;
                if(t.right!=null) q.add(t.right);
            }
            // temp -> 3  and {9,20}  since we want 9,20 to be to right to left we can simply reverse it 
            // we will use this boolean for that check 
            if(!ltor) Collections.reverse(temp);
            ans.add(temp);
            ltor=!ltor;
        }
        return ans;
        
    }
}
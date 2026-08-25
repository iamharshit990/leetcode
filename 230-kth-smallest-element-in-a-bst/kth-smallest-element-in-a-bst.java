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
    Stack<TreeNode> asc = new Stack<>();
    public TreeNode getSmaller(){
        if(asc.isEmpty()) return null;

        TreeNode small = asc.pop();
        TreeNode rightChild = small.right; 
        while(rightChild!=null){
            asc.push(rightChild);
            rightChild=rightChild.left;
        }
        return small;
    }
    public int kthSmallest(TreeNode root, int k) {
        if(root==null) return 0;
        TreeNode t = root;
        while(t!=null){
            asc.add(t);
            t=t.left;
        }
        t=root;
        for(int i=0;i<k;i++){
            t = getSmaller();
        }
        return t.val;
        
    }
}
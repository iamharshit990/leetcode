import java.util.*;
class Solution {
    public static void helper(List<List<Integer>> ans ,int n, int i ,List<Integer> temp ,  int nums[]){
        if(i == n) {
            ans.add(new ArrayList<>(temp));
            return ;
        }

        helper(ans,n,i+1,temp,nums);
        temp.add(nums[i]);
        helper(ans,n,i+1,temp,nums);
        temp.remove(temp.size()-1);
        return ;

    }
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        List <Integer> temp = new ArrayList<>();
        helper(ans,nums.length,0,temp,nums);
        return ans;

        
    }
}
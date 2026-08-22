class Solution {
    public static void helper(List<List<Integer>> ans, int i ,int [] nums , List<Integer> temp ){
        if(i==nums.length){
            ans.add(new ArrayList<>(temp));
            return;
        }

        helper(ans,i+1,nums,temp);
        temp.add(nums[i]);
        helper(ans,i+1,nums,temp);
        temp.remove(temp.size()-1);
        return ;


    }
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> temp = new ArrayList<>();
        helper(ans,0,nums,temp);
        return ans;
        
    }
}
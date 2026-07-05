class Solution {
    public int maxAbsoluteSum(int[] nums) {
        int ans=Math.abs(nums[0]);
        int cansmax=nums[0];
        int cansmin=nums[0];
        for(int i=1;i<nums.length;i++){
            cansmax=Math.max(cansmax+nums[i],nums[i]);
            cansmin=Math.min(cansmin+nums[i],nums[i]);
            ans=Math.max(ans,Math.max(Math.abs(cansmin),Math.abs(cansmax)));
        }
        return ans;
        
    }
}
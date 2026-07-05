class Solution {
    public int maxSubArray(int[] nums) {
        int cans=nums[0];
        int ans=nums[0];
        for(int i=1;i<nums.length;i++){
            int v1=cans+nums[i];
            int v2=nums[i];
            cans=Math.max(v1,v2);
            ans=Math.max(cans,ans);
        }
        return ans;
        
    }
}
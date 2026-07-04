class Solution {
    public int maxProduct(int[] nums) {
        int ans = nums[0];
        int mincs=nums[0];
        int maxcs=nums[0];
        for(int i=1;i<nums.length;i++){
            int v1=maxcs*nums[i];
            int v2=mincs*nums[i];
            int v3=nums[i];
            maxcs=Math.max(v1,Math.max(v2,v3));
            mincs=Math.min(v1,Math.min(v2,v3));
            ans=Math.max(ans,Math.max(maxcs,mincs));
        }
        return ans;
        
    }
}
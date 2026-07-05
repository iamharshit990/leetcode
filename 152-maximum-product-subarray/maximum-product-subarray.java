class Solution {
    public int maxProduct(int[] nums) {
        int ans=nums[0];
        int cansmax=nums[0];
        int cansmin=nums[0];
        for(int i=1;i<nums.length;i++){
            int v1=nums[i];
            int v2=cansmax*nums[i];
            int v3=cansmin*nums[i];
            cansmax=Math.max(v1,Math.max(v2,v3));
            cansmin=Math.min(v1,Math.min(v2,v3));
            ans=Math.max(ans,Math.max(cansmax,cansmin));
        }
        return ans;
        
    }
}
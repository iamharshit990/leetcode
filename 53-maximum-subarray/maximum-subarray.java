class Solution {
    public int maxSubArray(int[] nums) {
        //kadanes algo
        int ans=nums[0];
        int cs=nums[0];
        for(int i=1;i<nums.length;i++){
            int v1=cs+nums[i];
            int v2=nums[i];
            cs=Math.max(v1,v2);
            ans=Math.max(ans,cs);
        }
        return ans;
        
    }
}
class Solution {
    public int findPeakElement(int[] nums) {
        //brute
        int ans=0;
        for(int i=1;i<nums.length;i++){
            if(nums[i]>nums[i-1]){
                ans=Math.max(ans,i);

            }
            
            
        }
        return ans;
        
    }
}
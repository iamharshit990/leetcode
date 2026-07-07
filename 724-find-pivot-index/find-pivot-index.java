class Solution {
    public int pivotIndex(int[] nums) {
        //optimised
        int sum=0;
        for(int i=0;i<nums.length;i++){
            sum+=nums[i];
        }
        int presum=0;
        int suffsum=0;
        for(int i=0;i<nums.length;i++){
            if(i==0) presum=0;
            else presum=presum+nums[i-1];
            
            suffsum=sum-nums[i]-presum;
            if(presum==suffsum){
                return i;
            }

        }
        return -1;
    }
}
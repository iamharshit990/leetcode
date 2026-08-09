class Solution {
    public double findMaxAverage(int[] nums, int k) {
        double ans =0;
        int low=0;
        int high=k-1;
        int sum=0;
        for(int i=0;i<=high;i++){
            sum+=nums[i];
        }
        low++;
        high++;
        double avg = sum/(double)k;
        ans=avg;
        while(high<nums.length){
            sum+=nums[high];
            sum-=nums[low-1];
            avg = sum/(double)k;
            ans=Math.max(avg,ans);
            low++;
            high++;


        }
        return ans;
    }
}
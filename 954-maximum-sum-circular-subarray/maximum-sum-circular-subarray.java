class Solution {
    public int helper (int arr[]){
        int tsum=0;
        for(int i : arr){
            tsum+=i;
        }
        int min=arr[0];
        int sum=arr[0];
        for(int i=1;i<arr.length;i++){
            sum=Math.min(arr[i],sum+arr[i]);
            min=Math.min(sum,min);
        }
        return tsum-min;

    }
    public int maxSubarraySumCircular(int[] nums) {
        int max=nums[0];
        int sum=nums[0];
        for(int i=1;i<nums.length;i++){
            sum=Math.max(nums[i],sum+nums[i]);
            max=Math.max(sum,max);
        }
        if(max<0) return max;
        return Math.max(max,helper(nums));
    }
}
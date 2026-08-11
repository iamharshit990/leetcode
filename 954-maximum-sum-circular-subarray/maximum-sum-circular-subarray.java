class Solution {
    public int min(int arr[]){
        int sum=0;
        for(int i:arr){
            sum+=i;
        }
        int currsum=arr[0];
        int min=arr[0];
        for(int i=1;i<arr.length;i++){
            currsum=Math.min(arr[i],currsum+arr[i]);
            min=Math.min(currsum,min);
        }
        return sum-min;

    }
    public int maxSubarraySumCircular(int[] nums) {
        int sum=nums[0];
        int max=nums[0];
        for(int i=1;i<nums.length;i++){
            sum=Math.max(nums[i],sum+nums[i]);
            max=Math.max(sum,max);
        }
        if(max<0) return max;
        return Math.max(max,min(nums));
    }
}
class Solution {
    public int minimumDeletions(int[] nums) {
        if(nums.length<=1) return nums.length;
        int max = 0 , min = 0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]>nums[max]) max=i;
            if(nums[i]<nums[min]) min=i;
        }
        int front = Math.max(max,min)+1;
        int back = nums.length-Math.min(max,min);
        int split = Math.min(max,min)+1 + nums.length-Math.max(max,min);
        return Math.min(Math.min(front,back),split);
    }
}
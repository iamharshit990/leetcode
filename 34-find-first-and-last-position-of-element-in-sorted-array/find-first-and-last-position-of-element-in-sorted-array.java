class Solution {
    public int[] searchRange(int[] nums, int target) {
        // brute 
        int ans1=Integer.MAX_VALUE;
        int ans2=Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==target){
                ans1=Math.min(ans1,i);
                ans2=Math.max(ans2,i);
            }
        }
        if(ans1==Integer.MAX_VALUE||ans2==Integer.MIN_VALUE){
            return new int []{-1,-1};
        }
        return new int[]{ans1,ans2};
        
        
    }
}
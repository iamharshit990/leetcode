class Solution {
    public int findMin(int[] nums) {
        int n=nums.length;
        int ans=Integer.MAX_VALUE;
        int low=0;
        int high=nums.length-1;
        while(low<=high){
            int mid=(low+high)/2;
            if(nums[mid]>nums[n-1]){
                low=mid+1;
            }
            else high=mid-1;
            ans=Math.min(nums[mid],ans);
        }
        return ans;
        
    }
}
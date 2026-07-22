class Solution {
    public int[] searchRange(int[] nums, int target) {
        int low=0;
        int high=nums.length-1;
        int ans1=-1;
        int ans2=-1;
        while(low<=high){
            int mid= (low+high)/2;
            if(nums[mid]==target){
                ans1=mid;
                high=mid-1;
            }
            else if(nums[mid]>target) high=mid-1;
            else low=mid+1;
        }
        low=0;
        high=nums.length-1;
        while(low<=high){
            int mid= (low+high)/2;
            if(nums[mid]==target){
                ans2=mid;
                low=mid+1;
            }
            else if(nums[mid]>target) high=mid-1;
            else low=mid+1;
        }
        if(ans1==-1||ans2==-1){
            return new int[]{-1,-1};
        }
        return new int[]{ans1,ans2};

        
    }
}
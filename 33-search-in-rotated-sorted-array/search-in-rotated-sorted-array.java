class Solution {
    public int search(int[] nums, int target) {
        int low=0;
        int high=nums.length-1;
        int index=0;
        while(low<=high){
            int mid=(low+high)/2;
            if(nums[mid]<nums[index]){
                index=mid;
            }
            if(nums[mid]>nums[nums.length-1]) low=mid+1;
            else if(nums[mid]<nums[nums.length-1]) high=mid-1;
            else {
                index=mid;
                break;
            }
            
        }
        if(nums[index]==target) return index;
        low=0;
        high=index-1;
        while(low<=high){
            int mid=(low+high)/2;
            if(nums[mid]>target){
                high=mid-1;
            }
            else if(nums[mid]<target){
                low=mid+1;
            }
            else return mid;
        }
        low=index+1;
        high=nums.length-1;
        while(low<=high){
            int mid=(low+high)/2;
            if(nums[mid]>target){
                high=mid-1;
            }
            else if(nums[mid]<target){
                low=mid+1;
            }
            else return mid;

        }
        return -1;
        
    }
}
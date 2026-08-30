class Solution {
    public int minimumDeletions(int[] nums) {
        if(nums.length<=1) return nums.length;
        int max = 0;
        int min = 0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]>nums[max]){
                max=i;
            }
            if(nums[i]<nums[min]){
                min=i;
            }
        }
        int ans = 0;
        // if(max<=nums.length/2&&min<=nums.length/2){
        //     return Math.max(max,min)+1;
        // }
        // else if(max>=nums.length/2&&min>=nums.length/2){
        //     return nums.length-Math.min(max,min);
        // }
        // else {
        //     if(max<=nums.length/2){
        //         ans+=max+1;
        //     }
        //     else ans+=(nums.length-max);
        //     if(min<=nums.length/2){
        //         ans+=min+1;
        //     }
        //     else ans+=(nums.length-min);
        //     return ans;
        // }
        int front = 0 ;
        front = Math.max(max,min)+1;
        int back = nums.length-Math.min(max,min);
        int split = Math.min(max,min)+1 + nums.length-Math.max(max,min);
        ans=Math.min(Math.min(front,back),split);
        return ans;

        
    }
}
class Solution {
    public int removeDuplicates(int[] nums) {
        if(nums.length==1) return 1;
        int index=0;
        int ans=1;
        for(int i=1;i<nums.length;i++){
            if(nums[i]!=nums[index]){
                nums[++index]=nums[i];
                ans++;
            }
        }
        return ans;

        
    }
}
class Solution {
    public int removeDuplicates(int[] nums) {
        int count =1;
        int ans=1;                                // j=0 
        int j=0;
        //[1,1,1,2,2,3]
        for(int i = 1;i<nums.length;i++){
            if(nums[i]==nums[j]&&count<2){
                count ++;
                ans++;
                nums[++j]=nums[i];
            }
            else{
                if(nums[i]!=nums[j]){
                    ans++;
                    count=1;
                    nums[++j]=nums[i];
                }
            }
            
            if(i==nums.length-1) break;
            
        }
        return ans;

        
    }
}
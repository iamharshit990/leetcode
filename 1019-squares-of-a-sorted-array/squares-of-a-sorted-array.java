class Solution {
    public int[] sortedSquares(int[] nums) {
        int i=0;
        int j=nums.length-1;
        int index=nums.length-1;
        int ans[]=new int[nums.length];
        //[-7,-3,2,3,11]
        while(i<=j){
            int sum1=nums[i]*nums[i];
            int sum2=nums[j]*nums[j];
            if(sum1>sum2){
                ans[index--]=sum1;
                i++;
            }
            else{
                ans[index--]=sum2;
                j--;
            }

        }
        return ans;
        
    }
}
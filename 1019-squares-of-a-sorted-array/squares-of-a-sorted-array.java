class Solution {
    public int[] sortedSquares(int[] nums) {
        int low=0;
        int high=nums.length-1;
        int index=nums.length-1;
        int ans[]=new int[nums.length];
        while(low<=high){
            int a=nums[low]*nums[low];
            int b=nums[high]*nums[high];
            if(a>b){
                ans[index]=a;
                low++;
            }
            else{
                ans[index]=b;
                high--;
            }
            index--;

        }
        return ans;
    }
}
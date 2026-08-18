class Solution {
    public int max(int arr[]) {
        int max = arr[0];
        for (int i : arr) {
            max = Math.max(i, max);
        }
        return max;
    }

    public int largestInteger(int[] nums, int k) {
        if(k==nums.length){
            return max(nums);
        }
        if(k==1){
            int freq[] = new int[51];
            int ans=Integer.MIN_VALUE;
            for(int i = 0 ;i<nums.length;i++){
                freq[nums[i]]++;
            }
            for(int i = 0 ;i<=50;i++){
                if(freq[i]==1){
                    ans=Math.max(ans,i);
                }
            }
            if(ans==Integer.MIN_VALUE) return -1;
            return ans;
        }
        int c1=0;
        int c2=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==nums[0]) c1++;
            if(nums[i]==nums[nums.length-1]) c2++;
        }
        if(c1==1&&c2==1) return Math.max(nums[0],nums[nums.length-1]);
        if(c1==1) return nums[0] ;
        if(c2==1) return nums[nums.length-1];
        return -1;
    }
}
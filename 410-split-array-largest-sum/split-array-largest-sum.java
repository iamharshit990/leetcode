class Solution {
    public boolean helper(int []arr,int k,int mid){
        int count=1;
        int csum=arr[0];
        for(int i=1;i<arr.length;i++){
            if(csum+arr[i]>mid){
                csum=arr[i];
                count++;
                continue;
            }
            csum+=arr[i];
        }
        return count<=k;

    }
    public int splitArray(int[] nums, int k) {
        int ans=0;
        int low=0;
        for(int i:nums){
            low=Math.max(low,i);
        }
        int high=0;
        for(int i:nums){
            high+=i;
        }
        while(low<=high){
            int mid=(low+high)/2;
            if(helper(nums,k,mid)){
                ans=mid;
                high=mid-1;
            }
            else {
                low=mid+1;
            }
        }
        return ans;
        
    }
}
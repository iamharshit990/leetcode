class Solution {
    
    public static int kadane(int arr[]){
        int ans=arr[0];
        int cans=arr[0];
        for(int i=1;i<arr.length;i++){
            cans=Math.max(cans+arr[i],arr[i]);
            ans=Math.max(ans,cans);
        }
        return ans;

    }
    public static int circularkadane(int arr[]){
        int ans=arr[0];
        int cans=arr[0];
        for(int i=1;i<arr.length;i++){
            cans=Math.min(cans+arr[i],arr[i]);
            ans=Math.min(ans,cans);
        }
        return ans;
    }
    public int maxSubarraySumCircular(int[] nums) {
        int sum = 0;
        for (int x : nums) sum += x;
        int v1=kadane(nums);
        int v2=sum-circularkadane(nums);
        if (v1 < 0) return v1;  // all negative, v2 would be invalid (0)
        return Math.max(v1, v2);
        
        
    }
}
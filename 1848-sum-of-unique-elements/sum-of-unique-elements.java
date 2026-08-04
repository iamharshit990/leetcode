class Solution {
    public int sumOfUnique(int[] nums) {
        int arr[] = new int[100];
        for(int i:nums){
            arr[i-1]++;
        }
        int ans=0;
        for(int i=0;i<100;i++){
            if(arr[i]==1){
                ans=ans+i+1;
            }
            
        }
        return ans;
    }
}
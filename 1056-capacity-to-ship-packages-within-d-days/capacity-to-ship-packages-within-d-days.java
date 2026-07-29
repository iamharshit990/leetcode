class Solution {
    public boolean helper(int arr[],int k,int mid){
        int csum=0;  //mid = 2     
        int count =1;      
        for(int i:arr){        
            if(csum+i<=mid){
                csum+=i;
            }
            else {
                if(i>mid) return false;
                csum=i;
                count++;
            }
        }
        if(count>k){
            return false;
        }
        else return true;
    }
    //[1,2,3,1,1] 8 low =1 and high = 8 mid = 4 
    public int shipWithinDays(int[] weights, int days) {
        int ans=Integer.MAX_VALUE;
        int low=1;
        int high=0;
        for(int i:weights){
            high+=i;
        }
        while(low<=high){
            int mid=(low+high)/2;
            if(helper(weights,days,mid)){
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
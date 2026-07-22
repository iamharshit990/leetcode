class Solution {
    public int max(int arr[]){
        int ans=0;
        for(int i=0;i<arr.length;i++){
            ans=Math.max(ans,arr[i]);
        }
        return ans;
    }
    public boolean feasible(int arr[],int k,int h){
        long count=0;
        for(int i=0;i<arr.length;i++){
            count+=(int) Math.ceil((double)arr[i]/k);
        }
        if(count<=h) return true;
        else return false;
    }
    public int minEatingSpeed(int[] piles, int h) {
        int n=piles.length;
        
        
       
        int low=1;
        int high=max(piles);
        int ans=high;
        while(low<=high){
            int mid =(low+high)/2;
            if(feasible(piles,mid,h)){
                ans=Math.min(ans,mid);
                high=mid-1;
            }
            else {
                low=mid+1;
            }
        }
        return ans;
    }
}

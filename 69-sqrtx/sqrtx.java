class Solution {
    public int mySqrt(int x) {
        if(x==1) return 1;
        if(x==0) return 0;
        int res=0;
        int low=0;
        int high=x;
        while(low<=high){
            int mid= (low+high)/2;
            if(mid<=x/mid){
                res=mid;
                low=mid+1;

            }
            else {
                high=mid-1;
            }
            
            
        }
        return res;
        
    }
}
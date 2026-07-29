class Solution {
    public int max(int []arr){
        int max=0;
        for(int i:arr){
            max=Math.max(i,max);
        }
        return max;
    }
    public boolean isValid(int [] arr,int num,int h){
        long count = 0;
        for(int i:arr){
            count+=(int)Math.ceil((double)i/num);
        }
        if(count<=h){
            return true;
        }
        else return false;

    }
    public int minEatingSpeed(int[] piles, int h) {
        int low=1;
        int high=max(piles);
        int ans=max(piles);
        while(low<=high){
            int mid=(low+high)/2;
            if(isValid(piles,mid,h)){
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
class Solution {
    public boolean helper(int arr[],long k , int num){
        long count=0;
        for(int i:arr){
            if(i>=num){
                count+=i/num;
            }
        }
        if(count>=k) return true;
        else return false;

    }
    public int max(int arr[]){
        int max=0;
        for(int i:arr){
            max=Math.max(max,i);
        }
        return max;
    }
    public int maximumCandies(int[] candies, long k) {
        int  ans = 0;
        int low=1;
        int high= max(candies);
        while(low<=high){
            int mid=low+(high-low)/2;
            if(helper(candies,k,mid)){
                ans=mid;
                low=mid+1;
            }
            else {
                high=mid-1;
            }

        }
        return  ans;
        
    }
}
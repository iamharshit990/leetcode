class Solution {
    public boolean helper(int [] arr, int m , int k,long mid){
        //1 10 3 10 2   5
        int nb=0;
        long count=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]<=mid){
                count++;
            }
            else {
                count=0;
            }
            if(count==k) {
                nb++;
                count=0;
            }

        }
        if(nb>=m) return true;
        else return false;

    }
    public int minDays(int[] arr, int m, int k) {
        // arr m--> no of boutiques 
        // we need to use k adjacent to make a boutique i.e 2 2 ka pair will give 1 so we need to make m boutiques
        // to make m we would need k no of adjacent 
        int low=1;
        int high=0;
        for(int i:arr){
            high=Math.max(high,i);
        }
        int ans=-1;
        while(low<=high){
            long mid=(low+high)/2;
            if(helper(arr,m,k,mid)){
                ans=(int)mid;
                high=(int)(mid)-1;
            }
            else {
                low=(int)(mid)+1;
            }
        }
        return ans;


        
    }
}
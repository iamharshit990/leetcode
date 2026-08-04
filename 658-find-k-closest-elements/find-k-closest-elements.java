class Solution {
    public List<Integer> findClosestElements(int[] arr, int k, int x) {
        int i=0;
        int j=arr.length-1;
        while(i<j&&j-i+1>k){
            int diff1= Math.abs(arr[i]-x);
            int diff2= Math.abs(arr[j]-x);
            if(diff1>diff2){
                i++;
            }
            else j--;
        }
        List<Integer> ans= new ArrayList<>();
        for(int low=i;low<=j;low++){
            ans.add(arr[low]);
        }
        return ans;
        
    }
}
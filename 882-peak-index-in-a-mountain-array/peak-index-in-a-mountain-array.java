class Solution {
    public int peakIndexInMountainArray(int[] arr) {
        int ans=-1;
        int i=0;
        int j=1;
        while(j<arr.length&&arr[i]<arr[j]){
            ans=i;
            i++;
            j++;
        }
        return i;

        
    }
}
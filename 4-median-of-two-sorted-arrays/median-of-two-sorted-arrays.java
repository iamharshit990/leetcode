class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int i=nums1.length-1;
        int j=nums2.length-1;
        int arr[] =new int [nums1.length+nums2.length];
        int k=nums1.length+nums2.length-1;
        while(i>=0&&j>=0){
            if(nums1[i]>nums2[j]){
                arr[k]=nums1[i];
                k--;
                i--;
            }
            else{
                arr[k]=nums2[j];
                k--;
                j--;
            }
        }
        while(i>=0){
            arr[k]=nums1[i];
            i--;
            k--;
        }
        while(j>=0){
            arr[k]=nums2[j];
            j--;
            k--;
        }
        int mid=arr.length/2;
        if(arr.length%2==0){
            return (double)(arr[mid]+arr[mid-1])/2;
        }
        else{
            return (double)arr[mid];
        }
        
    }
}
class Solution {
    public boolean bs(int [] arr,int target){
        int low=0;
        int high=arr.length-1;
        while(low<=high){
            int mid=(low+high)/2;
            if(arr[mid]<target){
                low=mid+1;
            }
            else if(arr[mid]>target){
                high=mid-1;
            }
            else return true;
        }
        return false;

    }
    public boolean searchMatrix(int[][] matrix, int target) {
       int low=0;
       int high=matrix.length-1;
       int index=0;
       while(low<=high){
        int mid=(low+high)/2;
        if(matrix[mid][0]<=target){
            index=mid;
            low=mid+1;
        }
        else {
            high=mid-1;
        }
       }
       return bs(matrix[index],target);
        
    }
}
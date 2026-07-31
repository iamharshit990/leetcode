class Solution {
    public boolean searchMatrix(int[][] arr, int target) {
        int row = arr.length-1;
        int col=0;
        while(row>=0&&col<arr[0].length){
            int curr = arr[row][col];
            if(curr==target) return true;
            else if(curr>target) row--;
            else col++;
        }
        return false;
    }
}
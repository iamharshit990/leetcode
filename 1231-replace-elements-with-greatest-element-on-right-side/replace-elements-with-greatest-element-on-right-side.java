class Solution {
    public int[] replaceElements(int[] arr) {
        if(arr.length==1) return new int []{-1};
        int right=arr[arr.length-1];
        arr[arr.length-1]=-1;
        for(int i=arr.length-2;i>=0;i--){
            int temp =arr[i];
            arr[i]=right;
            right=Math.max(right,temp);
        }
        return arr;
        
    }
}
class Solution {
    public List<Integer> findClosestElements(int[] arr, int k, int x) {
       int low=0;
       int high=arr.length-1;
       int ans=arr.length;
       while(low<=high){
        int mid=low+(high-low)/2;
        if(arr[mid]>=x){
            ans=mid;
            high=mid-1;
        }
        else low=mid+1;

       }
       int i=ans-1;
       int j=ans;
       List<Integer> list = new ArrayList<>();
       while(list.size()<k){
        if(i<0) {
            list.add(arr[j]);
            j++;
        }
        else if(j==arr.length){
            list.add(arr[i]);
            i--;
        }
        else {
            int diff1=Math.abs(arr[i]-x);
            int diff2=Math.abs(arr[j]-x);
            if(diff1>diff2){
                list.add(arr[j]);
                j++;
            }
            else if(diff1<diff2){
                list.add(arr[i]);
                i--;
            }
            else {
                list.add(arr[i]);
                i--;
            }
        }
        
       } 
       Collections .sort(list);
       return list;
    }
}
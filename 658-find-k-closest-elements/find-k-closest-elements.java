class Solution {
    public List<Integer> findClosestElements(int[] arr, int k, int x) {
        int low=0;
        int high=arr.length-1;
        int index=arr.length;
        while(low<=high){
            int mid = low + (high-low)/2;
            if(arr[mid]>=x){
                index=mid;
                high=mid-1;
            }
            else low=mid+1;
        }
        int i=index;
        int j=index-1;
        List<Integer> list= new ArrayList<>();
        while(list.size()<k){
            if(j<0){
                list.add(arr[i]);
                i++;
            }
            else if(i==arr.length){
                list.add(arr[j]);
                j--;
            }
            else {
                int a = Math.abs(arr[i]-x);
                int b=  Math.abs(arr[j]-x);
                if(a<b){
                    list.add(arr[i]);
                    i++;
                }
                else{
                    list.add(arr[j]);
                    j--;
                }

            }
        }
        Collections.sort(list);
        return list;
    }
}
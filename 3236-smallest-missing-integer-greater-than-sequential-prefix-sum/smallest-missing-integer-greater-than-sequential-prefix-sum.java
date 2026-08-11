class Solution {
    public int missingInteger(int[] arr) {
        int index=0;
        for(int i=1;i<arr.length;i++){
            if(arr[i]==arr[i-1]+1){
                index++;
            }
            else break;
        }
        int sum=0;
        for(int i=0;i<=index;i++){
            sum+=arr[i];
        }
        HashSet<Integer> set= new HashSet<>();
        for(int i:arr){
            set.add(i);
        }
        int updation =0;
        while(set.contains(sum+updation)){
            updation++;
        }
        return sum+updation;
        
    }
}
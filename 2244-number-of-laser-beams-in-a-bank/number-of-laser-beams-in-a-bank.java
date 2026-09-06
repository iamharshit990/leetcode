class Solution {
    public int count(String s){
        int one =0;
        for(char c:s.toCharArray()){
            if(c=='1') one++;
        }
        return one;


    }
    public int numberOfBeams(String[] bank) {
        int arr[] = new int[bank.length];
        for(int i=0;i<bank.length;i++){
            arr[i] = count(bank[i]);
        }
        int ans = 0;
        int i=0;
        int j=i+1;
        while(j<arr.length){
            if(arr[j]==0) j++;
            else {
                if(arr[i]>0)ans+=(arr[i]*arr[j]);
                i=j;
                j++;
            }
            
        }
        return ans;

        
    }
}
class Solution {
    public int count(int arr[]){
        int sum=0;
        for(int i:arr){
            sum+=i;
        }
        return sum;
    }
    public int maximumWealth(int[][] accounts) {
        int ans=0;
        for(int i=0;i<accounts.length;i++){
            ans=Math.max(ans,count(accounts[i]));
        }
        return ans;

        
    }
}
class Solution {
    public int maxProfit(int[] prices) {
        //brute is n2
        // this is sub optimal O(n) and space O(n)
        int[] right= new int[prices.length];
        right[right.length-1]=prices[prices.length-1];
        for(int i=prices.length-2;i>=0;i--){
            right[i]=Math.max(prices[i],right[i+1]);
        }
        int ans=0;
        for(int i=0;i<prices.length;i++){
            int curr = right[i] - prices[i];
            ans=Math.max(ans,curr);

        }
        return ans;
    }
}
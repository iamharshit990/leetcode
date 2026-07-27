class Solution {
    public int maxProfit(int[] prices) {
      //optimal2
      if(prices.length==1) return 0;
      int min = prices[0];
      int  ans=0;
      for(int i=1;i<prices.length;i++){
        int curr= prices[i]-min;
        ans=Math.max(ans,curr);
        min=Math.min(prices[i],min);
      }
      return ans;

        
    }
}
class Solution {
    public int largestAltitude(int[] gain) {
        int ans=0;
        int currsum=0;
        for(int i:gain){
            currsum+=i;
            ans=Math.max(currsum,ans);
        }
        return ans;
        
    }
}
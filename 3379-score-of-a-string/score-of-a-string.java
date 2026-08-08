class Solution {
    public int scoreOfString(String s) {
        int low=0;
        int high=1;
        int ans=0;
        while(high<s.length()){
            ans+=Math.abs((int)s.charAt(low)-(int)s.charAt(high));
            low++;
            high++;
        }
        return ans;
        
    }
}